# Lab 1 Git Race -- Project Report

## Description of Changes
[Detailed description of all changes made]

## Technical Decisions
[Explanation of technical choices made]

## Learning Outcomes
[What you learned from this assignment]
Lo primero de todo es que para compilar y ejecutar, estoy usando la terminal Git Bash. Esto me ha supuesto tener que aplicar : 'dos2unix gradlew'
 para poder convertir el tipo de saltos de linea de Windows al usado en Unix, y poder así ejecutar el comando de docker : 'docker-compose -f docker-compose.dev.yml up --build'

## AI Disclosure
### AI Tools Used
- [List specific AI tools used]

### AI-Assisted Work
- [Describe what was generated with AI assistance]
- [Percentage of AI-assisted vs. original work]
- [Any modifications made to AI-generated code]
He usado ChatGPT para preguntarle con que libreria trabajar para limitar el uso de las funciones segun las peticiones a una API desde un mismo punto. para esto me recomendó añadir a las dependencias la línea :     implementation("com.github.vladimir-bukhtoyarov:bucket4j-core8.4.0")
. Y una vez puesta simplemente queda hacer un ./gradlew build. Tuve un problema y es que ChatGPT me había dado una versión sin publicar de esa libreria, así que tras un tiempo perdido busqué cuales lo estaban y cambié a la 7.6.0.
- 

### Original Work
- [Describe work done without AI assistance]
- [Your understanding and learning process]