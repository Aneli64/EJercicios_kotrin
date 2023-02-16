package ejercicios_Clase.practica.POO.herencia.ej2

/*
Finalmente hay que implementar la clase Alquiler que implemente a Alquilable ,
la cual no permite que nadie herede de ella, que es la encargada de gestionar
 los pedidos de alquileres. Un alquiler puede contener más de un vehículo (de cualquier tipo)
 y con duraciones diferentes. Deberá implementar:

Una lista pedido donde almacenar los datos de todos los vehículos que se alquilen.
Un atributo común para todos los alquileres con el nombre de la empresa.
Un constructor por parámetros que reciba el número de vehículos a alquilar,
pida por menú el tipo de vehículo a crear por cada uno (coche, bus, furgoneta ocamión))
que pida por teclado la información necesaria para cada uno de estos vehículos
(matricula, duración, plazas, tara).

 */
class Alquiler(var listaPedido: MutableList<Vehiculo>, var empresa: String) : Alquilable{
    override fun importeTotal(): Double {
        TODO("Not yet implemented")
    }

    fun menu(){
        println("Introduzca el numero de articulos a alquilar: ")
        val numCoches = readln().toInt()

        for (i in 0..numCoches){
            println("Tipo de coche a alquilar \n 1-Coche \n 2-Bus \n 3-Furgoneta \n 4-Camion)")
            val tipoCoche = readln().toInt()
            when(tipoCoche) {
                1 -> {
                    var ej = Furgoneta()
                    ej.Tara = 5
                }
                2 -> ""
                3 -> ""
                4 -> ""
            }
       }
    }
}

/*
Un método importeTotal que devuelva el total del alquiler de un pedido
Un método importe(pos) que devuelva el importe del vehículo indicado


Total alquiler: cantidad €
----------------------------------
DETALLE
---------------------------------
VEHÍCULO 1
Información del vehículo
.
.
.
VEHÍCULO 1
Información del vehículo

Por último crea un main  que pida cuántos vehículos se quieren alquilar
se cree un alquiler y se muestre su información tanto por pantalla
 */