package ejercicios_practica_internet.ejs_Herencia.ej4.clases

import ejercicios_practica_internet.ejs_Herencia.ej4.Vuelo

class Aeropuerto {
    private var nombre: String = ""
    private var direccion: String = ""
    private var vuelosProg: MutableList<Vuelo> = mutableListOf()

    fun agregarVuelo(vuelo: Vuelo){
        if(vuelo !in vuelosProg) vuelosProg.add(vuelo)
    }
    fun eliminarVuelo(vuelo: Vuelo) {
        if(vuelo in vuelosProg) vuelosProg.remove(vuelo)
    }
}