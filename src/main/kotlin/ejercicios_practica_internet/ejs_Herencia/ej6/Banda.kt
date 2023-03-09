package ejercicios_practica_internet.ejs_Herencia.ej6

class Banda(var listaMusicos: MutableList<Musico>, var listaInstrum: MutableList<InstrumentoMusical>) {

    fun agregarMusico(musico: Musico) = listaMusicos.add(musico)
    fun agregarInstrum(instrument: InstrumentoMusical) = listaInstrum.add(instrument)

    fun tocar(instrument: InstrumentoMusical)
    {
        listaMusicos.forEach { it }
    }
}