package ejercicios_Clase.practica.POO.herencia

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

/*
f. Constructor vacío.
g. Constructor con todos los parámetros necesarios para inicializar atributos (excepto IVA y descuento, que no se incluyen en el constructor
por ser comunes a todos los menús).
h. setters y getters.
i. importe(): calcula y devuelve un float con el importe total del menú.
j. mostrar(): mostrar los componentes del menú y el importe total.
 */

class Menu {
    private var IVA: Float = 0.21F
    open var descuento: Float = 0.0F
    var principal: Map<String, Double> = mapOf<String, Double>()
        set(value) {
            val valores =
                mapOf<String, Double>("Entrecot" to 15.0, "Pez Espada" to 12.0, "Carrillada" to 10.0, "Otros" to 13.0)
            for ((c, v) in value) if (value.containsKey(valores.keys.any().toString())) field = value
        }

    constructor(principal: Map<String, Double>) {
        this.principal = principal
    }

    override fun toString(): String {
        return "Menu(IVA=$IVA, descuento=$descuento, principal=$principal)"
    }
}

fun main() {
    /* val valores =
         mapOf<String, Double>("Entrecot" to 15.0, "Pez Espada" to 12.0, "Carrillada" to 10.0, "Otros" to 13.0)
     for ((c, v) in valores) println(valores.keys)*/

    val menuEJ = mapOf<String, Double>("Entrecot" to 15.0, "Pez Espada" to 12.0, "Carrillada" to 10.0, "Otros" to 13.0)
    val menu1 = Menu(menuEJ)


}