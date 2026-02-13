package com.example.lib

fun main() {
    //Variables INMUTABLES (no se pueden modificar)
    val name: String = "Juan Frausto"
    //Variables MUTABLES
    var edad = 28
    edad = 29
    println(name)
    println(edad)

    //Constantes
    //const name2 = "Juan"
    edad = 29

    //Calculadora de propinas..
    /**
     * Crea un programa que tenga un precio de comida y un
     * porcentaje de propina. El programa debe imprimir
     * cuánto es de propina y cuánto es el total a pagar
     * */
    val cost = 500.0
    val percentage = 0.15
    val tip = cost * percentage
    val total = cost + tip
    println("El total es $$total")
    println("La propina es $$tip")

}