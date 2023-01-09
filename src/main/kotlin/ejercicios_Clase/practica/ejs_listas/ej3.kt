package ejercicios_Clase.practica.ejs_listas

/*
3 crea una lista mutable con las letras de una cadena implementa un menú para
1 mostrar la lista
2 insertar caracter en una posición
3 actualizar (modificar) carácter en una posición)
4 borrar caracter en una posición
5 salir

 */

fun main()
{
    print("Cadena -> ")
    val cadena = readln()

    var mutList = mutableListOf<Char>()
    for(item in cadena) mutList.add(item)

    print("Opciones -> /n [ 1- Mostrar lista | 2- Insertar caracter en posicion | 3- Actualizar (modificar) caracter en posicion | 4- Borrar caracter en una posicion]")
    val input = readln().toInt()

    when(input)
    {
        1 -> print(mutList)
        2 -> inCadPos()
        3 -> {
            print("Introduzca un caracter -> ")
            val carac = readln()
            print("Introduzca una posicion -> ")
            val pos = readln().toInt()
            actCarPos(mutList, carac, pos)
        }
        4 -> delCarPos()

    }
    print(mutList)
}

fun inCadPos(){}
fun actCarPos(lista: MutableList<Char>, caracter: String, posicion: Int)
{

    //lista[posicion] ==
}
fun delCarPos(){}



