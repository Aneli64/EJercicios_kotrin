package ejercicios_Clase.practica.POO

import ejercicios_Clase.practica.ejs_listas.del

/*
Queremos mantener una colección de los libros que hemos ido leyendo, poniéndoles una calificación según nos haya gustado más o menos al leerlo.
Para ello, crear la clase Libro, cuyos atributos son el título, el autor, el número de páginas y la calificación que le damos entre 0 y 10.
Crear los métodos para poder modificar y obtener los atributos (sólo si tienen sentido).
 */

class Libro(var titulo: String = "", var autor: String = "", var n_pags: Int = 0, var calif: Int = 0) {
    init {
        calif in 1..10
    }

    fun modfTitulo(newTitulo: String) {
        titulo = newTitulo
    }

    fun modfAutor(newAutor: String) {
        autor = newAutor
    }

    fun modfCalif(newCalif: Int) {
        calif = newCalif
    }

    override fun toString(): String {
        return "Libro(titulo='$titulo', autor='$autor', n_pags=$n_pags, calif=$calif)"
    }

}

/*
Posteriormente, crear una clase ConjuntoLibros, que almacena un conjunto de libros (con un vector de un tamaño fijo). Se pueden añadir libros que
no existan (siempre que haya espacio), eliminar libros por título o autor, mostrar por pantalla los libros con la mayor y menor calificación y, por último, mostrar un
contenido de todo el conjunto. En el programa principal realizar las siguientes operaciones: crear dos libros, añadirlos al conjunto, eliminarlos por los dos criterios (título y autor)
hasta que el conjunto esté vacío, volver a añadir un libro y mostrar el contenido final.
 */

class ConjuntoLibros(var listaLibros: Array<Libro> = arrayOf(Libro(), Libro(), Libro())) {
    //fun elimLibroTit(delTitulo: String) = listaLibros.any { it.titulo == delTitulo }
    fun elimLibroTit(delTitulo: String) = listaLibros.filter { it.titulo == delTitulo }

    fun elimLibAut(delAutor: String) = listaLibros.any { it.autor == delAutor }

    fun mayorCalif()
    {

    }

    fun menorCalif()
    {

    }

    fun mostrarConjLibros()
    {

    }


}

fun main() {
    var libro1 = Libro("hola", "elian", 43, 6)
}