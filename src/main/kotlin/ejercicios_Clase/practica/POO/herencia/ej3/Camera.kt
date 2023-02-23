package ejercicios_Clase.practica.POO.herencia.ej3

/*
Escribir Camera.java.
Camera es un Electronics
El cálculo del precio de venta es el precio regular * 0,7.
 */

class Camera(regularPrice: Double, manufacturer: String, IVA: Int) :Electronics(regularPrice, manufacturer, IVA) {
    override fun computeSalePrice() = regularPrice * 0.7
    override fun toString(): String {
        return "Book \n ${"=".repeat(20)} \n " +
                "regular price -> $regularPrice \n manufacturer -> $manufacturer \n ${"=".repeat(20)}"
    }
    //PAra cámara restar 205 al precio de venta
    override fun computeSpecialCustomerPrice() = computeSalePrice() - 205.0
}