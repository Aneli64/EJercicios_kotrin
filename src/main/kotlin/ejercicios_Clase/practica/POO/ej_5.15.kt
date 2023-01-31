package ejercicios_Clase.practica.POO

/*
 Se desea elaborar una pequeña aplicación para simular un reloj digital. Para esto se  creará un paquete tiempo, y dentro de él las clases hora y reloj. Mientras no se
 indique lo contrario se aplicarán los principios básicos de ocultación y encapsulación.  Para cada una de las clases habrá que implementar lo siguiente:
La clase hora tendrá 3 atributos hora, minuto y segundo que semeja un reloj de 24h:
- Un constructor por defecto y otro con parámetros que reciba el valor de todos los  atributos.
- Los métodos get que devuelvan el valor actual de cada uno de los atributos. - Los métodos set(int) que reciban como argumento el nuevo valor del atributo.
Si  este es superior al valor permitido se añadirá el acarreo al campo correspondiente,
Ejemplos:
setSegundos(80)-> sumará un minuto y 20 segundos (80 segundos)
setMinutos(120)-> sumará 2 horas
setHoras(25) -> sumará 1 hora
 */

class Hora {
    var hora: Int = 0
        set(value) {
            var horas = value
            while (horas >= 24) {
                horas -= 24
            }
            field = horas
        }
    var minuto: Int = 0
        set(value) {
            var minutos = value
            while (minutos >= 60) {
                minutos -= 60
                hora++
            }
            field = minutos
        }
    var segundo: Int = 0
        set(value) {
            var segs = value
            while (segs >= 60) {
                segs -= 60
                minuto++
            }
            field = segs
        }

    /*
    - Un método mostrarhora24() que muestre la hora en el siguiente formato: Son las <h> horas <min> minutos y <seg> segundos
- Un método mostrarhora12() que tranforme la hora a un reloj de doce horas,  mostrando uno de los 2 siguientes mensajes, haciendo el respectivo cambio de  hora si es necesario:
Son las <h> horas <min> minutos y <seg> segundos de la tarde
Son las <h> horas <min> minutos y <seg> segundos de la mañana
     */

    fun mostrarhora24() = "Son las $hora horas $minuto minutos y $segundo segundos"
    fun mostrarhora12() =
        if (hora >= 12) "Son las ${hora-12} horas $minuto minutos y $segundo de la tarde" else "Son las $hora horas $minuto minutos y $segundo de la mañana"

}
/*
4. La clase reloj contendrá un único método main en el que se cree un objeto de la clase  hora y se muestre el siguiente menú:
Reloj
------
1. Mostrar hora 12
2. Mostrar hora 24
3. Modificar horas
4. Modificar minutos
5. Modificar segundos
6. Salir.
El menú se repetirá hasta que se seleccione la opción salir.
 */

fun main() {
    var ej = Hora()
    ej.hora = 22
    ej.minuto = 70
    ej.segundo = 120

    println(ej.mostrarhora24())
    println(ej.mostrarhora12())
}
