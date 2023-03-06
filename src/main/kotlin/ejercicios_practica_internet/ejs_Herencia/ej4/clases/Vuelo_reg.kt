package ejercicios_practica_internet.ejs_Herencia.ej4.clases

import ejercicios_practica_internet.ejs_Herencia.ej4.Vuelo

class Vuelo_reg(): Vuelo() {
    private var ciudadesList: List<String> = listOf()
    constructor(listaAsientos: MutableList<Int>, ciudadesList: List<String>, numVuelo: Int, fechaSalida: String, horaSalida: Int, fechaLlegada: String, horaLlegada: Int, aeropOrig: String, aeropDest: String) : this() {
        this.listaAsientos = listaAsientos
        this.ciudadesList = ciudadesList
        super.numVuelo = numVuelo
        super.fechaSalida = fechaSalida
        super.horaSalida = horaSalida
        super.fechaLlegada = fechaLlegada
        super.horaLlegada = horaLlegada
        super.aeropOrig = aeropOrig
        super.aeropDest = aeropDest
    }
}