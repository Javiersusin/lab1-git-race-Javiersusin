package es.unizar.webeng.hello.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.Instant
import java.time.LocalDateTime
import java.util.concurrent.CopyOnWriteArrayList

@Controller
class HelloController(
    @param:Value("\${app.message:Hello World}")
    private val message: String
) {

    @GetMapping("/")
    fun welcome(
        model: Model,
        @RequestParam(defaultValue = "") name: String
    ): String {
        val greeting = if (name.isNotBlank()) "Hello, $name!" else message
        model.addAttribute("message", greeting)
        model.addAttribute("name", name)
        return "welcome"
    }
}
data class Greeting(val message: String, val name: String, val timestamp: String)

@RestController
class HelloApiController {
    private val history = CopyOnWriteArrayList<Greeting>() // Queda así definido el historial en memoria de saludos

    @GetMapping("/api/hello", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun helloApi(@RequestParam(defaultValue = "World") name: String): Map<String, String> {
        val actualHour = LocalDateTime.now().hour
        val hello = when (actualHour) {
            in 7..13 -> "Good Morning"
            in 14..21 -> "Good Afternoon"
            else -> "Good Night"
        }
        val message = "$hello, $name!" // Ahora lo dejamos como variables y luego haremos el return una vez guardado
        val timestamp = Instant.now().toString()

        // Guardamos en historial
        history.add(Greeting(message, name, timestamp))

        return mapOf(
            "message" to message,
            "timestamp" to timestamp
        )
    }

    // Nos permite ver historial
    @GetMapping("/api/history", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getHistory(): List<Greeting> = history

    // Permite ver estadísticas básicas; total de saludos, nombres más populares y usurios únicos que han accedido
    @GetMapping("/api/stats", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getStats(): Map<String, Any> {
        val total = history.size
        val popularName = history.groupingBy { it.name }.eachCount().maxByOrNull { it.value }?.key ?: "N/A"

        return mapOf(
            "totalGreetings" to total,
            "uniqueUsers" to history.map { it.name }.toSet().size,
            "mostPopularName" to popularName
        )
    }
}
