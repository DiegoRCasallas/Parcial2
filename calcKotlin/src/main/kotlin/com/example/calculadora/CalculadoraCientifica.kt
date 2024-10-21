package com.example.calculadora


import kotlin.math.*

class CalculadoraCientifica : Calculadora() {

    // Funciones trigonométricas
    fun seno(angulo: Double): Double = sin(Math.toRadians(angulo))
    fun coseno(angulo: Double): Double = cos(Math.toRadians(angulo))
    fun tangente(angulo: Double): Double = tan(Math.toRadians(angulo))

    // Potencias y raíces
    fun potencia(base: Double, exponente: Double): Double = base.pow(exponente)
    fun raiz(numero: Double, indice: Double = 2.0): Double = numero.pow(1.0 / indice)

    // Logaritmos
    fun logaritmoBase10(valor: Double): Double = log10(valor)
    fun logaritmoNatural(valor: Double): Double = ln(valor)

    // Exponencial
    fun exponencial(valor: Double): Double = exp(valor)

    // Conversión de grados a radianes y viceversa
    fun gradosARadianes(grados: Double): Double = Math.toRadians(grados)
    fun radianesAGrados(radianes: Double): Double = Math.toDegrees(radianes)
}
