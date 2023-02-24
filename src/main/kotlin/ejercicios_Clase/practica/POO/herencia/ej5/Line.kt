package ejercicios_Clase.practica.POO.herencia.ej5

import ejercicios_Clase.practica.POO.herencia.ej3.RelationInterface

/*
Escribir Line.java.
La clase Line implementa la interface RelationInterface.
Tiene cuatro atributos decimales: x1, x2, y1 e y2
Un constructor por parámetros para todos sus atributos
Un nuevo método getLength()

double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
return length;

Implementa los métodos isGreater(), isLess(), isEquals() definidos en la interface
 */
class Line(var x1: Double, var x2: Double, var y1: Double, var y2: Double) : RelationInterface {

    fun getLength() = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1))
    override fun isGreater(a: Any): Boolean {
        TODO("Not yet implemented")
    }
    override fun isLess(a: Any): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEqual(a: Any): Boolean {
        TODO("Not yet implemented")
    }
}