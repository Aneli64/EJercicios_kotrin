package ejercicios_Clase.practica.POO.herencia.ej3

/*
Escribir Book.
Book es un Product
Tiene dos atributos, publisher de tipo cadena e yearPublished de tipo entero
Un constructor por parámetros Book(double regularPrice, String Publisher, int yearPublished)
Sale Price El cálculo del precio de venta es el precio regular * 0,5.
 */

class Book(regularPrice: Double, var publisher: String, var yearPublished: Int, IVA: Int) : Produt(regularPrice, IVA){
    override fun computeSalePrice() = regularPrice * 0.5
    override fun toString(): String {
        return "Book \n ${"=".repeat(20)} \n " +
                "regular price -> $regularPrice \n publisher -> $publisher \n yearPublished -> $yearPublished \n ${"=".repeat(20)}"
    }
    //Para Book, restar 2 al precio de venta
    override fun computeSpecialCustomerPrice() = computeSalePrice() - 2.0
}
