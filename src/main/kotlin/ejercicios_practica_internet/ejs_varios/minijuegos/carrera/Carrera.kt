package ejercicios_practica_internet.ejs_varios.minijuegos.carrera

class Carrera(private var jugadores: Int) {

    private val listaJug = mutableListOf<Kart>()
    var rondas = 6
    val longitudCarrera = 100

    init {

        val nombres = listOf("Mario", "Luigui", "Peach", "Bowser")
        val velocidades = listOf(7, 6, 5, 8)
        val probCritcs = listOf(3, 4, 2, 1)
        for (i in 0..jugadores) {
            listaJug.add(Kart(nombres.random(), velocidades.random(), probCritcs.random()))
        }
    }

    fun jugadores() = listaJug.toList()
    fun carrera() {
        var recorridoActualJug = mutableListOf<Int>()
        while(!listaJug.any { aceleraJugador(it) >= longitudCarrera }){
            listaJug.forEach { aceleraJugador(it) }
        }

        print("Jugador ganador!")
    }
    fun aceleraJugador(jugador: Kart): Int{
        var recorrido = 0
        recorrido += jugador.velocidad
        if ((0..10).random() == jugador.probAcelCrit){
            recorrido += jugador.velocidad
            println("¡Jugador aceleró doble debido a su prob crítica!")
        }
        println("${jugador.nombre} aceleró un total de $recorrido!")
        return recorrido
    }
}

fun main() {
    val c1 = Carrera(4)
    println(c1.jugadores())
    println(c1.carrera())

}