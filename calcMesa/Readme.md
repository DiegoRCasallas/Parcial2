# Descripción de Archivos

## 1. Paquete Principal `calcMesa/`
Este es el paquete principal que contiene la lógica del sistema.

- **`__init__.py`**: Archivo vacío que define el paquete.
- **`agents.py`**: Contiene las definiciones de los agentes para cada operación aritmética.
- **`io_agent.py`**: Implementa el agente Entrada/Salida que maneja la entrada del usuario y la distribución de operaciones.
- **`model.py`**: Define el modelo de la calculadora y gestiona los agentes.
- **`utils.py`**: (Opcional) Funciones auxiliares que pueden ser utilizadas en el proyecto.

## 2. Archivo de Dependencias `requirements.txt`
Este archivo contiene las dependencias necesarias para ejecutar el proyecto. Incluye `mesa`, que es la librería utilizada para la implementación del paradigma de agentes.

## 3. Documentación `README.md`
Este documento proporciona información sobre el propósito y funcionamiento del proyecto.

## 4. Archivo Principal `main.py`
Este archivo inicia la calculadora y permite la interacción del usuario.

# Requisitos

Para ejecutar este proyecto, asegúrate de tener instalado Python (3.7 o superior) y `pip`. Las dependencias del proyecto están definidas en el archivo `requirements.txt`.

## Instalación

1. Clona el repositorio o descarga los archivos del proyecto.
2. Navega a la carpeta del proyecto:

   ```bash
   cd calcMesa
   ```

3. Instala las dependencias necesarias:

   ```bash
   pip install -r requirements.txt
   ```

# Ejecución

Para ejecutar la calculadora, utiliza el siguiente comando:

```bash
python3 main.py
```

Se te pedirá que ingreses una expresión matemática. Escribe la expresión y presiona **Enter**. La calculadora procesará la entrada y mostrará el resultado.

## Ejemplo de Uso:

```
Ingrese una expresión matemática (o 'exit' para salir): 2 + 3 * 4 - 5
Resultado: 9
```
