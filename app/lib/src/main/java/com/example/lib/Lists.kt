package com.example.lib

fun main(){
    /*
    * Dada una lista de numeros desordenados, encuentra e imprime cual es el
    * numero mas grande SIN usar la funcion MAX
    * */
    val numbers = listOf(1,5,4,3,2,6,7,8,9,10,23,23,12,34,54,3,5,8)
    var maxNumber = numbers[0]
    for(number in numbers){
        if (number > maxNumber){
            maxNumber = number
        }

        //quiero incrementar
        //si el numero es mas grande que el anterior, asignar la variable con el nuevo numero
    }
    println("El numero mas grande es =  $maxNumber")
}

