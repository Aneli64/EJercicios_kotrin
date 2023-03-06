package ejercicios_practica_internet.ejs_Herencia

fun main() {

    // test(geometricSequenceElements(2, 3, 5), "2, 6, 18, 54, 162")
    fun geometricSequenceElements(a: Int, r: Int, n: Int) {
        var result = ""
        for (i in 1..n) {
            var product = 0
            if (i == 1) result += "$a, "
            product += r * a
            result += "$product, "
        }
    }

}