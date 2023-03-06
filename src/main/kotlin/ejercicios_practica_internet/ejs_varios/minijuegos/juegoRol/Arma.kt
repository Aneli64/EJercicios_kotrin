package ejercicios_practica_internet.ejs_varios.minijuegos.juegoRol

abstract class Arma(): Ataque {
    abstract var nombre: String
    abstract var danio: Int
    abstract var danioVenen: Int
    abstract var durabilidad: Int

    override fun atacar(): Int {
        return if (durabilidad >= 1) danio else 0
    }

    override fun toString(): String {
        return "Arma(nombre='$nombre', danio=$danio, danioVenen=$danioVenen, durabilidad=$durabilidad)"
    }
}