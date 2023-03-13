package ejercicios_Clase.practica.examenHerencia

class Trabajador(): Persona() {
    var sueldo: Double = 0.0
        set(value) {
            if (value > 0) field = value
        }
    var seguridadSocial = 0.0
        set(value) {
            if (value > 0) field = value
        }
    override fun balanceMensual() = - (sueldo + seguridadSocial)
    override fun toString(): String {
        return "Trabajador(nombre='$nombre', edad=$edad, sueldo=$sueldo, seguridadSocial=$seguridadSocial)"
    }

    constructor(nombre: String, edad: Int, sueldo: Double, seguridadSocial: Double) : this()
    {
        super.nombre = nombre
        super.edad = edad
        this.sueldo = sueldo
        this.seguridadSocial = seguridadSocial
    }
}