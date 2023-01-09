package ejercicios_Clase.practica.ejs_listas

/*
3 crea una lista mutable con las letras de una cadena implementa un menú para
1 mostrar la lista
2 insertar caracter en una posición
3 actualizar (modificar) carácter en una posición)
4 borrar caracter en una posición
5 salir

 */

fun main() {
    print("Cadena -> ")
    val cadena = readln()

    var mutList = mutableListOf<String>()
    for (item in cadena) mutList.add(item.toString())

    println("Opciones -> \n [ 1- Mostrar lista | 2- Insertar caracter en posicion | 3- Actualizar (modificar) caracter en posicion | 4- Borrar caracter en una posicion | 5- Posicion ]")
    var input = readln().toInt()

    while (input != 5) {
        when (input) {
            1 -> println(mutList)
            2 -> {
                print("Introduzca un caracter -> ")
                val carac = readln()
                print("Introduzca una posicion -> ")
                val pos = readln().toInt()
                inCadPos(mutList, carac, pos)
            }

            3 -> {
                print("Introduzca un caracter -> ")
                val carac = readln()
                print("Introduzca una posicion -> ")
                val pos = readln().toInt()
                actCarPos(mutList, carac, pos)
            }

            4 -> {
                print("Introduzca una posicion -> ")
                val pos = readln().toInt()
                delCarPos(mutList, pos)
            }

        }
        println("Opciones -> \n [ 1- Mostrar lista | 2- Insertar caracter en posicion | 3- Actualizar (modificar) caracter en posicion | 4- Borrar caracter en una posicion | 5- Salir ]")
        input = readln().toInt()
    }
}
fun inCadPos(lista: MutableList<String>, caracter: String, pos: Int) = lista.add(pos, caracter)
fun actCarPos(lista: MutableList<String>, caracter: String, posicion: Int) {
    lista[posicion] = caracter
}
fun delCarPos(lista: MutableList<String>, pos: Int) = lista.remove(lista[pos])

