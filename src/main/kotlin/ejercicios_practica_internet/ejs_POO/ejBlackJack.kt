package ejercicios_practica_internet.ejs_POO
class Partida(var n_jugadores:Int) {
    fun inicio() {
        println("Introduzca numero de jugadores")
        val n_jugs = readln()

        while (!cond_vic()) {

        }
    }

    fun turno(): Boolean {
        println("¿Quiere otra carta? |SI | NO| ")
        val entrada = readln()
        return entrada == "SI"
    }

    //fun cond_vic():
fun main() {
    val barajaCoraz = mutableListOf<String>()
    for (i in 1..13) {
        if (i % 11 == 0) barajaCoraz.add("Jota" + "Corazones")
        else if (i % 12 == 0) barajaCoraz.add("Reina" + "Corazones")
        else if (i % 13 == 0) barajaCoraz.add("Rey" + "Corazones")
        else barajaCoraz.add("$i" + "Corazones")
    }

    val barajaDiam = mutableListOf<String>()
    for (i in 1..13) {
        if (i % 11 == 0) barajaDiam.add("Jota" + "Diamantes")
        else if (i % 12 == 0) barajaDiam.add("Reina" + "Diamantes")
        else if (i % 13 == 0) barajaDiam.add("Rey" + "Diamantes")
        else barajaDiam.add("$i" + "Diamantes")
    }

    val barajaTreb = mutableListOf<String>()
    for (i in 1..13) {
        if (i % 11 == 0) barajaTreb.add("Jota" + "Treboles")
        else if (i % 12 == 0) barajaTreb.add("Reina" + "Treboles")
        else if (i % 13 == 0) barajaTreb.add("Rey" + "Treboles")
        else barajaTreb.add("$i" + "Treboles")
    }

    val barajaPicas = mutableListOf<String>()
    for (i in 1..13) {
        if (i % 11 == 0) barajaPicas.add("Jota" + "Picas")
        else if (i % 12 == 0) barajaPicas.add("Reina" + "Picas")
        else if (i % 13 == 0) barajaPicas.add("Rey" + "Picas")
        else barajaPicas.add("$i" + "Picas")
    }

    val baraja = barajaCoraz + barajaDiam + barajaTreb + barajaPicas
    println(baraja)
}