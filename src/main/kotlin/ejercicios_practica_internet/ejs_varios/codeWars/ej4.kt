package ejercicios_practica_internet.ejs_varios.codeWars
import java.util.Arrays

// if these g-steps prime numbers don't exist return []
/*
g(entero >= 2) que indica el paso que buscamos,

m(entero >= 2) que da el inicio de la búsqueda (m inclusive),

n(entero >= m) que da el final de la búsqueda (n inclusive)

En el ejemplo anterior step(2, 2, 50)se devolverá [3, 5]cual es el primer par entre 2 y 50 con 2 pasos.
 */
fun primo(numero: Int): Boolean{
    var cont = 0
    if (numero % 1 == 0 && numero % numero == 0)
    return cont > 2
}
/*fun step(g:Int, m:Long, n:Long):LongArray {
    var numerosPrimos = mutableListOf<Int>()
    for(i in m..n){
        if (primo(i.toInt())) numerosPrimos.add(i.toInt())
    }
}*/

fun step(g:Int, m:Long, n:Long) {
    val numerosPrimos = mutableListOf<Int>()
    for(i in m..n){
        if (primo(i.toInt())) numerosPrimos.add(i.toInt())
    }
    println(numerosPrimos)
}

fun main(){
    step(2,2,50)
}

