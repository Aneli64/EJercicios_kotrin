package ejercicios_practica_internet.ejs_Funciones

/*
Crea un función “ConvertirEspaciado”, que reciba como parámetro un
texto y devuelve una cadena con un espacio adicional tras cada letra.
Por ejemplo, “Hola, tú” devolverá “H o l a , t ú “. Crea un programa
principal donde se use dicha función.
 */

fun main()
{
    print("Mensaje -> ")
    val input = readln()

    print(espaciado(input))
}

fun espaciado(mens:String):String
{
    var mensFinal = ""
    for(item in mens) mensFinal += "$item "
    return mensFinal
}