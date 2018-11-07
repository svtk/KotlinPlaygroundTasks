package quizzes._1week

/* HEAD */
// Mastermind in a functional style

/* TASK */
// You can skip this task for now.
// We'll return to it later after discussing functions for working with collections in a functional style.
// NL
// Complete the following implementation of 'evaluateGuess()' function.
// Then compare your solution with the solution written in a functional style.

/* LINK */

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