package ejercicios_practica_internet.ejs_Herencia.ej3.clases

import ejercicios_practica_internet.ejs_Herencia.ej3.Monstruo

class Vampiro(): Monstruo() {
    override fun atacar(monstruo: Monstruo): Int {
        return if(monstruo != Vampiro()) poderDeAtaque else poderDeAtaque/2
    }

    override fun toString(): String {
        return "Vampiro(poder de ataque = $poderDeAtaque)"
    }

    constructor(poderDeAtaque: Int) : this()
    {
        super.poderDeAtaque = poderDeAtaque
    }
}