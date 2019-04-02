package quizzes._1week

/* HEAD */
// Sum as an extension function

/* TASK */
// Change the sum function so that it was declared as an extension.

/* LINK */
// https://www.coursera.org/learn/kotlin-for-java-developers/lecture/eVjlW/solution-sum-as-an-extension-function

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