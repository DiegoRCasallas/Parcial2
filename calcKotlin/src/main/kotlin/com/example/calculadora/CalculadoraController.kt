package com.example.calculadora

import javafx.fxml.FXML
import javafx.scene.control.TextField
import javafx.scene.control.Button
import javafx.event.ActionEvent
import net.objecthunter.exp4j.ExpressionBuilder
import net.objecthunter.exp4j.function.Function

class CalculadoraController {

    @FXML
    private lateinit var pantalla: TextField

    // Método para insertar números y operadores en la pantalla
    @FXML
    fun insertarNumero(event: ActionEvent) {
        val boton = event.source as Button
        pantalla.text += boton.text
    }
    fun insertarCalv(event: ActionEvent) {
        val boton = event.source as Button
        pantalla.text += "👴"
    }

    // Método para manejar operadores aritméticos (+, -, *, /)
    @FXML
    fun manejarOperacionAritmetica(event: ActionEvent) {
        val boton = event.source as Button
        pantalla.text += boton.text
    }

    // Método para calcular el resultado de la expresión completa
    @FXML
    fun calcularResultado() {
        try {
            val expresion = pantalla.text

            val sinFunction = object : Function("sin", 1) {
                override fun apply(vararg args: Double): Double {
                    return Math.sin(args[0])
                }
            }

            val cosFunction = object : Function("cos", 1) {
                override fun apply(vararg args: Double): Double {
                    return Math.cos(args[0])
                }
            }

            val tanFunction = object : Function("tan", 1) {
                override fun apply(vararg args: Double): Double {
                    return Math.tan(args[0])
                }
            }

            val logFunction = object : Function("log", 1) {
                override fun apply(vararg args: Double): Double {
                    return Math.log10(args[0])
                }
            }

            val lnFunction = object : Function("ln", 1) {
                override fun apply(vararg args: Double): Double {
                    return Math.log(args[0])
                }
            }

            // Usamos la librería exp4j para evaluar la expresión
            val resultado = ExpressionBuilder(expresion)
                .function(sinFunction)
                .function(cosFunction)
                .function(tanFunction)
                .function(logFunction)
                .function(lnFunction)
                .build()
                .evaluate()

            // Mostramos el resultado en la pantalla
            pantalla.text = resultado.toString()

        } catch (e: Exception) {
            pantalla.text = "Error Matemático"
        }
    }

    
    @FXML
    fun manejarFuncionTrigonometrica(event: ActionEvent) {
        val boton = event.source as Button
        pantalla.text += boton.text + "("
    }

   
    @FXML
    fun calcularRaiz() {
        pantalla.text += "sqrt("
    }

    
    @FXML
    fun manejarPotencia() {
        pantalla.text += "^"
    }

    
    @FXML
    fun calcularLogaritmoBase10() {
        pantalla.text += "log("
    }

    
    @FXML
    fun calcularLogaritmoNatural() {
        pantalla.text += "ln("
    }

    
    @FXML
    fun calcularExponencial() {
        pantalla.text += "exp("
    }

    
    @FXML
    fun borrarPantalla() {
        pantalla.text = ""
    }

    
    private var memoria: Double? = null

    @FXML
    fun memoriaGuardar() {
        try {
            memoria = pantalla.text.toDouble()
        } catch (e: Exception) {
            pantalla.text = "Error"
        }
    }

    @FXML
    fun memoriaRecuperar() {
        memoria?.let {
            pantalla.text = it.toString()
        }
    }

    @FXML
    fun memoriaLimpiar() {
        memoria = null
    }
}
