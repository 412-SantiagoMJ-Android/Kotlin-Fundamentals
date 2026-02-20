package com.example.lib

class Person(val name: String, val age: Int){ //CON LOS PARÉNTESIS ES SUFICIENTE EN KOTLIN
    /*Así lo hacíamos normalmente en Java:
    public Int age;
    public String name;

    public Person(Int age, String name){
        this.age = age;
        this.name = name;
    }
    * */

    //creando un método
    fun sayHello(){
        if(language == "Spanish"){
            println("Hola soy $name y tengo $age años")
        }
        else{
            println("Hello my name is $name and I'm $age years old")
        }
    }

    fun caminar() : Double{
        return 10.0
    }

}

abstract class Shape{ //en una clase abstracta no se puede inicializar el objeto.
    //unicamente se utiliza para definir las caracteristicas, y ya en otra clase defines los
    //metodos
    abstract fun calculateArea() : Double

}

//polimorfismo en las siguientes dos clases.
// dos clases diferentes pero se comportan igual
//extends cuando heredas, implements cuando extraes
class Square(val side: Double) : Shape(){
    override fun calculateArea() : Double {
        return side * side
    }
}

//encapsulamiento. haciendo la variable privada.
class Circle(private val radius: Double) : Shape(){
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

fun main(){
    val person = Person("Santiago Martínez", 19)
    val person2 = Person(age = 19, name = "Danna Anda")
    // val figura = Shape() --> ESTO DA ERROR PORQUE LAS CLASES
// ABSTRACTAS NO SE PUEDEN INSTANCIAR!!!
    println(square.side)
    //println(circle.radius) --> esto da error porque el radio es PRIVADO!! (ENCAPSULAMIENTO)
}