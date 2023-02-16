package ejercicios_Clase.practica.POO.herencia.ej2

/*
Desarrollar una clase Coche que es uno de los tipos de vehículo de transporte, que contendrá:
Los constructores por defecto y con parámetros del vehículo
El recibo de un coche además de la información de los vehículos
de transporte, debe mostrar que es un coche:

--------------------
COCHE
--------------------
Info del recibo del de transporte

El alquiler de un coche se calcula de la siguiente manera:

50€ por día más 1,5€ por plaza y día

 */
class Coche () : VehiculoTransporte() {

    override fun alquiler() = (50.0 * duracion) + (1.5 * plazas * duracion)
    override fun recibo(): String
    {
        return "-".repeat(20) + "\n" + "COCHE" + "\n" +
                "-".repeat(20) + "\n" + "Matricula: $matricula \n " +
                "Duracion: $duracion \n Plazas: $plazas \n alquiler: ${alquiler()}"
    }

}

fun main()
{
    val ej = Coche()
    ej.matricula = "SDF4567"
    ej.plazas = 2
    ej.duracion = 2

    println(ej.alquiler())
    println(ej.recibo())
}











