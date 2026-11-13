fun main() {
    val senhaCorreta = "admin123"
    var tentativaAtual = 0

    while (true) {
        tentativaAtual++


        val senhaDigitada = when (tentativaAtual) {
            1 -> "12345"
            2 -> "senhaErrada"
            3 -> "123admin"
            else -> "admin123"
        }

        println("Tentativa $tentativaAtual: Senha digitada -> '$senhaDigitada'")


        if (tentativaAtual > 3) {
            println("Sistema Bloqueado por Segurança")
            break
        }


        if (senhaDigitada == senhaCorreta) {
            println("Acesso Permitido!")
            break
        }
    }
}