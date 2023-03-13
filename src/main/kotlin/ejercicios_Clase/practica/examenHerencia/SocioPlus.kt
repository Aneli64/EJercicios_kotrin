package ejercicios_Clase.practica.examenHerencia

class SocioPlus(nombre: String, edad: Int, numeroSocio: Int, actividadesPosibles: MutableMap<Int, String>) : Socio(nombre, edad, numeroSocio, actividadesPosibles) {

    override fun balanceMensual() = if(edad < 18) 40.0 else 60.0
    override fun añadirActividad(actividad: String){
        actividadesPosibles[cont] = actividad
    }

    override fun toString(): String {
        return "SocioPlus(nombre='$nombre', edad=$edad, numeroSocio=$numeroSocio, actividadesPosibles='$actividadesPosibles')"
    }
}