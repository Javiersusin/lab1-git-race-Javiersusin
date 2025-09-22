# Lab 1 Git Race -- Project Report

## Description of Changes
[Detailed description of all changes made]

## Technical Decisions
[Explanation of technical choices made]

## Learning Outcomes
[What you learned from this assignment]
Lo primero de todo es que para compilar y ejecutar, estoy usando la terminal Git Bash. Esto me ha supuesto tener que aplicar : 'dos2unix gradlew'
 para poder convertir el tipo de saltos de linea de Windows al usado en Unix, y poder así ejecutar el comando de docker : 'docker-compose -f docker-compose.dev.yml up --build'

Los primeros cambios realizados han sido el saludo y el idioma, para el saludo me he dirigido al controlador de saludo de kotlin y he añadido una variable en el mensaje con nombre 'hello'. Esta variable funciona de la siguiente manera :        val actualHour = LocalDateTime.now().hour
entre las 7..13h nos dice "Good Morning", entre las 14..21 -> "Good Afternoon"
y el resto de horas "Good Night". Además he tenido que modificar los ficheros de test, porque todos contenian condicion equalsTo al string del mensaje y ahora he puesto un contains "Good".
## AI Disclosure
### AI Tools Used
- [List specific AI tools used]

### AI-Assisted Work
- [Describe what was generated with AI assistance]
- [Percentage of AI-assisted vs. original work]
- [Any modifications made to AI-generated code]

### Original Work
- [Describe work done without AI assistance]
- [Your understanding and learning process]