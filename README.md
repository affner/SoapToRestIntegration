# SoapToRestIntegration

## Descripción
**SoapToRestIntegration** es una un ejemplo de middleware diseñada para facilitar la integración entre servicios SOAP y REST, permitiendo la conversión y manejo de peticiones entre estos dos tipos de servicios web. Este proyecto se centra en proporcionar una capa intermedia que transforma las peticiones SOAP en llamadas REST y viceversa, asegurando que la comunicación entre distintos sistemas sea fluida y eficiente.

## Características Principales
- **Transformación de Peticiones:** Capacidad para convertir peticiones SOAP en llamadas REST y procesar las respuestas de vuelta al formato original.
- **Manejo de Errores:** Gestión integrada de errores para garantizar que cualquier fallo en la comunicación sea manejado de manera adecuada, proporcionando respuestas claras y útiles.
- **Seguridad y Confiabilidad:** Implementa prácticas estándar de seguridad para asegurar que las transacciones sean seguras.

## Tecnologías Utilizadas
- Spring Boot
- JAXB para el manejo de XML
- Maven para la gestión de dependencias y construcción del proyecto

## Cómo Empezar
Para utilizar **SoapToRestIntegration**, necesitas tener instalado Java y Maven en tu máquina. Sigue estos pasos para obtener el código fuente y preparar el entorno de ejecución:

1. **Clonar el Repositorio:**
   ```bash
   git clone [URL del repositorio]
   cd SoapToRestIntegration

2. **Compilación y Empaquetado:**

   Ejecuta el siguiente comando en la raíz del proyecto para compilar el código y crear el paquete del proyecto:
   ```bash
   mvn clean package
   ```
   Este comando compilará el código, ejecutará las pruebas, y generará un archivo JAR ejecutable en el directorio target.

3. **Despliegue:**
   Una vez construido el proyecto, puedes desplegar el archivo JAR generado en cualquier servidor o ambiente que soporte aplicaciones Java:
   ```bash
   java -jar target/integrationplay-0.1.0.jar
