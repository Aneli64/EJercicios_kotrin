package ejercicios_practica_internet.ejs_Herencia.ej4.clases

import ejercicios_practica_internet.ejs_Herencia.ej4.Vuelo

class Vuelo_intern() : Vuelo() {
    private var paisesList: List<String> = listOf()
    constructor(listaAsientos: MutableList<Int>, paisesList: List<String>, numVuelo: Int, fechaSalida: String, horaSalida: Int, fechaLlegada: String, horaLlegada: Int, aeropOrig: String, aeropDest: String) : this() {
        this.listaAsientos = listaAsientos
        this.paisesList = paisesList
        super.numVuelo = numVuelo
        super.fechaSalida = fechaSalida
        super.horaSalida = horaSalida
        super.fechaLlegada = fechaLlegada
        super.horaLlegada = horaLlegada
        super.aeropOrig = aeropOrig
        super.aeropDest = aeropDest
    }

}