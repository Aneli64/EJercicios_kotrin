package ejercicios_Clase.practica.POO.herencia

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

class Menu
{
    private var IVA: Float = 0.21F
    open var descuento: Float = 0.0F
    var principal: Map<String, Int> = mapOf<String, Int>()
        set(value) {
            var valores = mapOf<String, Double>(Pair("Entrecot", 15.0))
            //field =  value.entries in valores.entries
        }
}