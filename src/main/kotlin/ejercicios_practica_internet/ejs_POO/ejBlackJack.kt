package ejercicios_practica_internet.ejs_POO

class Partida(var n_jugadores:Int)
{
    fun inicio()
    {
        val barajaCoraz = mutableListOf<String>()
        for (i in 1..12) barajaCoraz.add("$i" + "Corazones")
    }
}
fun main()
{

}