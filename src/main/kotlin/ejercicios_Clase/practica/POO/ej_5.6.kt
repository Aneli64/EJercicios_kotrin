package ejercicios_Clase.practica.POO
/*
Crear una clase Rectángulo, con atributos base y altura. Con  métodos para calcular el área y el perímetro.
Opcionalmente se puede crear el método print y toString para mostrar información sobre el rectángulo.
En el programa principal, crear varios rectángulos y mostrar por pantalla sus áreas y perímetros.
 */

class Rectangulo(var base:Double, var altura: Double)
{
    fun area() = base * altura
    fun perimetro() = (2 * base) + (2 * altura)
}

fun main()
{
    var ej = Rectangulo(5.0, 6.0)
    print(ej.area())
    print(ej.perimetro())
}