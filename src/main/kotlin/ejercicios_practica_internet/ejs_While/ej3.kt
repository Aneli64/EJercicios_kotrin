package ejercicios_practica_internet.ejs_While

/*
En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un
programa que lea los sueldos que cobra cada empleado e informe cuántos empleados cobran
entre $100 y $300 y cuántos cobran más de $300. Además el programa deberá informar
el importe que gasta la empresa en sueldos al personal.
 */

fun main()
{
    print("Introduzca el numero de empleados: ")
    val nEmp = readln().toInt()
    var emp100y300 = 0
    var emp300 = 0
    var gastoEmp = 0.0
    for (i in 1..nEmp)
    {
        print("Introduzca su sueldo -> ")
        val sueldo = readln().toFloat()
        while(sueldo !in (100.0..500.0))
        {
            print("Sueldo erroneo (debe de estar entre 100 y 500) -> ")
            val sueldo = readln().toFloat()
        }
        if (sueldo in (100.0..300.0)) emp100y300 ++
        if (sueldo >= 300.0) emp300 ++
        gastoEmp += sueldo
    }

    println("Numero de empleados con sueldo entre 100 y 300 -> $emp100y300")
    println("Numero de empleados con sueldo igual o mayor 300 -> $emp300")
    println("Gasto total de la empresa -> $gastoEmp")

    var numero = 7
    var numero2 = 8


}