package ejercicios_practica_internet.ejs_Herencia.ej6.clases

import ejercicios_practica_internet.ejs_Herencia.ej6.InstrumentoMusical
import ejercicios_practica_internet.ejs_Herencia.ej6.Musico
import ejercicios_practica_internet.ejs_Herencia.ej6.Tocable

class Guitarra(): InstrumentoMusical(){
    constructor(nombre: String, tipo: String, afinacion: String) : this()
    {
        super.nombre = nombre
        super.tipo = tipo
        super.afinacion = afinacion
    }
}