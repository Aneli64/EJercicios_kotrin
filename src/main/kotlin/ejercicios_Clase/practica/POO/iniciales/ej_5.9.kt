package ejercicios_Clase.practica.POO.iniciales

/*
Implementa una clase Alumno que represente a los alumnos de una asignatura. De cada alumno interesa conocer su dni, su edad y su nota de cada trimestre.
Además de definir los atributos necesarios para representar las características
mencionadas, habrá que implementar:
- un constructor que reciba el valor del dni y la
edad, el resto se inicializarán por defecto.El valor por defecto de cada
trimestre será -1 para indicar que este trimestre aún no se ha evaluado.
- Los métodos que permitan acceder a dichos atributos (get). Uno por cada
atributo.
- Los métodos que permitan modificar dichos atributos, recibiendo el nuevo
atributo como parámetro (set(nuevoValor)).
- Un método nota final que devuelva la media de los tres trimestres. En el
caso de que algún trimestre aún no haya sido evaluado, entonces se
devolverá un -1 para indicar que aún no se puede evaluar. (nota entre 1 y 10)
- Un método informeAlumno que muestre por pantalla todos los datos del
alumno: DNI, edad, notas de los tres trimestres y nota final.
 */

class Alumno(var DNI: String, var edad: Int, var Trimestres: Array<Int> = arrayOf(-1, -1, -1)) {

    fun informeAlumno(): String {
        var trims = mutableListOf<Int>()
        for (item in Trimestres) trims.add(item)
        return "alumno: DNI='$DNI', edad=$edad, \n" + "Notas del Trimestre -> [$trims]" + "\n " + "Nota Final -> ${media(Trimestres)}"
    }

    fun media(trimestres: Array<Int>): Int {
        var notas = 0
        return if (trimestres.any { it == -1 }) -1
        else {
            for (i in trimestres) notas += i
            (notas / 3)
        }
    }
}

fun main() {
    var alumno1 = Alumno("75839434T", 16, arrayOf(5, 5))
    var alumno2 = Alumno("85639334R", 15, arrayOf(7, 6))

    println(alumno1.informeAlumno())
    println(alumno2.informeAlumno())
}