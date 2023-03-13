package ejercicios_Clase.practica.examenHerencia

class SocioConActividades(nombre: String, edad: Int, numeroSocio: Int, actividadesPosibles: MutableMap<Int, String>) : Socio(nombre, edad, numeroSocio, actividadesPosibles) {

    //falta el constructor secundario sin la lista de actividades
    /*constructor(nombre: String, edad: Int, numeroSocio: Int) : this(nombre, edad, numeroSocio) {
        this.nombre = nombre
        this.edad = edad
        this.numeroSocio = numeroSocio
    }*/

    override fun balanceMensual(): Double {
        val contActiv = actividadesPosibles.count() //actividadesPosibles.entries.count()??
        val importeActMenor = if ((contActiv * 10) > 40) 40 else contActiv * 10
        val importeActMayor = if ((contActiv * 10) > 60) 60 else contActiv * 10
        var balance = 0.0
        balance = if (edad < 18) 20.0 + importeActMenor else 35.0 + importeActMayor

        return balance
    }


}