class Patinete (){

    var rodas = 0
    var guidao = ""
    var km = 0.0
    var motor = false
    var buzina = false
    var lanterna = false
    var lantOnOff = false
    var cor = ""

    fun buzinar(){
        if(buzina){
            println("BIIIIII")
        } else {
            println("Esse patinete não tem buzina")
        }
    }
    fun acelerar(valor: Double){
        km += valor
    }
    fun freiar(valor: Double){
        km -= valor

        if (km < 0){
            km = 0.0
        }
    }
    fun acenderLant (){
        if(lanterna) {
            lantOnOff = !lantOnOff

        }
    }

    override fun toString(): String {
        return "Buzina - $buzina" +
                "\nVelocidade - $km" +
                "\nLanterna - $lanterna"
    }
}