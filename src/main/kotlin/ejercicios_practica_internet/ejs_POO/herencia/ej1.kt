package ejercicios_practica_internet.ejs_POO.herencia

import java.awt.AWTPermission

/*
9.Desarrolla una clase persona que contenga los siguientes atributos: Nombre, Apellidos,
DNI. Para esta clase habrá que definir los siguientes atributos:
- Un constructor por defecto y un constructor que reciba el valor de los atributos
como argumento.
- Los métodos get y set de los atributos
- Un método mostrar info que muestre por pantalla la siguiente información:
DNI: <DNI>
Nombre: <Apellidos>, <Nombre>
 */

open class Persona(var Nombre: String, var Apellidos: String, var DNI: String) {
    fun nombApe() = "$Apellidos, $Nombre"
    fun DNI() = "DNI -> $DNI"
}

/*
10. Desarrolla una clase empleado que herede de la clase persona y que contenga además
los siguientes atributos: Fecha_contrato como cadena de texto, sueldo_base y
base_horas_extra como decimales y num_horas_extra como entero. Además se
implementarán los siguientes métodos:
- Un constructor por defecto y otro que reciba como parámetro el valor de los
atributos.
- Los métodos get y set de los nuevos atributos.
- Un método calcular_sueldo que devuelva un decimal con el sueldo del empleado
calculado de la siguiente forma:
Sueldo_base+(base_horas_extra*num_horas_extra)
 */

open class Empleado(
    Nombre: String,
    Apellidos: String,
    DNI: String,
    private var Fecha_contrato: String,
    private var sueldo_base: Double,
    private var base_horas_extra: Double,
    private var num_horas_extra: Int
) : Persona(Nombre, Apellidos, DNI) {
    fun calcular_sueldo() = sueldo_base + (base_horas_extra * num_horas_extra)
}

/*
11. Desarrolla una clase directivo que herede de la clase empleado, además dispondrá de
los siguientes atributos: plus_dirección y dietas como decimal y cargo como cadena de
texto.
- Un constructor por defecto y otro que reciba todos los parámetros por argumento.

- Un método calcular sueldo que se calcule como el de empleado más el
plus_dirección y las dietas.
- Un método imprimir nómina que muestre la siguiente información:
----------------------------------
NÓMINA
----------------------------------
DNI: <DNI>
Nombre: <Apellidos>, <Nombre>
Cargo: <Cargo>
Sueldo: <sueldo_total>
 */

class Directivo(
    Nombre: String,
    Apellidos: String,
    DNI: String,
    Fecha_contrato: String,
    sueldo_base: Double,
    base_horas_extra: Double,
    num_horas_extra: Int,
    private var plus_direccion: Double,
    private var dietas: Int,
    private var cargo: String
) : Empleado(Nombre, Apellidos, DNI, Fecha_contrato, sueldo_base, base_horas_extra, num_horas_extra) {
    open fun imprimirNomina() =
        "${"-".repeat(35)} \n NÓMINA \n ${"-".repeat(35)} \n DNI: $DNI \n Nombre: $Apellidos, $Nombre \n Cargo: $cargo \n Sueldo: ${calcular_sueldo()}"
}

/*
12. Desarrolla una clase programador que herede de la clase empleado que no tenga
atributos adicionales pero que contenga los siguientes métodos:
- Un constructor por defecto y otro que reciba todos los parámetros por argumento.
- Un método pedir_vacaciones que devuelva el siguiente mensaje:
“Hay que llegar a la siguiente entrega como sea, hasta entonces nadie puede
coger vacaciones”
- Un método pedir_aumento que devuelva el siguiente mensaje:
“El jefe de departamento está de vacaciones inténtelo de nuevo cuando
vuelva”
- Un método imprimir nómina que muestre la siguiente información:
----------------------------------
NÓMINA
----------------------------------
DNI: <DNI>
Nombre: <Apellidos>, <Nombre>
Sueldo: <sueldo_total>
 */
/*
class Programador(
    Nombre: String,
    Apellidos: String,
    DNI: String,
    Fecha_contrato: String,
    base_horas_extra: Double,
    num_horas_extra: Int,
    sueldo_base: Double
) : Empleado(Nombre, Apellidos, DNI, Fecha_contrato, base_horas_extra, num_horas_extra, sueldo_base) {
    fun pedir_vacaciones() =
        "Hay que llegar a la siguiente entrega como sea, hasta entonces nadie puede coger vacaciones"

    fun pedir_aumento() = "El jefe de departamento está de vacaciones inténtelo de nuevo cuando vuelva"
    fun imprimirNomina() =
        "${"-".repeat(35)} \n NÓMINA \n ${"-".repeat(35)} \n DNI: $DNI \n Nombre: $Apellidos, $Nombre \n Sueldo: ${calcular_sueldo()}"
}

/*
13. Desarrolla una clase ejecutar en la que se cree un programador y un directivo y se
inicialicen. Después se imprimirá la nomina del directivo, el programador pedirá
vacaciones y un aumento y después se imprimirá su nomina.
 */

class ejecutar() {
    val director = Directivo(
        "Elian", "Deniz Saiz", "937549345F", "02/08/2021", 1200.0,
        9.0, 3, 200.0, 100, "TIC CEO"
    )
    var progam = Programador("Pepe", "Lopez Hernandez", "74939034R", "09/11/2022", 9.0, 4, 1400.0)

}

fun main() {


}

 */