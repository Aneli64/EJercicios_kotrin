package ejercicios_practica_internet.ejs_Herencia.ej6.clases

import ejercicios_practica_internet.ejs_Herencia.ej6.InstrumentoMusical
import ejercicios_practica_internet.ejs_Herencia.ej6.Musico
import ejercicios_practica_internet.ejs_Herencia.ej6.Tocable

class Baterista() : Musico(), Tocable{

    constructor(nombre: String, edad: Int, listaInstrumentos: MutableList<InstrumentoMusical>) : this()
    {
        super.nombre = nombre
        super.edad = edad
        super.listaInstrumentos = listaInstrumentos
    }

    override fun tocar(musico: Musico) = "pum pum pum pum"
}