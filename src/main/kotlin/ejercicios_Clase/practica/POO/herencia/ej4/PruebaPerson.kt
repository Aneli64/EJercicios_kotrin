package ejercicios_Clase.practica.POO.herencia.ej4

class PruebaPerson {
    fun prueba()
    {
        val persona = Person(450, 130, "Elian", "Deniz")
        println(persona.getName())
        println(persona.computeTotalWealth())
    }
}

fun main()
{
    val ej = PruebaPerson()
    ej.prueba()
}