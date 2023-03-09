package ejercicios_practica_internet.ejs_Herencia.ej5

class Ejercito(private val listaUnidades: MutableList<Unidad> = mutableListOf<Unidad>()){
    fun addUnidad(unidad: Unidad) = listaUnidades.add(unidad)
    fun buscUnidNom(nombre: String) {
        for (item in listaUnidades) if(item.nombre == nombre) {
            print("Nombre encontrado")
        }
        print("Nombre no encontrado")
    }


}