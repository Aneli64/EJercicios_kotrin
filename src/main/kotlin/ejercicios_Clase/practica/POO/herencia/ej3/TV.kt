package ejercicios_Clase.practica.POO.herencia.ej3

/*
Escribir TV.
TV es un Electronics
Tiene un atributo size de tipo entero
Un constructor por parámetros TV(double regularPrice, String manufacturer, int size)
Sale Price El cálculo del precio de venta es el precio regular * 0,8.
 */

class TV(regularPrice: Double, manufacturer: String, var size: Int): Electronics(regularPrice, manufacturer, ) {
    override fun computeSalePrice() = regularPrice * 0.8
    override fun toString(): String {
        return "TV \n ${"=".repeat(20)} \n " +
                "regular price -> $regularPrice \n manufacturer -> $manufacturer \n size -> $size \n ${"=".repeat(20)}"
    }
}