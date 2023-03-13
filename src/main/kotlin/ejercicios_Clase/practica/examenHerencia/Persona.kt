package ejercicios_Clase.practica.examenHerencia

abstract class Persona {
    var nombre: String = ""
    var edad: Int = 0
        set(value) {
            if (value >= 16) field = value
        }
    abstract fun balanceMensual():Double

    override fun toString(): String {
        return "Persona(nombre='$nombre', edad=$edad)"
    }
}