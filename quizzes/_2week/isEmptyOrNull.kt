package quizzes._2week

/* HEAD */
// isEmptyOrNull()

/* TASK */
// Implement an extension function 'isEmptyOrNull()' on the type String?.
// It should return true, if the string is empty or null.

/* LINK */
// https://www.coursera.org/learn/kotlin-for-java-developers/lecture/phWFD/solution-checking-whether-string-is-null-or-empty

/* CODE */
//sampleStart
fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false
}
//sampleEnd
infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}
/* SOLUTION */
fun String?.isEmptyOrNull() = this == null || this.isEmpty()