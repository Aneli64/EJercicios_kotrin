package ejercicios_practica_internet.ejs_varios.minijuegos.juegoRol

abstract class Personaje : Defensa {

    abstract var nombre: String
    abstract var vida: Int
    abstract var escudo: Int

    override fun defender() = vida + escudo //mirar que el escudo se vaya reduciendo y luego pase a quitar vida
    override fun toString(): String {
        return "Personaje(nombre='$nombre', vida=$vida, escudo=$escudo)"
    }
}