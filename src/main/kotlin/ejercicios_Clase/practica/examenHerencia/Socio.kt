package ejercicios_Clase.practica.examenHerencia

open class Socio() : Persona() {

    companion object {
        var cont = 0
        var contIguales = 0
    }

    var numeroSocio: Int = 0
        set(value) {
            if (numeroSocio > 0) field = value
        }
    var actividadesPosibles: MutableMap<Int, String> = mutableMapOf() //deberia ser private

    open fun añadirActividad(actividad: String) {
        if (actividad in listOf("karate", "spinning")) {
            when (actividad) { //revisar este when
                "karate" -> {
                    actividadesPosibles[cont] = actividad
                    cont++
                }

                "spinning" -> {
                    actividadesPosibles[cont] = actividad
                    cont++
                }

                else -> {
                    if (contIguales < 1) {
                        actividadesPosibles[cont] = "otro"
                        cont++
                    }
                }
            }
        }
    }

    override fun balanceMensual() = if (edad < 18) 20.0 else 35.0
    override fun toString(): String {
        return "Socio(nombre='$nombre', edad=$edad, numeroSocio=$numeroSocio, actividadesPosibles='$actividadesPosibles')"
    }

    constructor(nombre: String, edad: Int, numeroSocio: Int, actividadesPosibles: MutableMap<Int, String>) : this() {
        super.nombre = nombre
        super.edad = edad
        this.numeroSocio = numeroSocio
        this.actividadesPosibles = actividadesPosibles
    }
}