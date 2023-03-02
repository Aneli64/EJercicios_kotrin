package ejercicios_Clase.practica.POO.herencia.ej6

class AguaMineral() : Bebida() {
    var manantialOrigen: String = ""

    constructor(
        identificador: Int, litros: Double, precio: Double,
        marca: String, manantialOrigen: String
    ) : this() {
        super.identificador = identificador
        super.litros = litros
        super.precio = precio
        super.marca = marca
        this.manantialOrigen = manantialOrigen
    }
}