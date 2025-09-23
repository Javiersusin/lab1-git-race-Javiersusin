# Lab 1 Git Race -- Project Report

## Description of Changes
He añadido las siguientes funcionalidades:
1.   Saludo dinámico según la hora del día
2.   Selección de modo claro/oscuro
3.   LocalStorage que permite guardar preferencias sobre el punto anterior de un usuario. Así al recargar la página no pierde su visualización favorita.
4.   Endpoint nuevos de estadísticas e historial, tanto la definición de api como su visualización en el html.

## Technical Decisions
 Una de las decisiones importantes fue forzar en el nuevo dark.css con !important la aplicación del css en cuestión.
 Otra decisión fue hacer uso de localStorage como herramienta para guardar las preferencias visuales en la sesión del usuario.

## Learning Outcomes

 He aprendido a ver como Fetch API permite interactuar directamente con los endpoints REST y así ver desde el navegador de manera ordenada los datos.
 Además he aprendido a gestionar correctamente el localStorage y comprobar su funcionamiento desde la herramienta inspeccionar.
## AI Disclosure
### AI Tools Used
- ChatGPT
### AI-Assisted Work
 He utiliado ChatGPT a modo de consulta sobre dudas de sintaxis o sobre donde obtener información.
### Original Work
 Sin la IA y fijándome en lo anterior he hecho todas las modificaciones en el html, y en el http-debug.js. Esto lo he hecho siguiendo lo ya escrito.
 Para el modo claro oscuro me apoyé en la IA para no redactar el .css de 0 ya que era un trabajo más largo aunque no complicado.
  Y el localStorage lo había usado ya en otras asignaturas y me he apoyado de ese código.