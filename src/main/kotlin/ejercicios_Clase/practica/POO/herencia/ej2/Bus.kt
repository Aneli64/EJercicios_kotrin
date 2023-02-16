package ejercicios_Clase.practica.POO.herencia.ej2

/*
Desarrollar una clase Bus que es uno de los tipos de vehículo de transporte, que contendrá:
Los constructores por defecto y con parámetros del vehículo
El recibo de un bus además de la información de los vehículos de transporte,
debe mostrar que es un bus:

--------------------
BUS
--------------------
Info del recibo del de transporte

El alquiler de un bus es igual que la de un coche más un plus de 2€ por plaza
 */

class Bus() : VehiculoTransporte(){

    override fun alquiler() = (50.0 * duracion) + ((1.5 + 2.0) * plazas) * duracion
    override fun recibo(): String
    {
        return "-".repeat(20) + "\n" + "BUS" + "\n" +
                "-".repeat(20) + "\n" + "Matricula: $matricula \n " +
                "Duracion: $duracion \n Plazas: $plazas \n alquiler: ${alquiler()}"
    }
}