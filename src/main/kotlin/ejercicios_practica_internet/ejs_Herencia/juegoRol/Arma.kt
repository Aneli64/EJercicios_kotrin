package ejercicios_practica_internet.ejs_Herencia.juegoRol

abstract class Arma(): Ataque {
    abstract var nombre: String
    abstract var danio: Int
    abstract var danioVenen: Int
    abstract var durabilidad: Int

    override fun atacar(): Int {
        return if (durabilidad >= 1) danio else 0
    }
}