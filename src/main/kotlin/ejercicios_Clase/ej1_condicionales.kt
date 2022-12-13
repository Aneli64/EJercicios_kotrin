package ejercicios_Clase

fun main() {
    /*
1- aprobado leer float nota y:

 . si la nota es mayor o igual que 5 muestra por pantalla "APROBADO"

 . si la nota es menor que 5 muestra por pantalla "SUSPENSO"

    println("Introduzca su nota -> ")
    var nota = readln().toInt()
    if (nota >= 5) print("APROBADO") else print("SUSPENSO")
     */
    /*
2- saldo leer float ingresos y float gastos

 . Calcula los ingresos menos los gastos y lo guarda como 'saldo'.

 . si el saldo es positivo (o cero) muestra un mensaje como "¡Enhorabuena!, te sobran X€".

 . si el saldo es negativo muestra un mensaje como "¡Lo siento!, estás en números rojos".

*/
    /*
    println("Ingresos -> ")
    var ingresos:Float = readln().toFloat()
    println("Gastos -> ")
    var gastos:Float = readln().toFloat()

    var total = ingresos - gastos
    if (total > 0) print("¡Enhorabuena!, te sobran $total€") else print("¡Lo siento!, estás en números rojos")

     */
    /*
3- parOimpar.

 . Recibe un número entero y muestra la cadena "PAR" si el número es par e "IMPAR" en .caso contrario.
(recordad que en un número par su resto de la división entre 2 es 0).
*/
    /*
    println("Numero: ")
    var numero = readln().toInt()
    if (numero % 2 == 0) print("Numero par") else print("Numero impar")

     */
    /*
4- mayor
 . LEER dos enteros y muestra por pantalla cuál de ellos es mayor (mediante if, sin usar el método max de la clase Math)
*/
    /*
    println("Primer entero: ")
    var entero1 = readln().toInt()
    println("Segundo entero: ")
    var entero2 = readln().toInt()
    var mayor = 0

    if (entero1 > entero2) mayor = entero1 else mayor = entero2
    println("Numero mayor -> $mayor")

     */
    /*
5- dividir.

 . Recibe dos float: dividendo y divisor.

 . Si el divisor es cero no intentará realizar la división (puesto que daría error). En tal caso mostrará un mensaje de error

 . Si el divisor no es cero, realiza la división y muestra el resultado
 */
    /*
    println("Dividendo: ")
    var dividendo:Float = readln().toFloat()
    println("Divisor")
    var divisor:Float = readln().toFloat()
    var resDiv = 0.0f

    if (divisor == 0.0F) println("El divisor no puede ser cero")
    else{
        resDiv = dividendo / divisor
        println("Resultado division -> $resDiv")
    }
     */
}