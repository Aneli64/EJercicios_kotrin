package ejercicios_practica_internet.ejs_Herencia.ej4

import ejercicios_practica_internet.ejs_Herencia.ej4.clases.Tripulante

abstract class Vuelo: Reservable {
    var numVuelo: Int = 0
    var fechaSalida: String = ""
    var horaSalida: Int = 0
    var fechaLlegada: String = ""
    var horaLlegada: Int = 0
    var aeropOrig: String = ""
    var aeropDest: String = ""

    var listaAsientos: MutableList<Int> = mutableListOf()
    override fun reservarAsiento(asiento: Int): Boolean {
        return if (asiento in listaAsientos) {
            listaAsientos.remove(asiento)
            true
        } else false
    }

    fun agregarTripulante(tripulante: Tripulante) {

    }
    fun eliminarTripulante(tripulante: Tripulante) {

    }
}