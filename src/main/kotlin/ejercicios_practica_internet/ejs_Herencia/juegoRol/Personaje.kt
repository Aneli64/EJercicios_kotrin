package ejercicios_practica_internet.ejs_Herencia.juegoRol

abstract class Personaje: Combate {

    abstract var nombre: String
    abstract var vida: Int
    abstract var escudo: Int
    abstract var tipoArma: Arma

    override fun atacar(): Int {
        return if (tipoArma.durabilidad >= 1) tipoArma.danio else 0
    }
    override fun defender() = vida + escudo //mirar que el escudo se vaya reduciendo y luego pase a quitar vida
}