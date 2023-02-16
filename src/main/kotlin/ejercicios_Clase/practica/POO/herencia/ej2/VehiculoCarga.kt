package ejercicios_Clase.practica.POO.herencia.ej2

/*
Desarrollar una clase genérica VehículoCarga. En esta clase es un
tipo de vehículo dedicado al transporte de mercancías que contendrá:
La carga máxima del vehículo (Tara) en toneladas.
Los constructores por defecto y con parámetros del vehículo
Los métodos get y set de todos los atributos.
Un método alquiler que no reciba nada y devuelva un double con el importe del
alquiler. Este dependerá de si finalmente es una furgoneta o un camión
Un método recibo que muestre por pantalla toda la información del alquiler del vehículo:

Matricula: valor
Duración: valor
Tara: valor Toneladas
Importe: valor €

 */
abstract class VehiculoCarga(var Tara: Int = 0) : Vehiculo() {

    override fun alquiler(): Double {
        TODO("Not yet implemented")
    }

    override fun recibo(): String = "Matricula: $matricula \n Duracion: $duracion \n Tara: $Tara \n ${alquiler()}"
}
