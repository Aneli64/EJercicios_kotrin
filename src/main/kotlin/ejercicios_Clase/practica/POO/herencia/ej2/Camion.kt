package ejercicios_Clase.practica.POO.herencia.ej2

/*
Desarrollar una clase Camión que es uno de los tipos de vehículo de carga, que contendrá:
Los constructores por defecto y con parámetros del vehículo
El recibo del camión además de la información de los vehículos de carga, debe mostrar que es un camión:

--------------------
CAMIÓN
--------------------
Info del recibo de carga

El alquiler de un camión es como el de una furgoneta más un plus de 40 euros fijos.
 */
class Camion() : VehiculoCarga(){
    override fun alquiler() = ((50.0 * duracion) + (20.0 * Tara)) + 40.0

    override fun recibo(): String {
        return "-".repeat(20) + "\n" + "CAMIÓN" + "\n" +
                "-".repeat(20) + "\n" + "Matricula: $matricula \n " +
                "Duracion: $duracion \n Tara: $Tara \n alquiler: ${alquiler()}"
    }
}