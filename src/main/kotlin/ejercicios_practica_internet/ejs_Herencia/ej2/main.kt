package ejercicios_practica_internet.ejs_Herencia.ej2

//Crea al menos un objeto de cada subclase y añádelos a una lista llamada vehiculos.
fun main()
{
    val coche = Coche("Verde", 4, 180.0, 20)
    val camioneta = Camioneta("Rojo", 6, 200.0)
    val bici = Bicicleta("Azul", 2, "urbana")
    val moto = Motocicleta("Naranja", 2, 200.0, 15)

    val vehiculos = listOf<Vehiculo>(coche, camioneta, bici, moto)

    //Realiza una función llamada catalogar() que reciba la lista de vehiculos y los recorra mostrando el nombre de su clase y sus atributos.
    fun catalogar(lista: List<Vehiculo>) {
        for(item in lista) println(item)
    }
    catalogar(vehiculos)

    /*
     Modifica la función catalogar() para que reciba un argumento optativo ruedas, haciendo que muestre únicamente los que su número de ruedas concuerde
    con el valor del argumento. También debe mostrar un mensaje "Se han encontrado {} vehículos con {} ruedas:" únicamente si se envía el argumento ruedas.
    Ponla a prueba con 0, 2 y 4 ruedas como valor.
     */

    fun catalogar2(lista: List<Vehiculo>, nRuedas: Int){
        var contR = 0
        for (item in lista) if(item.ruedas == nRuedas) contR ++

        println("Se han encontrado $contR vehiculos con $nRuedas ruedas.")
        for(item in lista) if (item.ruedas == nRuedas) println(item)
    }

    catalogar2(vehiculos, 0)
    catalogar2(vehiculos, 2)
    catalogar2(vehiculos, 4)
}