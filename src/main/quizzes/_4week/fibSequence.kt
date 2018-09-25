package quizzes._4week.fib

/* HEAD */
// Fibonacci sequence

/* TASK */
// Implement the function that builds a sequence of Fibonacci numbers
// using 'sequence' function ('buildSequence' is its old name).

/* LINK */
// https://www.coursera.org/learn/kotlin-for-java-developers/lecture/25I1A/solution-fibonacci-sequence

/* CODE */
import kotlin.coroutines.experimental.buildSequence
//sampleStart
fun fibonacci(): Sequence<Int> = buildSequence {
    TODO()
}

fun main(args: Array<String>) {
    fibonacci().take(4).toList().toString() eq
            "[0, 1, 1, 2]"

    fibonacci().take(10).toList().toString() eq
            "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
}
//sampleEnd

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}

/* SOLUTION */
fun fibonacci1() = buildSequence {
    var elements = Pair(0, 1)

    // this sequence is infinite
    while (true) {
        yield(elements.first)
        elements = Pair(elements.second, elements.first + elements.second)
    }
}