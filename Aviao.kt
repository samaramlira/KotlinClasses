class Aviao {

    var asa = true
    var motor = true
    var km = 0.0
    var buzina = false
    var lanterna = false
    var lantOnOff = false
    var acentosLivres = 0

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
    fun comprarPass (){
        if(acentosLivres > 0) {
            println("Comprar passagem")
        } else {
            println("Não tem acentos disponiveis")
        }
    }
    override fun toString(): String {
        return "Buzina - $buzina" +
                "\nVelocidade - $km" +
                "\nLanterna - $lanterna" +
                "\nAcentos Livres - $acentosLivres"
    }


}