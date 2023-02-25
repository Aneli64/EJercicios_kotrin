package ejercicios_Clase.practica.POO.herencia.ej5

/*
Escribir el método main de la clase PruebaLinea

Crea dos líneas con puntos pedidos del usuario y muestra si son iguales de longitud y cual es mayor

Ejecutar el programa
 */
class PruebaLinea {
    fun prueba()
    {
        val p1 = Line(8.0, 12.0, 16.0, 4.0)
        val p2 = Line(12.0, 15.0, 3.0, 7.0)

        if (p1.isEqual(p2)) println("Son iguales") else println("No son iguales")
        if (p1.isGreater(p2)) println("Es mayor") else println("No es mayor")
    }
}

fun main()
{
    val p = PruebaLinea()
    p.prueba()

}