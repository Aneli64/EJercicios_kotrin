package ejercicios_Clase.practica.POO.herencia.ej2

/*
Desarrollar una clase Furgoneta que es uno de los tipos de vehículo de
carga, que contendrá:
Los constructores por defecto y con parámetros del vehículo
El recibo de una furgoneta además de la información de los vehículos de carga,
 debe mostrar que es una furgoneta:

--------------------
FURGONETA
--------------------
Info del recibo de carga

El alquiler de una furgoneta se calcula de la siguiente manera:

50€ por día más 20€ por tonelada de carga
 */

class Furgoneta (matricula: Int = 0) : VehiculoCarga(matricula){

    override fun alquiler() = (50.0 * duracion) + (20.0 * Tara)

    override fun recibo(): String {
        return "-".repeat(20) + "\n" + "FURGONETA" + "\n" +
                "-".repeat(20) + "\n" + "Matricula: $matricula \n " +
                "Duracion: $duracion \n Tara: $Tara \n alquiler: ${alquiler()}"
    }

}