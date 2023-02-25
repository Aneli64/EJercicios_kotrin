package ejercicios_practica_internet.ejs_Herencia.ej1

abstract class Animal : SerVivo {
    private var nPatas: Int = 0
    private var alas: Boolean = false
    private var tipoPiel = ""
        set(value) {
            if(value in listOf("pelaje", "plumas", "escamas")) field = value
            else print("Valor no valido \n valores disp: \n | pelaje | plumas | escamas |")
        }
    private var tipoHabitat: String = ""
        set(value) {
            if(value in listOf("acuatico", "terrestre", "aereo")) field = value
            else print("Valor no valido \n valores disp: \n | acuatico | terrestre | aereo |")
        }
    private var poneHuevos: Boolean = false
    private var respir: String = ""
        set(value) {
            if(value in listOf("branquias", "nariz")) field = value
            else print("Valor no valido \n valores disp: \n | branquias | nariz |")
        }
    private var desplaz: String = ""
        set(value) {
            if(value in listOf("camina", "nada", "vuela")) field = value
            else print("Valor no valido \n valores disp: \n | camina | nada | vuela |")
        }
    private var habitat: String = ""
    private var tipAlimen: String = ""
    private var alimentos: String = ""
        set(value) {
            if(value in listOf("frutos", "hierba", "otros animales")) field = value
            else print("Valor no valido \n valores disp: \n | frutos | hierba | otros animales |")
        }
    private var venenoso: Boolean = false

    constructor(
        nPatas: Int,
        alas: Boolean,
        tipoPiel: String,
        tipoHabitat: String,
        poneHuevos: Boolean,
        respir: String,
        desplaz: String,
        habitat: String,
        tipAlimen: String,
        alimentos: String,
        venenoso: Boolean
    ) {
        this.nPatas = nPatas
        this.alas = alas
        this.tipoPiel = tipoPiel
        this.tipoHabitat = tipoHabitat
        this.poneHuevos = poneHuevos
        this.respir = respir
        this.desplaz = desplaz
        this.habitat = habitat
        this.tipAlimen = tipAlimen
        this.alimentos = alimentos
        this.venenoso = venenoso
    }

    override fun Respiro() {
        TODO("Not yet implemented")
    }

    override fun MeAlimento() {
        TODO("Not yet implemented")
    }

    override fun Habito() {
        TODO("Not yet implemented")
    }

    override fun MeReproduzco() {
        TODO("Not yet implemented")
    }

    override fun MeDesplazo() {
        TODO("Not yet implemented")
    }
}