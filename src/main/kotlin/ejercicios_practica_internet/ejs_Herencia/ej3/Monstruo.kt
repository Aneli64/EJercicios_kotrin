package ejercicios_practica_internet.ejs_Herencia.ej3

abstract class Monstruo: IMonstruo{
    var poderDeAtaque: Int = 0
        set(value) {
            field = if (poderDeAtaque < 0) 0 else value
        }

}