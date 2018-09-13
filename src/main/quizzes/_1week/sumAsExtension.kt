package quizzes._1week

/* HEAD */
// Sum as an extension function

/* TASK */
// Rewrite the sum function declaration so that it was declared as an extension.

/* CODE */
fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}

fun main(args: Array<String>) {
    val sum = sum(listOf(1, 2, 3))
    println(sum)    // 6
}