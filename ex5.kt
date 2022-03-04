fun main() {
    /*Crie uma classe patinete e apresente os atributos
    e métodos referentes esta classe, em seguida crie
    um objeto patinete, defina as instancias deste objeto
    e apresente as informações deste objeto no console.*/

    val patinete = Patinete()

    patinete.buzina = true
    patinete.lanterna = true

    patinete.acelerar(10.0)
    patinete.buzinar()
    patinete.acenderLant()

    println(patinete)

    patinete.freiar(20.0)
    patinete.acenderLant()

    println(patinete)
}