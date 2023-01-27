package ejercicios_Clase.practica.POO

import kotlin.random.Random

/*
 Dentro del paquete juegos implementa una nueva clase Mano. Esta clase representa a  una mano de varias cartas para simular un juego de cartas.
 Por tanto como atributos  tendrá un entero tamaño que indica el número de cartas y 3 cartas. Esta clase deberá  contener los principios básicos de encriptación y ocultación.
Además de definir los atributos indicados, habrá que implementar:
- Un constructor por defecto que inicialice el tamaño a 3 y cree las cartas por  defecto.
- Un método obtenerTamaño que devuelva el tamaño de la mano.
- Un método mostrarCarta(int posición) que reciba como argumento cual de las tres  cartas se quiere mostrar y que muestre la carta indicada por pantalla.
- Un método actualizarCarta(int posición,Carta) que reciba como argumento cual de las tres cartas  se quiere modificar.
- Un método pedirMano() que pida los valores necesarios para todas las  cartas de la mano.
-pedriCarta() añade una carta nueva
- Un método mostrarMano() que muestre por pantalla todas las cartas de la  mano.
- Un método mano ganadora que compare la mano que llama al método con  la recibida como parámetro.
Este método indicará por pantalla quien a  ganado si la primera o la segunda además de mostrar sus cartas. Para esto  sumara los números de las cartas de cada mano ganando el mayor.

En caso de empate se mirará quien tiene más cartas rojas (corazones y rombos) en  caso de seguir empatando se dirá que se ha producido un empate y se  mostraran ambas manos.
- Crear una clase Partida dentro del paquete juego que cree dos manos por  defecto y pida las cartas para jugar. Después comprobará que mano es la  ganadora.
 */

class Mano(private val num_cartas: Int = 3, var listaCartas: MutableList<String>) {
    override fun toString(): String {
        return "Mano(num_cartas=$num_cartas, listaCartas=$listaCartas)"
    }

    fun obtenerTamaño() = num_cartas
    fun mostrarCarta(posCarta: Int) = listaCartas[posCarta]
    fun actualizarCarta(posCarta: Int, nuevaCarta: String) {
        listaCartas[posCarta] = nuevaCarta
    }
    fun pedirMano() = listaCartas //??
    fun pedirCarta(nuevaCarta: String) = listaCartas.add(nuevaCarta)
    fun mostrarMano() = listaCartas

    fun manoGanadora(manoRival : Mano)
    {
        if (this.listaCartas.max() > manoRival.listaCartas.max())
        {
            "Jugador1 ganador, Mano -> ${this.listaCartas}"
        }
        if (this.listaCartas.max() == manoRival.listaCartas.max())
        {
            var contRojJ1 = 0
            var contRojJug2 = 0

            var splitManoJ1 = mutableListOf<String>()
            var splitManoJ2 = mutableListOf<String>()

            //for(item in splitManoJ1) if (item[2])
        }
        else
        {
            "Jugador2 ganador, Mano -> ${manoRival.listaCartas}"
        }
    }


}

fun main() {
    val cartas = mutableListOf<String>()
    for (i in 1..49) {
        when {
            i in 1..12 -> cartas.add("$i de corazones")
            i in 13..24 -> cartas.add("${i - 12} de picas")
            i in 25..36 -> cartas.add("${i - 24} de rombos")
            i in 37..48 -> cartas.add("${i - 36} de treboles")
        }
    }

    var cartasMano = mutableListOf<String>()
    while (cartasMano.size < 3) {
        var addRand = cartas.random()
        if (addRand in cartas) {
            cartas.remove(addRand)
            cartasMano.add(addRand)
        }
    }

    var ej = Mano(3, cartasMano)
    println(ej)
    println(cartas)


}