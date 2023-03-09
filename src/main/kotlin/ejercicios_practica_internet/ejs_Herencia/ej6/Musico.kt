package ejercicios_practica_internet.ejs_Herencia.ej6

abstract class Musico() {
    var nombre: String = ""
    var edad: Int = 0
        set(value) {
            if (edad in 0..100) field = value
        }
    var listaInstrumentos = mutableListOf<InstrumentoMusical>()

}