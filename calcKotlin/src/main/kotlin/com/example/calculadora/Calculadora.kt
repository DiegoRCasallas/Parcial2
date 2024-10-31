package com.example.calculadora

open class Calculadora {

    @Throws(ArithmeticException::class)
    fun sumar(a: Double, b: Double): Double = a + b

    @Throws(ArithmeticException::class)
    fun restar(a: Double, b: Double): Double = a - b

    @Throws(ArithmeticException::class)
    fun multiplicar(a: Double, b: Double): Double = a * b

    @Throws(ArithmeticException::class)
    fun dividir(a: Double, b: Double): Double {
        if (b == 0.0) throw ArithmeticException("División por cero")
        return a / b
    }
}