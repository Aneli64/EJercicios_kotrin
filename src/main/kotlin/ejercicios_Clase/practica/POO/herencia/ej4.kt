package ejercicios_Clase.practica.POO.herencia

import jdk.incubator.vector.DoubleVector
import java.util.zip.DeflaterOutputStream

/*
5 herencia 2. Restaurante
1. Crea una clase Menú.
• Atributos:
a. IVA: float. Es común a todos los menús y siempre vale 0,21.
b. descuento: float. Siempre es el mismo para todos los menús y puede ser modificado.
c. principal: String. Puede ser…
Entrecot (15€)
Pez Espada (12€)
Carrillada (10€)
Dorada (20€)
Otros (13€)
d. bebida: int. Puede ser…
1 – Refresco (1€)
2 – Vino (1,5€)
Otros (2€)
e. postre: int. Puede ser…
1 – Fruta (2€)
2 – Helado (3€)
Otros (4€)
 */
open class Menu {

    private var IVA: Float = 0.21F
    open var descuento: Float = 0.0F

    private val menuComida =
        mapOf<String, Double>("Entrecot" to 15.0, "Pez Espada" to 12.0, "Carrillada" to 10.0, "Otros" to 13.0)
    var principal: String = ""
        set(value) {
            if (value in menuComida.keys) field = value else field = "Otros"
        }

    private val menuBebida = mapOf<Int, Double>(1 to 1.0, 2 to 1.5, 3 to 2.0)
    var bebida: Int = 0
        set(value) {
            if (value in menuBebida.keys) field = value else field = 3
        }

    private val menuPostre = mapOf<Int, Double>(1 to 2.0, 2 to 3.0, 3 to 4.0)
    var postre: Int = 0
        set(value) {
            if (value in menuPostre.keys) field = value else field = 4
        }


    /*
f. Constructor vacío.
g. Constructor con todos los parámetros necesarios para inicializar atributos (excepto IVA y descuento, que no se incluyen en el constructor
por ser comunes a todos los menús).
h. setters y getters.
i. importe(): calcula y devuelve un float con el importe total del menú.
j. mostrar(): mostrar los componentes del menú y el importe total.
 */

    open fun importe() =
        menuComida[principal]?.plus(menuBebida[bebida]!!)?.plus(menuPostre[postre]!!) //revisar que es el plus

    fun mostrar(): String{
        var principalS = menuComida[principal]
        var bebidaS = ""
        var postreS = ""
        when (bebida) {
            1 -> bebidaS = "Refresco"
            2 -> bebidaS = "Vino"
            else -> {
                bebidaS = "Otros"
            }
        }
        when (postre) {
            1 -> postreS = "Fruta"
            2 -> postreS = "Helado"
            else -> {
                postreS = "Otros"
            }
        }
        return "Principal -> $principalS \n Bebida -> $bebidaS \n Postre -> $postreS \n Importe total -> ${importe()}"
    }
}
/*
2. Crea una clase MenúInfantil que extienda la clase Menú.
• Atributos:
k. Los mismos que su clase padre. Pero…
- En vez de Vino se ofrece Zumo.
l. regalo: String. Puede ser…
Muñeca
Soldado
• Métodos:
m. Constructor vacío.
n. Constructor con todos los parámetros necesarios para inicializar atributos (excepto IVA y descuento, que no se incluyen en el constructor por ser comunes a todos los menús).
o. setters y getters.
p. importe(): siempre es de 12€
 */

class MenuInfantil() : Menu()
{
    var regalo: String = ""
        set(value) {
            if (value in listOf("Muñeca", "Soldado")) field = value
        }
    override fun importe() = 12.0

    //hacer override del mapa con bebidas para el vino o bien cambiar el condicional cuando salga 2 -> Zumo (en lugar de vino)
}


fun main() {

    val ej = Menu()
    ej.principal = "Entrecot"
    ej.bebida = 1
    ej.postre = 2

    println(ej.importe())
    println(ej.mostrar())

}