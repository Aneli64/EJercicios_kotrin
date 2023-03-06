package ejercicios_practica_internet.ejs_Herencia.ej3

import ejercicios_practica_internet.ejs_Herencia.ej3.clases.Licantropo
import ejercicios_practica_internet.ejs_Herencia.ej3.clases.Vampiro
import ejercicios_practica_internet.ejs_Herencia.ej3.clases.Zombie

class ArenaDeMonstruos(monstruos: MutableList<Monstruo>) {
    fun pelear(listMons: MutableList<Monstruo>): String {
        val m1 = listMons.random()
        val m2 = listMons.random()

        return if(m1.atacar(m2) > m2.atacar(m1)) "gana $m1" else "gana$ m2"
    }
}

fun main()
{
    val m1 = Zombie()
    val m2 = Vampiro()
    val m3 = Licantropo()
    val listaM = mutableListOf(m1,m2,m3)
    val ej1 = ArenaDeMonstruos(listaM)
}