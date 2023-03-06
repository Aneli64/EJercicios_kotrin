package ejercicios_practica_internet.ejs_Herencia.ej3.clases

import ejercicios_practica_internet.ejs_Herencia.ej3.Monstruo

class Licantropo(): Monstruo() {
    var forma: String = ""
        set(value) {
            if (forma in listOf("lobo", "humana")) field = value
            else print("forma no valida")
        }
    override fun atacar(monstruo: Monstruo): Int {
        return if(forma == "lobo") poderDeAtaque else poderDeAtaque/2
    }

    override fun toString(): String {
        return "Licantropo('poder de ataque = $poderDeAtaque', 'forma='$forma')"
    }

    constructor(poderDeAtaque: Int, forma: String) :this()
    {
        super.poderDeAtaque = poderDeAtaque
        this.forma = forma
    }
}