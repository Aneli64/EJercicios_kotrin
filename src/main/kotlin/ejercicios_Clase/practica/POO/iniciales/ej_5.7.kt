package ejercicios_Clase.practica.POO.iniciales

/*
Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de caballos, el número de puertas y la matrícula.
Crear el constructor del coche, así como los métodos estándar: ¿getters, setters? y toString.
En el programa principal, instancia varios coches, muestra su información, cambia el color a algunos de ellos y vuelve a mostrarlos por pantalla.
 */

class Coche(var color: String, var marca: String, var modelo: String, var n_caballos: Int, var matricula: String)
{
    override fun toString(): String {
        return "Coche(color='$color', marca='$marca', modelo='$modelo', n_caballos=$n_caballos, matricula='$matricula')"
    }
}

fun main()
{
    val twingo = Coche("Gris", "Renault", "Twingo", 2000, "567FDG")
    val ferrari = Coche("Rojo", "Ferrari", "Ferrari Purosangue", 4000, "894LDV")

    ferrari.color = "Verde"
    println(twingo)
    println(ferrari)
}