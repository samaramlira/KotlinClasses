fun main() {
    /*Crie uma classe avião e apresente os atributos
    e métodos referentes esta classe, em seguida crie
    um objeto avião, defina as instancias deste objeto
    e apresente as informações deste objeto no console.*/

    val aviao = Aviao ()

    aviao.buzina = true
    aviao.lanterna = true
    aviao.acentosLivres = 20

    aviao.acelerar(10.0)
    aviao.buzinar()
    aviao.acenderLant()
    aviao.comprarPass()

    println(aviao)

    aviao.freiar(20.0)
    aviao.acenderLant()

    println(aviao)
}

