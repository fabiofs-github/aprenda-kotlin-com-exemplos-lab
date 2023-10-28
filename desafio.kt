package principal

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val identificador: Int, val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableSetOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {

    val conteudoBD : ConteudoEducacional = ConteudoEducacional(
        "Modelagem e Projeto de Banco de Dados",
        120,
        Nivel.BASICO
    )

    val conteudoPI : ConteudoEducacional = ConteudoEducacional(
        "Projeto Integrador",
        120,
        Nivel.INTERMEDIARIO
    )

    val formacao: Formacao = Formacao("Engenharia de Software", listOf(conteudoBD,conteudoPI))

    val usuario = Usuario(1, "Fulano da Silva")

    formacao.matricular(usuario)


    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
