import kotlin.coroutines.experimental.buildSequence

fun fibonacci(): Sequence<Int> = buildSequence {
    TODO()
}

fun main(args: Array<String>) {
    println(fibonacci().take(10).toList())
    // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
}