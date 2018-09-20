data class Evaluation(val positions: Int, val letters: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    val positions = secret.zip(guess).count { TODO() }

    val commonLetters = "ABCDEF".sumBy { ch ->

        Math.min(secret.count { TODO() }, guess.count { TODO() })
    }
    return Evaluation(positions, commonLetters - positions)
}

fun main(args: Array<String>) {
    val result = Evaluation(positions = 1, letters = 1)
    evaluateGuess("BCDF", "ACEB") eq result
    evaluateGuess("AAAF", "ABCA") eq result
    evaluateGuess("ABCA", "AAAF") eq result
}