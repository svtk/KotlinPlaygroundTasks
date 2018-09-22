package quizzes._3week

/* HEAD */
// Equality

/* TASK */
// Implement 'equals2' without using '==' so that it was equivalent to 'equals1'.
// You can call 'equals()' directly and use the reference equality operator '==='.

/* CODE */
//sampleStart
data class Value(val s: String)

fun equals1(v1: Value?, v2: Value?): Boolean {
    return v1 == v2
}

fun equals2(v1: Value?, v2: Value?): Boolean = TODO()

fun main(args: Array<String>) {
    equals1(Value("abc"), Value("abc")) eq true
    equals1(Value("abc"), null) eq false
    equals1(null, Value("abc")) eq false
    equals1(null, null) eq true

    equals2(Value("abc"), Value("abc")) eq true
    equals2(Value("abc"), null) eq false
    equals2(null, Value("abc")) eq false
    equals2(null, null) eq true
}
//sampleEnd
infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}

/* SOLUTION */
fun equals2_(v1: Value?, v2: Value?): Boolean =
        v1?.equals(v2) ?: (v2 === null)