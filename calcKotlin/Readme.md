
# Calculadora Científica en Kotlin

Este proyecto es una Calculadora Científica desarrollada en Kotlin utilizando JavaFX para la interfaz gráfica. 
La aplicación permite realizar operaciones matemáticas básicas y avanzadas como sumas, restas, multiplicaciones, 
divisiones, así como funciones trigonométricas, logarítmicas y operaciones con memoria.

---

## Descripción de Archivos

### 1. `Calculadora.kt`
Contiene la clase `Calculadora`, que implementa las operaciones básicas:

- **sumar**: Realiza la suma de dos números.
- **restar**: Realiza la resta de dos números.
- **multiplicar**: Realiza la multiplicación de dos números.
- **dividir**: Realiza la división entre dos números, y maneja la excepción para evitar divisiones por cero.

### 2. `CalculadoraController.kt`
Controlador de la aplicación que gestiona la interfaz y los eventos de usuario. Incluye:

- **Método para insertar números y operadores**: Permite al usuario insertar valores en pantalla.
- **Calcular resultado**: Evalúa la expresión en pantalla usando la biblioteca `exp4j`, que soporta:
  - **Funciones trigonométricas** (`sin`, `cos`, `tan`).
  - **Logaritmos** (`log` y `ln`).
  - **Operaciones de potencia y raíz**.
- **Manejo de memoria**: Incluye opciones para almacenar, recuperar y limpiar un valor en memoria.

### 3. `MainApp.kt`
Punto de entrada de la aplicación. Carga la interfaz de usuario desde `calculadora.fxml` y configura la ventana principal.

---

## Instalación y Ejecución
1. Clona el repositorio o descarga los archivos del proyecto.
2. Navega a la carpeta del proyecto: 

   ```bash
   cd calcKotlin\out\artifacts\calculadora_jar
 
   ```
3. Ejecutar el archivo calculadora.jar que se encuentra en la anterior ruta.
### Requisitos Previos
- Tener **Kotlin** y **JavaFX** configurados en el entorno de desarrollo.
- Biblioteca `exp4j` para la evaluación de expresiones matemáticas.

### Pasos para Ejecutar
1. **Clonar el repositorio**.
2. **Compilar el proyecto** asegurándose de incluir las dependencias necesarias para JavaFX y `exp4j`.
3. Ejecutar la clase `MainApp.kt` como aplicación principal.

---

## Uso de la Calculadora

- **Operaciones Básicas**: Suma (`+`), resta (`-`), multiplicación (`*`) y división (`/`).
- **Funciones Trigonométricas**: `sin`, `cos`, `tan`.
- **Funciones Logarítmicas**: `log` (base 10), `ln` (logaritmo natural).
- **Funciones Avanzadas**:
  - **Raíz cuadrada**: Usar `sqrt`.
  - **Exponencial**: Usar `exp`.
- **Manejo de Memoria**: Permite guardar, recuperar y limpiar valores almacenados en memoria.

---



## Excepciones y Manejo de Errores

La calculadora está diseñada para manejar excepciones comunes, como la división por cero y expresiones malformadas. En caso de error, muestra un mensaje de "Error Matemático" en pantalla.

---

## Contribuciones

Para contribuir a este proyecto:

1. Crea una rama nueva para tus modificaciones.
2. Envía un **pull request** con una descripción detallada de las modificaciones realizadas.
3. El equipo revisará tus cambios y se comunicará contigo para discutir la integración.

---

## Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.

---

¡Gracias por contribuir y utilizar la Calculadora Científica en Kotlin!
