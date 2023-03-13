package ejercicios_Clase.practica.examenHerencia

open class Socio() : Persona() {

    companion object {
        val activDisp = mutableMapOf<Int, String>(0 to "karate", 1 to "spinning", 2 to "pilates")
        var cont = 0
        var contIguales = 0
    }

    var numeroSocio: Int = 0
        set(value) {
            if (numeroSocio > 0) field = value
        }
    var actividadesPosibles: MutableMap<Int, String> = mutableMapOf() //deberia ser private

    open fun añadirActividad(actividad: String) {
        if (actividad in activDisp.values) {
            actividadesPosibles[cont] = actividad
            cont++
        }
        else{
            if (contIguales < 1) {
                actividadesPosibles[cont] = "otro"
                contIguales++
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