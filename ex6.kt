fun main() {
    /*Crie uma classe conta bancaria e apresente os atributos
    e métodos referentes esta classe, em seguida crie um objeto
    conta bancaria, defina as instancias deste objeto e apresente
    as informações deste objeto no console.*/

    val conta = ContaBanco()

    conta.titular = "Samara"
    conta.tipo = 1
    conta.saldo = 2000.0

    conta.mostrarSaldo()
    conta.deposito(200.0)
    conta.saque(500.0)

    println(conta)


}