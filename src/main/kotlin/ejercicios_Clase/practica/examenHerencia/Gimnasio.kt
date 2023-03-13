package ejercicios_Clase.practica.examenHerencia

class Gimnasio(var nombre: String, var direccion: String, var listaPersonas: List<Persona>) {

    companion object {
        private val trabajador1 = Trabajador("Carlos", 21, 1200.0, 250.0)
        private val trabajador2 = Trabajador("Laura", 30, 1400.0, 350.0)
        private val socio1 = Socio("Mario", 15, 3, mutableMapOf())
        private val socioActividad1 = SocioConActividades("Pepito", 20, 4, mutableMapOf()) //POR DEFECOT HAY TRES ACTIVIDADES MIRAARRR
        private val socioActividad2 = SocioConActividades("Maria", 16, 5, mutableMapOf())
        private val socioPlus = SocioPlus("Lucas", 26, 6, mutableMapOf())

        val listaPers = listOf(trabajador1, trabajador2, socio1, socioActividad1, socioActividad2, socioPlus)
    }

    fun balanceMensualCadaUno() {
        for (item in listaPers) {
            println(item.balanceMensual())
        }
    }

    fun balanceTotal(): Double {
        var balanceTotal = 0.0
        for (item in listaPers) balanceTotal += item.balanceMensual()
        return balanceTotal
    }
}

fun main() {
    val gym = Gimnasio("Lumpine", "Calle ancha", Gimnasio.listaPers)
    gym.balanceMensualCadaUno()
    println(gym.balanceTotal())

}