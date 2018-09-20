package quizzes._4week

/* HEAD */
// Fibonacci numbers

/* TASK */
// Implement the function that builds a sequence of Fibonacci numbers
// using buildSequence function

/* CODE */
import kotlin.coroutines.experimental.buildSequence

fun fibonacci(): Sequence<Int> = buildSequence {
    TODO()
}

fun main(args: Array<String>) {
    println(fibonacci().take(10).toList())
    // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
}

/* SOLUTION */
fun fibonacci1() = buildSequence {
    var terms = Pair(0, 1)

    // this sequence is infinite
    while (true) {
        yield(terms.first)
        terms = Pair(terms.second, terms.first + terms.second)
    }
}