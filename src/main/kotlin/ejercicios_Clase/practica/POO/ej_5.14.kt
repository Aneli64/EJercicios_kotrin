package ejercicios_Clase.practica.POO

import ejercicios_practica_internet.ejs_Funciones.producto
import ejercicios_practica_internet.ejs_Funciones.suma

/*
Realiza la siguiente aplicación usando el lenguaje de programación Orientado a Objetos.
1. Se desea desarrollar una aplicación para gestionar los productos de una fábrica. Para  esto se creará la clase Producto perteneciente al paquete Fábrica. En esta clase se
implementarán los principios básicos de ocultación y encapsulación salvo que se  indique lo contrario. La clase Producto tendrá como atributos el nombre (como  String)
y serie, (como entero) precio (como double). Además habrá que implementar  los siguientes métodos:

- Un constructor por defecto
- Un constructor por parámetros que recibe el valor de todos los atributos como  parámetro (salvo la serie).
Si se introduce algún valor erróneo (negativo o en  blanco) se volverá a pedir pantalla hasta que sea válido.
- Un método generar() que se encargará de generar el número de serie del producto,  este método sólo será accesible y visible por la propia clase.
La serie se generará  creando un número aleatorio entre 1 y 100000. El número generado se devolverá  como resultado del método.
En los dos constructores, el número de serie  inicializará llamando a este método.
- Los métodos get de todos los atributos que devuelvan el valor de los mismos. - Los métodos setNombre(String) y setPrecio(double)
reciban el nuevo valor del  parámetro comprobando que este sea válido, si es erróneo se volverá a pedir hasta  que lo sea.
- Los métodos pedirNombre() y pedirPrecio() que no reciban nada y que pidan el  nuevo valor por pantalla comprobando que este sea válido,
si es erróneo se volverá  a pedir hasta que lo sea.
- Un método resumen() muestre por pantalla el siguiente resumen del producto:
INFORME DE PRODUCTO
------------------------------
<Nombre>
<Serie>
<Precio>
- Un método iguales(producto) que devuelva verdadero o falso si el producto que  invoca al método y el que recibe como parámetro son el mismo producto o no.
Para  esto en primer lugar se comprobarán los nombres de los productos, si son distintos  se devolverá un falso, y si son iguales se
comprobará la serie, si son distintas se  devolverá falso y si son iguales verdadero.
*/

class Producto(var nombre: String, var precio: Double, var serie: Int) {
    constructor(nombre: String, precio: Double) : this(nombre, precio, 0) //generar() como serie??

    private fun generar() = (1..100000).random()
    fun resumen() = "INFORME DEL PRODUCTO \n ${("-").repeat(24)} \n <$nombre> \n <$serie> \n <$precio>"
    fun iguales(producto: Producto) = if (this.nombre == producto.nombre) this.serie == producto.serie else false

}

fun main() {
    var ej1 = Producto("balon", 14.0, 4)
    var ej2 = Producto("balon", 16.0, 8)

    println(ej1.resumen())
    println(ej1.iguales(ej2))
}

/*
2. También se desea desarrollar una aplicación para gestionar los pedidos fábrica. Para  esto se creará la clase Pedido perteneciente al paquete Fábrica.
En esta clase se  implementarán los principios básicos de ocultación y encapsulación salvo que se  indique lo contrario. La clase Pedido tendrá como
atributos 3 elementos de la clase  producto ya que en cada pedido se pueden pedir exactamente 3 productos ni más ni  menos. Además habrá que implementar
los siguientes métodos:
- Un constructor por defecto que inicialice los atributos
- Un método pedirProducto(int), que reciba un entero indicando cual de los tres  productos se va a introducir y pida por teclado su nombre y su precio.
Este método  deberá comprobar que el número facilitado es válido (1,2 o 3).
- Un método total() que devuelva el importe del pedido, que es la suma del precio de  los tres productos.
- Un método mostrarPedido() que muestre el resumen de los 3 productos así como  el total del pedido.
- Un método main en una clase aparte que cree 1 pedido, pida los datos de los tres  productos, después compare si los
productos 1 y 3 son iguales o distintos y por  último muestre la información del pedido.
 */

class Pedido(var productos: MutableList<Producto> = mutableListOf()) {

    fun total() = productos.sumOf { it.precio }
    fun mostrarPedido() {
        for (item in productos) "INFORME DEL PRODUCTO \n ${("-").repeat(24)} \n <$item.nombre> \n <$item.serie> \n <$item.precio>"
    }

    fun pedirProducto(numero: Int): Producto {
        var numeroP = numero
        while (numeroP !in (1..3)) {
            println("Numero no valido, debe estar comprenido entre 1 y 3...")
            numeroP = readln().toInt()
        }

        println("Nombre del producto: ")
        val nombreP = readln()

        println("Precio del producto: ")
        val precioP = readln().toDouble()

        return Producto(nombreP, precioP) //hay que mirar que funciona y como se autoasigna su numero de serie
    }
}