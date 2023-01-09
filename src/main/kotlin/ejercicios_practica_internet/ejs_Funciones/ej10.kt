package ejercicios_practica_internet.ejs_Funciones

/*
Programar una función que, dada una cadena y un carácter, retorne la subcadena que
comienza con dicho carácter o NULL en caso de que el caracter no exista en la cadena
 */

fun main()
{
    print("Cadena -> ")
    val cadena = readln()

    print("Caracter -> ")
    val caracter = readln()

    print(subCadInicio(cadena, caracter))

}

fun subCadInicio(cd: String, cr: String): String
{
    var charCoinc = 0
    var subCadena = ""
    for (i in cd.indices) if (cd[i].toString() == cr) charCoinc = i

    if (charCoinc == 0) return "caracter no encontrado en string"
    else
    {
        for (i in charCoinc until cd.length) subCadena += cd[i]
        return subCadena
    }
}