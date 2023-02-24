package ejercicios_Clase.practica.POO.herencia.ej4

/*
La clase Person implementa la interface PersonInterface.
Tiene 4 atributos:    cashSaving y retirementFund de tipo entero y, firstName y     lastName de tipo cadena.
Un constructor por parámetros para todos sus atributos
La implementación del método computeTotalWealth() es :
cashSaving + retirementFund
La implementación del método getName() es :
firstName + " " + lastName
 */
class Person(var cashSaving: Int, var retirementFund: Int, var firstName: String, var lastName: String) :
    PersonInterface {
    override fun computeTotalWealth() = cashSaving + retirementFund
    override fun getName() = "$firstName $lastName"
}