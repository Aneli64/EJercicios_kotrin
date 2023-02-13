package ejercicios_Clase.practica.POO.herencia

/*
2.1. Desarrolla una clase CartaGenerica que tenga dos atributos, palo como cadena de
texto y número como entero. Además de esto la clase deberá tener los siguientes
métodos:
Un constructor por defecto y otro que reciba los parámetros como argumento
Los métodos get y set de los atributos.
Métodos toString y mostrar carta que muestre por pantalla el siguiente mensaje:
La carta es e<número> de <;palo>
- Desarrolla clase CartaEspaniola que herede de la clase CartaGenerica, esta clase no
contendrá ningún atributo adicional, pero de redefinirán los métodos necesarios para
que los números válidos sean del 1 al 9, 10,11y12 y los palos válidos sean: Oros,
Espadas, Copas y Bastos. Además de esto el método mostrar carta deberá sustituir los
números del 10 al 12 por Sota, Caballo y Rey.
 */

open class CartaGenerica(open var palo: String = "", open var numero: Int = 0) {
    override fun toString(): String {
        return "CartaGenerica(palo='$palo', numero=$numero)"
    }

    open fun mostrarCarta() = "La cara es el $numero de $palo"
}

class CartaEspaniola() : CartaGenerica() {
    override var numero: Int = 0
        set(value) {
            if (value in (1..12)) field = value
        }

    override var palo: String = ""
        set(value) {
            if (value in listOf("Oros", "Espadas", "Copas", "Bastos")) field = value
        }

    override fun mostrarCarta(): String {
        var paloNum = ""
        when (numero) {
            10 -> paloNum = "Sota"
            11 -> paloNum = "Caballo"
            12 -> paloNum = "Rey"
        }
        if (numero !in (10..12)) return "CartaGenerica(palo='$palo', numero=$numero)"
        else return "CartaGenerica(palo='$palo', numero=$paloNum)"
    }

}

/*
-. Desarrolla clase CartaFrancesa que herede de la clase CartaGenerica, esta clase no
contendrá ningún atributo adicional, pero de redefinirán los métodos necesarios para
que los números válidos sean del 1 al 13 y los palos validos sean: Corazones, Picas,
Rombos y Tréboles. Además de esto el método mostrar carta deberá sustituir los
números del 11 al 13 por Jota, Reina y Rey.
-. Una clase PruebaCarta en la que se creen 3 tipos de cartas: una genérica, una
española y otra francesa y se inicialicen y se muestren por pantalla
 */

class CartaFrancesa()
{

}