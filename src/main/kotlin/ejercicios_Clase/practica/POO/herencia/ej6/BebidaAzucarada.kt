package ejercicios_Clase.practica.POO.herencia.ej6

class BebidaAzucarada() : Bebida() {
    var porcentajeAzucar: Double = 0.0
    var promocion: Boolean = false

    constructor(
        identificador: Int, litros: Double, precio: Double,
        marca: String, porcentajeAzucar: Double, promocion: Boolean
    ) : this() {
        super.identificador = identificador
        super.litros = litros
        super.precio = precio
        super.marca = marca
        this.porcentajeAzucar = porcentajeAzucar
        this.promocion = promocion

    }

    override fun Calcular(cant_prod: Int) =
        if (promocion) (cant_prod * precio) - ((cant_prod * precio) * 0.10) else cant_prod * precio

}