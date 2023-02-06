package ejercicios_Clase.practica.POO.iniciales

/*
Implementa una clase Carta que represente a una carta de una baraja de póker. De
una carta interesa conocer su número y su palo (almacenado como una única letra).

- Un constructor primario y un constructor de copias que copia los campos de una carta a otra.
- Los métodos get que permitan acceder a los atributos.
- Los métodos set que en lugar de recibir los nuevos valores como
argumento, los soliciten por teclado. Se comprobarán que sean válidos y se
volverán a solicitar mientras no lo sean. Para que el número de la carta sea
valido deberá estar entre 1 y 13 y el palo deberá ser una de las siguientes
letras: c,p,r,t que corresponden a corazones, picas, rombos y tréboles.
- Un método mostrarCarta() que muestre por pantalla de que carta se trata
con el siguiente formato: es el <numero> de <palo> donde el número y el
palo corresponden a los atributos de la carta con las siguientes
particularidades:
a) El palo del número deberá mostrarse al completo, es decir
se deberá sustituir la letra del palo por el palo en cuestión.
b) Si el número de la carta está entre 2 y 10 se mostrará
normalmente. Para el resto de los números 1,11,12,13 se
cambiará respectivamente por As, Jack, Reina, Rey .

- Un método comparar(Carta) que reciba una carta como argumento y la
compare con la actual Indicando por pantalla cuál de ellas es la ganadora.
Para esto se comprobará en primer el número, si son distintos ganará la
mayor, si son iguales se compararán los palos, el orden de victoria es
Trébol, Rombos, Picas, Corazones. Si las cartas son iguales se indicará que
hay un empate.
- Un método main en el que se creen 2 cartas, la primera con el constructor
por defecto y se inicialice con los métodos set, la segunda se copiará con el
constructor de copias. Después se mostrarán ambas cartas con el método
mostrarCarta() y se compararán con el método comparar. Después de esto
se modificará la segunda con los métodos set y se volverán a mostrar y
comparar.
 */

class Carta(var numero: Int, var palo: String)
{
init {
    numero in 1..13
    palo in ("c,p,r,t")
}
    fun mostrarCarta():String{
        var paloF = ""
        when(palo)
        {
            "c" -> paloF = "Corazones"
            "p" -> paloF = "Picas"
            "r" -> paloF = "Rombos"
            "t" -> paloF = "Treboles"
        }
        return "es el $numero de $paloF"
    }
    fun comparar(carta: Carta):String{
        when
        {
            carta.numero > this.numero -> if (carta.numero > this.numero) return "Carta menor" else return "Carta mayor"
            carta.numero == this.numero -> if (carta.palo > this.palo) return "Carta menor" else return "Carta mayor"
        }
        return "Cartas iguales"
    }
    override fun toString(): String {
        return "Carta(numero=$numero, palo='$palo')"
    }
}

fun main()
{
    var carta1 = Carta(2, "p")
    var carta2 = Carta(2, "c")

    println(carta1.mostrarCarta())
    println(carta2.mostrarCarta())
    println(carta1.comparar(carta2))
}
































