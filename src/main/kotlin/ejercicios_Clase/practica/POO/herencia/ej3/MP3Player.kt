package ejercicios_Clase.practica.POO.herencia.ej3

import javax.print.attribute.standard.PrinterMoreInfoManufacturer

/*
Escribir MP3Player.
MP3Player es un Electronics
Tiene un atributo color de tipo cadena
Un constructor por parámetros MP3Player (double regularPrice, String manufacturer, String color)
Sale Price El cálculo del precio de venta es el precio regular * 0,9.
 */

class MP3Player(regularPrice: Double, manufacturer: String, var color: String, IVA: Int): Electronics(regularPrice, manufacturer, IVA){
    override fun computeSalePrice() = regularPrice * 0.9
    override fun toString(): String {
        return "MP3Player \n ${"=".repeat(20)} \n " +
                "cod -> ${numeroProducto} \n regular price -> $regularPrice \n manufacturer -> $manufacturer \n color -> $color \n ${"=".repeat(20)}"
    }

    //Para MP3Player, restar 15 al precio de venta
    override fun computeSpecialCustomerPrice() = computeSalePrice() - 15.0
}