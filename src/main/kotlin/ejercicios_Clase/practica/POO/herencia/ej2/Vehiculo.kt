package ejercicios_Clase.practica.POO.herencia.ej2


/*

Se desea realizar una aplicación que gestione una empresa de alquiler de vehículos.
En esta empresa se trabaja con distintos tipos de vehículos, de carga (furgonetas y camiones) y
de transporte (coches y autobuses). Habrá que implementar una aplicación que utilizando herencia permita
realizar pedidos de vehículos de forma genérica:

Alquiler de Vehículos

Desarrollar una clase genérica Vehículo. En esta clase aparecerán los atributos y métodos comunes a todos los vehículos:
La matrícula del vehículo y la duración del alquiler en días
Los constructores secundario  por parámetros del vehículo
Los métodos get y set de todos los atributos.  (comprobar matrícula válida)
Un método alquiler que no reciba nada y devuelva un double con el importe del alquiler. Este dependerá del tipo de vehículo que finalmente sea.
Un método recibo que muestre por pantalla toda la información del alquiler del vehículo, el formato del recibo depende
de si es un vehículo de transporte o de carga
 */

abstract class Vehiculo()
{
    var matricula: String = ""
        set(value) {
            //if ('A'..'Z' !in value[0]..[3])
            field = value
        }

    var duracion : Int = 0

    abstract fun alquiler():Double
    abstract fun recibo():String
}