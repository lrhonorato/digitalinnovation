package one.digitalinnovation.digionebank

class Pessoa{
    val nome: String = "Jether"
    val cpf: String = "123.123.123-12"
    private set
}

fun main() {
    val jether = Pessoa()

    println(jether)
    println(jether.nome)
    println(jether.cpf)
}