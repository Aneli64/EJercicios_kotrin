package ejercicios_Clase.practica.POO

/*
Se quiere crear una clase Cuenta la cual se caracteriza por tener asociado un número de cuenta y un saldo disponible. Además, se puede consultar el saldo disponible,
recibir abonos y realizar pagos. Crear además una clase Persona, que se caracteriza por un DNI y unA LISTA de 3 cuentas (o lista de 1 a 3 cuentas)
(Preguntar al profesor si tienes dudas sobre array ) de cuentas bancarias. La Persona puede tener asociada hasta 3 cuentas bancarias, y debe tener un método que permita
añadir cuentas (hasta 3 que es el máximo). También debe contener un método que devuelva si la persona es morosa (si tienen alguna cuenta con saldo negativo).
 */

class Cuenta(var num_cuenta: Int, var saldo_disp: Double) {
    fun consultSaldo() = saldo_disp

    fun recibirAbono(abono: Double)
    {
        saldo_disp += abono
    }

    fun realizarPago(pago: Double) {
        saldo_disp -= pago
    }

    override fun toString(): String {
        return "Cuenta(num_cuenta=$num_cuenta, saldo_disp=$saldo_disp)"
    }

}

class Persona(var DNI: String, var cuentas: MutableList<Cuenta> = mutableListOf()) {

    fun añadirCuenta(cuenta: Cuenta) = if (cuentas.size < 3) cuentas.add(cuenta) else println("Ha excedido el numero de cuentas, se han añadido sus 3 primeras")

    override fun toString(): String {
        return "Persona(DNI='$DNI', cuentas=$cuentas)"
    }

    fun morosa() = (cuentas.any { it.saldo_disp < 0 })
}

fun main() {

    /*
    En el programa principal, instanciar un objeto Persona con un DNI cualquiera, así como dos objetos cuenta, una sin saldo inicial y otra con 700 euros.
     */

    var ej = Persona("123432F")
    var cuenta1 = Cuenta(324526, 0.0)
    var cuenta2 = Cuenta(235074, 700.0)
    ej.añadirCuenta(cuenta1)
    ej.añadirCuenta(cuenta2)

    // La persona recibe la nómina mensual, por lo que ingresa 1100 euros en la primera cuenta, pero tiene que pagar el alquiler de 750 euros con la segunda.

    cuenta1.recibirAbono(1100.0)
    cuenta2.realizarPago(750.0)
    println(ej)

    /*
    Imprimir por pantalla si la persona es morosa.
    */

    if (ej.morosa()) println("Es morosa") else println("No es morosa")

    /* Posteriormente hacer una transferencia de una cuenta a otra (de forma que todos los saldos sean positivos)
    y mostrar por pantalla el estado de la persona. */

    cuenta1.realizarPago(1000.0)
    cuenta2.recibirAbono(1000.0) //Falta que lo haga en una linea, como en la vida real, solo hace falta conocer la cuenta2 para su transferencia, no hacer dos operaciones
    println(ej)
    if (ej.morosa()) println("Es morosa") else println("No es morosa")

}