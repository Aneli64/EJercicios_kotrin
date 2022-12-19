package ejercicios_practica_internet.ejs_Funciones

/*
Crea un programa que pida dos número enteros al usuario y diga si alguno de ellos
es múltiplo del otro. Crea una función EsMultiplo que reciba los dos números,
y devuelve si el primero es múltiplo del segundo
 */

fun main()
{
    print("Valor1 -> ")
    val val1 = readln().toInt()
    print("Valor2 -> ")
    val val2 = readln().toInt()

    if (multiplo(val1, val2)) print("Uno es multiplo del otro") else print("nada de multiplos...")
}

fun multiplo(val1: Int, val2: Int) = (val1 % val2 == 0 || val2 % val1 == 0)