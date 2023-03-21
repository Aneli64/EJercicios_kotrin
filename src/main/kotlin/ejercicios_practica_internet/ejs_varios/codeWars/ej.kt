package ejercicios_practica_internet.ejs_varios.codeWars

fun alphabetWar(fight: String): String{
    val iz = "wpbs"
    val der = "mqdz"
    val valores = listOf(4,3,2,1)
    var puntosIzq = 0
    var puntosDer = 0
    for (item in fight){
        if (item in iz) puntosIzq += valores[iz.indexOf(item)]
        if (item in der) puntosDer += valores[der.indexOf(item)]
    }
    return if(puntosIzq > puntosDer) "Gana izquierda" else "Gana derecha"
}

fun alphabetWar2(fight: String): String{
    var puntosIzq = 0
    var puntosDer = 0
    val valores = listOf(4,3,2,1)
    fight.forEach { if(it in "wpbs") puntosIzq += valores["wpbs".indexOf(it)] ; if(it in "mqdz") puntosDer += valores["mqdz".indexOf(it)]}
    if(puntosIzq > puntosDer) return "Left side wins!" ; return if (puntosIzq < puntosDer) "Right side wins!" else "Let's fight again!"
}
fun main(){
    print(alphabetWar("wmq"))
    print(alphabetWar2("wmq"))
}