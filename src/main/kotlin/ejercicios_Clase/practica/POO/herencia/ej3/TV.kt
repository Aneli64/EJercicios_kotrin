package ejercicios_Clase.practica.POO.herencia.ej3

/*
Escribir TV.
TV es un Electronics
Tiene un atributo size de tipo entero
Un constructor por parámetros TV(double regularPrice, String manufacturer, int size)
Sale Price El cálculo del precio de venta es el precio regular * 0,8.
 */

/*
añade a cada producto el número de producto que será un número que comience por 1 y se incremente cada vez que se cree un producto
Añade una función que devuelve el valor del último objeto
 */

class TV(regularPrice: Double, manufacturer: String, var size: Int, IVA: Int): Electronics(regularPrice, manufacturer, IVA) {
    override fun computeSalePrice() = regularPrice * 0.8
    override fun toString(): String {
        return "TV \n ${"=".repeat(20)} \n " +
                "regular price -> $regularPrice \n manufacturer -> $manufacturer \n size -> $size \n ${"=".repeat(20)}"
    }
    //Para TV, restar 100 al precio de venta
    override fun computeSpecialCustomerPrice() = computeSalePrice() - 100.0
}