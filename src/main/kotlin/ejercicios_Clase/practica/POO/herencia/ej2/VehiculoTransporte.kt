package ejercicios_Clase.practica.POO.herencia.ej2

/*
Desarrollar una clase genérica VehículoTransporte. En esta clase es un tipo de vehículo
 dedicado al alquiler de personas que contendrá:
El número de plazas del vehículo
Los constructores por defecto y con parámetros del vehículo
Los métodos get y set de todos los atributos.
Un método alquiler que no reciba nada y devuelva un double con el importe del alquiler.
Este dependerá de si finalmente es un coche o un autobús
Un método recibo que muestre por pantalla toda la información del alquiler del vehículo:

Matricula: valor
Duración: valor días
Plazas: valor
Importe: valor €
 */

abstract class VehiculoTransporte(var plazas: Int = 0) : Vehiculo() {

    override fun alquiler(): Double {
        TODO("Not yet implemented")
    }

    override fun recibo(): String = "Matricula: $matricula \n Duracion: $duracion \n Plazas: $plazas \n ${alquiler()}"

}