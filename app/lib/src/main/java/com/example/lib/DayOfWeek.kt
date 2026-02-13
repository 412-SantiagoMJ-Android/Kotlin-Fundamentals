package com.example.lib

fun main() {
    /*
     * Escribir un programa que me muestre en consola los días de la semana
     * Y si es sábado o domingo que escriba Fin de semana
     * */
    val dayOfTheWeek = 2
    when (dayOfTheWeek) {
        1 -> println("Es lunes")
        2 -> {
            println("Es martes")
            println("Haciendo más cositas")
        }
        3 -> println("Es miércoles")
        4 -> println("Es jueves")
        5 -> println("Es viernes")
        6, 7 -> println("Es fin de semana")
        else -> println("No es un día de la semana")
    }

}