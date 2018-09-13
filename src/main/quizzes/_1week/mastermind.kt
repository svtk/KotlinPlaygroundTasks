package quizzes._1week

/* HEAD */
// Mastermind again

/* TASK */
// Complete the following implementation of 'evaluateGuess()' function from the first assignment.

/* CODE */
//sampleStart
data class Evaluation(val positions: Int, val letters: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    val positions = secret.zip(guess).count { /*[mark]*/TODO()/*[/mark]*/ }

    val commonLetters = "ABCDEF".sumBy { ch ->

        Math.min(secret.count { /*[mark]*/TODO()/*[/mark]*/ }, guess.count { /*[mark]*/TODO()/*[/mark]*/ })
    }
    return Evaluation(positions, commonLetters - positions)
}

fun main(args: Array<String>) {
    val result = Evaluation(positions = 1, letters = 1)
    evaluateGuess("BCDF", "ACEB") eq result
    evaluateGuess("AAAF", "ABCA") eq result
    evaluateGuess("ABCA", "AAAF") eq result
}
//sampleEnd
infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}