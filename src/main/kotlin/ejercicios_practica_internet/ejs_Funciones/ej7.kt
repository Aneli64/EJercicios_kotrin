package ejercicios_practica_internet.ejs_Funciones

import kotlin.math.max
import kotlin.math.min

/*
Crear una función que calcule el MCD de dos número por el método de Euclides.
El método de Euclides es el siguiente:

Se divide el número mayor entre el menor.
Si la división es exacta, el divisor es el MCD.
Si la división no es exacta, dividimos el divisor entre el resto obtenido y
se continúa de esta forma hasta obtener una división exacta, siendo el último divisor el MCD.
Crea un programa principal que lea dos números enteros y muestre el MCD.
 */

fun mcd(val1:Int, val2:Int):Int
{
    var divMaxMin = max(val1, val2) / min(val1, val2)
    while(max(val1, val2) % min(val1, val2) != 0) divMaxMin /= min(val1, val2)
    return divMaxMin
}
// revisar
fun main()
{
    print(mcd(6,4))
}