package ejercicios_Clase.practica.POO.herencia

/*
Herencia – Interfaces


Extiende el ejemplo de Shape (como clase abstracta), Circle, Rectagle y Square

Interfaces.1. Desarrolla la clase Polygon que herede de Shape, contendrá un atributo apotema
como decimal. Deberá implementar si es posible los métodos abstractos de la clase
figura. ¿existe algún problema?
Interfaces.2. Desarrolla una clase RegularPolygon que herede de Polygon y solucione los posibles
problemas que hayan podido aparecer en la clase Polygon.
Interfaces.3. Desarrolla la interfaz Printable esta interfaz definirá los siguientes métodos:
- printScreen: este método no recibirá ni devolverá nada y mostrará por pantalla
todos los elementos de la clase que lo implemente.
- saveToFile: este método guardará en un fichero recibido como parámetro el valor de
todos los elementos de la clase que lo implemente.
Interfaces.4. Modifica la clase Circle para que implemente la interfaz Printable.
Interfaces.5. Crea un main donde crees un objeto de cada clase y muestres por pantalla la
información de cada uno de ellos.
 */

abstract class Shape()
{

}

class Polygon(var apotema: Double) : Shape(){

}