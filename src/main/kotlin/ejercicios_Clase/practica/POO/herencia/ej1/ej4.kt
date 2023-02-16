package ejercicios_Clase.practica.POO.herencia.ej1

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

    val menuComida =
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

    open fun mostrar(): String {
        val principalS = menuComida[principal]
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

class MenuInfantil() : Menu() {
    var regalo: String = ""
        set(value) {
            if (value in listOf("Muñeca", "Soldado")) field = value
        }

    override fun importe() = 12.0
    override fun mostrar(): String {
        val principalS = menuComida[principal]
        var bebidaS = ""
        var postreS = ""
        when (bebida) {
            1 -> bebidaS = "Refresco"
            2 -> bebidaS = "Zumo"
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
3. Crea una clase Test con método main().
Un grupo de comensales ha entrado en nuestro restaurante y se dispone a pedir los menús.
Antes de comenzar se establecerá el descuento promocional actual (de la clase Menú) al 15% y se pondrá la cuenta a cero (el importe total que pagará el grupo).
Se irán preguntando uno a uno los menús que se desean (en un bucle):
• Tipo de menú.
• Principal.
• Bebida.
• Postre.
• Regalo (sólo si es infantil).
Al finalizar de introducir cada menú, se calculará el importe total y éste se sumará a la cuenta total. Los objetos menú y menú infantil que se haya utilizado
para ir guardando las opciones de un menú puede ser reutilizados una y otra vez para el resto de menús, porque una vez calculado el importe del menú ya no se volverá a necesitar.
Este proceso terminará cuando:
• Se pulse Enter sin introducir Tipo de menú.
• Se alcancen los 12 menús
• Se superen los 140 euros.
 */

//clase inventada para gestionar las peticiones de menus de clientes
class elegirMenu {

    var count = 0
    var importeTotal = 0.0
    var countNumAdul = 0
    var countNumNiñ = 0
    fun pedirAdulto(tipoMenu: Menu) {
        println("Introduzca su comida: (Entrecot | Pez Espada | Carrillada) \n")
        val comida = readln()
        tipoMenu.principal = comida
        println("Introduzca su bebida: (1 - Refresco | 2 - Vino) \n")
        val bebida = readln().toInt()
        tipoMenu.bebida = bebida
        println("Introduzca su postre: (1 - Fruta | 2 - Helado) \n")
        val postre = readln().toInt()
        tipoMenu.postre = postre
    }

    fun pedirNiño(tipoMenu: MenuInfantil) {
        println("Introduzca su comida: (Entrecot | Pez Espada | Carrillada) \n")
        val comida = readln()
        tipoMenu.principal = comida
        println("Introduzca su bebida: (1 - Refresco | 2 - Zumo) \n")
        val bebida = readln().toInt()
        tipoMenu.bebida = bebida
        println("Introduzca su postre: (1 - Fruta | 2 - Helado) \n")
        val postre = readln().toInt()
        tipoMenu.postre = postre
        println("Introduzca su regalo: Muñeca | Soldado")
        val regalo = readln()
        tipoMenu.regalo = regalo

    }

    fun pedirMenu() {
        println("Elija un tipo de menu: (1- Menu Adultos | 2- Menu Infantil | 3- Salir) \n")
        var entrada = readln().toInt()

        while (count != 12 || importeTotal < 140.0) {
            when (entrada) {
                1 -> {
                    elegirMenu().pedirAdulto(Menu())
                    count++
                    //importeTotal +=
                    countNumAdul++
                    println("Elija un tipo de menu: (1- Menu Adultos | 2- Menu Infantil | 3- Salir) \n")
                    entrada = readln().toInt()
                }

                2 -> {
                    elegirMenu().pedirNiño(MenuInfantil())
                    count++
                    importeTotal += 12.0
                    countNumNiñ++
                    println("Elija un tipo de menu: (1- Menu Adultos | 2- Menu Infantil | 3- Salir) \n")
                    entrada = readln().toInt()
                }

                3 -> break
            }
        }

        println(
            "Numero de menus normales -> $countNumAdul \n Numero de menus de niños -> $countNumNiñ \n " +
                    "Importe total -> $importeTotal \n Importe medio -> ${importeTotal / (countNumAdul + countNumNiñ)}"
        )
    }
}

/*
Al finalizar la introducción de todos los menús se mostrará por pantalla:
• Número de menús normales
• Número de menús infantiles
• Importe total del grupo
• Importe medio por comensal
 */
fun main() {
    val ej = elegirMenu()
    ej.pedirMenu()
}

