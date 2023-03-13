package ejercicios_Clase.practica.examenHerencia

class Gimnasio(var nombre: String, var direccion: String, var listaPersonas: List<Persona>) {
    fun balanceMensualCadaUno() {
        for (item in listaPersonas) {
            println(item.balanceMensual())
        }
    }

    fun balanceTotal(): Double {
        var balanceTotal = 0.0
        for (item in listaPersonas) balanceTotal += item.balanceMensual()
        return balanceTotal
    }

    fun mostrarDatos() = listaPersonas.toList()
}

fun main() {
    val trabajador1 = Trabajador("Carlos", 21, 1250.0, 250.0)
    val trabajador2 = Trabajador("Laura", 30, 1100.0, 350.0)
    val socio1 = Socio("Mario", 15, 3, mutableMapOf())
    socio1.añadirActividad("pilates")
    val socioActividad1 = SocioConActividades("Pepito", 20, 4, mutableMapOf())
    socioActividad1.añadirActividad("pilates")
    socioActividad1.añadirActividad("boxeo") //debe marcarse como otro
    socioActividad1.añadirActividad("baloncesto") //debe de no añadirse
    socioActividad1.añadirActividad("otra cosa") //debe de no añadirse
    val socioActividad2 = SocioConActividades("Maria", 16, 5, mutableMapOf())
    socioActividad2.añadirActividad("karate")
    socioActividad2.añadirActividad("spinning")
    val socioPlus = SocioPlus("Lucas", 26, 6, mutableMapOf())
    socioPlus.añadirActividad("futbol")
    socioPlus.añadirActividad("criquet")
    socioPlus.añadirActividad("futbol-sala")
    socioPlus.añadirActividad("zumba")

    val listaPers = listOf(trabajador1, trabajador2, socio1, socioActividad1, socioActividad2, socioPlus)
    val gym = Gimnasio("Lumpine", "Calle ancha", listaPers)
    println(gym.mostrarDatos())
    gym.balanceMensualCadaUno()
    println(gym.balanceTotal())

}