// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String){
    override fun toString(): String{
    return "Usuario = nome '$nome'"}
    
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
       // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
       
        inscritos.add(usuario) 
    
    }
}

fun main() {
   // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val joao = Usuario("João")
   	val sergio = Usuario("Sérgio")
	 val formacao = Formacao("Programação Kotlin", listOf(ConteudoEducacional("Introdução ao Kotlin"), ConteudoEducacional("Programação Orientada a Objetos em Kotlin")))

    // Matriculando os usuários na formação
    formacao.matricular(joao)
    formacao.matricular(sergio)
    println("Usuários: ${formacao.inscritos}, Níveis: ${Nivel.values()[2]}")
	println(formacao)

}