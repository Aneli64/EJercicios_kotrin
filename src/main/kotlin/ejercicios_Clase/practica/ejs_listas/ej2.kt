package ejercicios_Clase.practica.ejs_listas

/*
crea una lista mutable con 5 números de la bonoloto leídos por teclado (no se permitirán repeticiones) y muéstralos
 */

fun main()
{
    var lista = mutableListOf<Int>()
    print("Numero -> ")
    var input = readln().toInt()

    for(i in 0..4)
    {
        while(input in lista)
        {
            print("Numero -> ")
            input = readln().toInt()
        }
        lista.add(input)
    }

    print(lista)
}