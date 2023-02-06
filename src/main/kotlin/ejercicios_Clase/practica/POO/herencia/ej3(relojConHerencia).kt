package ejercicios_Clase.practica.POO.herencia

import kotlin.time.Duration.Companion.hours

/*
5.3 herencia1. 2 Reloj-Alarma2 con Herencia Segunda forma
Crea un nuevo proyecto.
En su interior, crea una clase Reloj-Alarma extendiendo a la clase Reloj (usa el .jar, no copies el código fuente de la clase Reloj)
Atributos añadido:
- horaAlarma
- minutoAlarma
 */

class Reloj_Alarma2(var horaAlarma: Int = 0, var minutoAlarma: Int = 0) : Relojx() {
    /*
    Métodos
- setAlarm(hora, minuto): establece la hora de la alarma.
- tictac(): sobreescribe el método tictac de la superclase.
. incrementa un segundo la hora actual (llamando al método tictac de la superclase)
. si la hora y el minuto del reloj coinciden con los de la alarma,
y el segundo del reloj es 00, muestra el mensaje \"Alarma sonando
     */

    fun setAlarm(hora: Int, minuto: Int) {
        horaAlarma = hora
        minutoAlarma = minuto
    }

    override fun tictac() = super.tictac()
    override fun toString(): String {
        return "Reloj_Alarma2(horaAlarma=$horaAlarma, minutoAlarma=$minutoAlarma)"
    }

    fun comprobarAlarma() = hora == horaAlarma && minuto == minutoAlarma
    fun display2() = "hora=${hora}, minuto=${minuto}, segundo=${segundo}"
}
    /*
    Crea una clase Test con un método main que:
- Cree un reloj-alarma
- Establezca su hora a las 18:35:23
- Establezca la alarma a las 18:52
- Mediante un bucle, llame al método tictac 1000 veces, simulando que han pasado 1000 segundos.
Cada vez que llames a tictac, imprime la hora actual.
* Comprueba que la alarma ha sonado a la hora correcta.
OPCIONAL: Haz que tictac sea llamado cada segundo 'real'. Para eso puedes usar la clase timer.
En tal caso, no realices 1000 llamadas a tictac, puesto requeriría esperar mucho para que el programa finalice.
Haz que tictac sea llamado sólo 10 veces. Por otro lado, haz que, desde la hora inicial del reloj hasta la hora de la alarma,
 haya sólo 5 segundos de diferencia, para que la alarme suene antes de finalizar el programa.
     */

    class Test3() {
        init {
            var reloj_Alarma = Reloj_Alarma2()
            reloj_Alarma.setTime(18, 35, 23)
            reloj_Alarma.setAlarm(18, 52)

            for (i in 0..1000) {
                reloj_Alarma.tictac()
                println(reloj_Alarma.display2())
                if (reloj_Alarma.comprobarAlarma()) println("Alarma sonando!!!")
            }
        }

    }
    fun main()
    {
        val ej = Test3()
        println(ej)
    }