package ejercicios_Clase.practica.POO.herencia.ej1

/*
2
 Ejercicio para hacer de ambas formas herencia y composición nos permitirá ver la diferencia entre ambas
h1 Crea una clase Reloj.
Atributos:
- hora
- minuto
- segundo
 */

open class Relojx {
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
    Métodos
- setTime(hora, minuto, segundo): establece la hora actual.
- display(): muestra por pantalla la hora actual.
- tictac(): incrementa un segundo la hora actual.
* al crear una instancia, la hora será siempre 00:00:00
     */

    fun setTime(hora: Int, minuto: Int, segundo: Int) {
        this.hora = hora
        this.minuto = minuto
        this.segundo = segundo
    }

    fun display() = "hora=$hora, minuto=$minuto, segundo=$segundo"
    open fun tictac() = segundo++

    override fun toString(): String {
        return "Relojx(hora=$hora, minuto=$minuto, segundo=$segundo)"
    }
}
/*
Crea una clase Test con un método main que:
- Cree un reloj
- Establezca su hora a las 18:35:23
- Mediante un bucle, incrementa la hora actual 1000 segundos, e imprima cada vez la hora resultante.
 */

class Test() {
    init {
        val ejReloj = Relojx()
        ejReloj.setTime(18, 35, 23)

        for (i in 0..1000) {
            ejReloj.tictac()
            println(ejReloj)
        }
    }
}

/*
5.2. Reloj-Alarma mediante composición

En su interior crea una clase Reloj-Alarma
Atributos
- reloj (instancia de Reloj)
- horaAlarma
- minutoAlarma
Métodos
- setTime(hora, minuto, segundo): establece la hora actual de atributo reloj.
- display(): muestra por pantalla la hora actual.
- setAlarm(hora, minuto): establece la hora de la alarma.
- tictac():
. incrementa un segundo la hora del atributo reloj (llamando a su método tictac)
. si la hora y el minuto del reloj coinciden con los de la alarma,
y el segundo del reloj es 00, muestra el mensaje \"Alarma sonando!!!\"
 */

class Reloj_Alarma(var reloj: Relojx, var horaAlarma: Int = 0, var minutoAlarma: Int = 0) {
    fun setTime(hora: Int, minuto: Int, segundo: Int) {
        reloj.hora = hora
        reloj.minuto = minuto
        reloj.segundo = segundo
    }

    fun display() = "hora=${reloj.hora}, minuto=${reloj.minuto}, segundo=${reloj.segundo}"
    fun setAlarm(hora: Int, minuto: Int) {
        horaAlarma = hora
        minutoAlarma = minuto
    }

    fun tictac() = reloj.segundo++
    fun comprobarAlarma() = reloj.hora == horaAlarma && reloj.minuto == minutoAlarma
    override fun toString(): String {
        return "Reloj_Alarma(reloj=$reloj, horaAlarma=$horaAlarma, minutoAlarma=$minutoAlarma)"
    }
    /*
    Crea una clase Test con un método main que:
- Cree un reloj-alarma
- Establezca su hora a las 18:35:23
- Establezca la alarma a las 18:52
- Mediante un bucle, incremente la hora actual 1000 segundos, e imprima cada vez la hora resultante.
* Comprueba que la alarma ha sonado a la hora correcta.
     */

}

class Test2() {
    init {
        val reloj = Relojx()
        val alarma = Reloj_Alarma(reloj)
        reloj.setTime(18, 35, 23)
        alarma.setAlarm(18, 52)

        for (i in 0..1000) {
            alarma.tictac()
            println(alarma)
            if(alarma.comprobarAlarma()) println("Alarma sonando!!!")

        }
    }
}

fun main() {
    //var ej = Test()
    //println(ej)
    var ej2 = Test2()
    println(ej2)
}


