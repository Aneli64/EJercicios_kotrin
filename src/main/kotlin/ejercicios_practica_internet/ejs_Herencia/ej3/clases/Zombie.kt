package ejercicios_practica_internet.ejs_Herencia.ej3.clases

import ejercicios_practica_internet.ejs_Herencia.ej3.Monstruo

class Zombie(): Monstruo() {
    override fun atacar(monstruo: Monstruo) = poderDeAtaque
    override fun toString(): String {
        return "Zombie(poder de ataque = $poderDeAtaque)"
    }

    constructor(poderDeAtaque: Int) : this()
    {
        super.poderDeAtaque = poderDeAtaque
    }
}