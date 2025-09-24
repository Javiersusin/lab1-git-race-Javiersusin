# Lab 1 Git Race -- Project Report

## Description of Changes
He añadido las siguientes funcionalidades:
1.   Saludo dinámico según la hora del día
2.   Selección de modo claro/oscuro
3.   LocalStorage que permite guardar preferencias sobre el punto anterior de un usuario. Así al recargar la página no pierde su visualización favorita.
4.   Endpoint nuevos de estadísticas e historial, tanto la definición de api como su visualización en el html.

## Technical Decisions
 Una de las decisiones importantes fue forzar en el nuevo dark.css con !important la aplicación del css en cuestión sobre el bootstrap.
 Otra decisión fue hacer uso de localStorage como herramienta para guardar las preferencias visuales en la sesión del usuario.

## Learning Outcomes

He apredido a modificar los test con la premisa contains, de esta forma pude pasarlos al cambiar el saludo.
Y aunque finalmente no lo he incluido, practiqué también sobre el como limitar a una IP el uso abusivo de las apis de la aplicación.
Además he aprendido a gestionar correctamente el localStorage y comprobar su funcionamiento desde la herramienta inspeccionar.
## AI Disclosure
### AI Tools Used
- ChatGPT
### AI-Assisted Work
 He utiliado ChatGPT a modo de consulta sobre dudas de sintaxis o sobre donde obtener información.
### Original Work
 Sin la IA y fijándome en lo anterior he hecho todas las modificaciones en el html, y en el http-debug.js. Esto lo he hecho siguiendo lo ya escrito.
 Para el modo claro oscuro me apoyé en la IA para no redactar el .css de 0 ya que era un trabajo más largo aunque no complicado.
  Y el localStorage lo había usado ya en otras asignaturas y me he apoyado de ese código. Por último para el trabajo en las apis de saludo, estadísticas e historial, he usado el código ya dado y modificado lo necesario.