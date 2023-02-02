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
        if (hora >= 12) "Son las ${hora - 12} horas $minuto minutos y $segundo de la tarde" else "Son las $hora horas $minuto minutos y $segundo de la mañana"

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

class Reloj() {
    var tiempo = Hora()
    fun menu() {
        println("Decida que quiere hacer: \n 1. Mostrar hora 12\n 2. Mostrar  hora 24\n 3. Modificar horas\n 4. Modificar minutos\n 5. Modificar segundos\n 6. Salir.")
        var entrada = readln().toInt()
        while (entrada != 6) {
            when (entrada) {
                1 -> print(tiempo.mostrarhora12())
                2 -> print(tiempo.mostrarhora24())
                3 -> {
                    print("Nuevas horas -> ")
                    tiempo.hora = readln().toInt()
                }

                4 -> {
                    print("Nuevos minutos -> ")
                    tiempo.minuto = readln().toInt()
                }

                5 -> {
                    print("Nuevos segundos -> ")
                    tiempo.segundo = readln().toInt()
                }
            }
            println("Decida que quiere hacer: \n 1. Mostrar hora 12\n 2. Mostrar  hora 24\n 3. Modificar horas\n 4. Modificar minutos\n 5. Modificar segundos\n 6. Salir.")
            entrada = readln().toInt()
        }
    }
}
/*
Se desea desarrollar una clase que almacene información sobre la meteorología de un día.  Para esto se creará la clase Día perteneciente al paquete Tiempo.
La clase Día debe  almacenar la temperatura máxima y mínima del día (min y max) como entero y el estado  del día como carácter,
los estados posibles son Soleado(‘s’), Nublado(‘n’) o Lluvioso(‘l’).

a) Definir correctamente la clase día y sus atributos correspondientes. Un constructor por  defecto, otro constructor que reciba como
parámetros todos los atributos y un  constructor de copias que cree un día a partir de otro dado.

b) Los métodos get de los atributos que no reciban nada y que devuelvan el valor de cada  atributo. Los métodos setAtributo(Valor) de los atributos,
que modifiquen los  atributos con los nuevos valores recibidos como argumento. En setEstado(valor), se  deberá comprobar que el estado introducido es
válido(‘s’,’n’,’l’), si no, se volverá a  pedir. Estos métodos sólo pueden ser accedidos por las clases del mismo paquete.

c) Un método mostrar_predicción() que muestre por pantalla el siguiente mensaje: Se espera un día <estado> con temperaturas máximas de <max> y mínimas de <min>
Realizándose el cambio de estado almacenado correspondiente: s-> soleado n->nublado l->lluvioso

d) Un método temperaturaActual() que pida por teclado la temperatura actual. Si esta  supera la máxima o la mínima, estas deberán actualizarse con la nueva temperatura.
 */

class Dia {
    var temp_max: Int = 0
    var temp_min: Int = 0
    var estado: String = ""
        set(value) {
            if (value in listOf<String>("s", "n", "l")) field =
                value else "Valor no valido (debe estar dentro de estos -> ('s', 'n', 'l'))"
        }
    fun mostrar_prediccion() = "Se espera un dia $estado con temperaturas máximas de $temp_max y mínimas de $temp_min"
    fun temperaturaActual()
    {
        print("Introduzca una temperatura -> ")
        var entrada = readln().toInt()
        if (entrada >= temp_max) entrada = temp_max
        if (entrada >= temp_min) entrada = temp_min
    }
}
 /*
  Se desea desarrollar una clase Predicción perteneciente al paquete Tiempo que almacene  y gestione la información relativa a la predicción meteorológica de los próximos 3 días.
  Para esto se declararán 3 atributos Día1, Día2 y Día3 que contengan la información  meteorológica de un Día.
a) Definir correctamente la clase Predicción, sus atributos correspondientes y un constructor por defecto.

b) Un método mostrarDía(int) que muestre por pantalla la predicción del día que se le ha  indicado mediante el entero recibido como parámetro.

c) Un método modificarPrevisionDía(int) que pida por teclado los datos necesarios para  modificar la previsión de un día. El día a modificar se
indicará mediante un entero  recibido como parámetro.
  */
class Prediccion(var dia1: Int = 0, var dia2: Int = 0, var dia3: Int = 0)
{
    var listaDias = mutableListOf<Int>(dia1, dia2, dia3)
    fun mostrarDia(dia: Int) = listaDias[dia]
    fun modificarPrevisionesDia(dia: Int) {
        listaDias[dia] = dia
    }
}

/*
7. Crea una clase ejecutar que contenga un método main que cree una predicción con el
constructor por defecto, después pida los datos de cada día, después muestre la  predicción de los
 tres días y por último haga la medición real de cada uno de los días.
 */
fun main() {
    //var ej = Reloj()
    //ej.menu()
    var pred = Prediccion()
    pred.modificarPrevisionesDia(7)
    pred.modificarPrevisionesDia(12)
    pred.modificarPrevisionesDia(26)

    println(pred.mostrarDia(0))
    println(pred.mostrarDia(1))
    println(pred.mostrarDia(2))
}

