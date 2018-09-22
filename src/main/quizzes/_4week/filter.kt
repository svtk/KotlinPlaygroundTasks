package quizzes._4week

/* HEAD */
// Inlining of the 'filter' function

/* TASK */
// Write the code that the Kotlin compiler will generate while inlining
// the filter function (instead of calling it).
// Note that the compiler generates Java bytecode, but for simplicity,
// write the similar code in Kotlin.
// The simplified declaration of 'filter' is given below.

/* CODE */
//sampleStart
fun filterNonZero(list: List<Int>) = list.filter { it != 0 }

fun filterNonZeroGenerated(list: List<Int>): List<Int> {
    /*[mark]*/TODO()/*[/mark]*/
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)

    filterNonZero(list).toString() eq "[1, 2, 3]"
    filterNonZeroGenerated(list).toString() eq "[1, 2, 3]"
}

inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
    val destination = ArrayList<T>()
    for (element in this) {
        if (predicate(element)) {
            destination.add(element)
        }
    }
    return destination
}

//sampleEnd
infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}

/* SOLUTION */
fun filterNonZeroGenerated_(list: List<Int>): List<Int> {
    val destination = ArrayList<Int>()
    for (element in list) {
        if (element != 0) {
            destination.add(element)
        }
    }
    return destination
}
