package quizzes.ideas

/* HEAD */
// Equals & hashCode

/* TASK */
// Write the code that won't work correctly
// with the following class
// (which defines 'equals' without 'hashCode')

/* CODE */
class Value(val i: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Value) return false
        return i == other.i
    }
}

fun main(args: Array<String>) {

}

/* SOLUTION */
fun main1(args: Array<String>) {
    val set = hashSetOf(Value(1))
    println(set.contains(Value(1)))   // false

    val map = hashMapOf(Value(1) to "abc")
    println(map[Value(1)])            // null
}