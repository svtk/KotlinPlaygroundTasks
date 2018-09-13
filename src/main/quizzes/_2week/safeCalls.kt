package quizzes._2week

/* HEAD */
// Safe casts

/* TASK */
// Type cast as throws ClassCastException, if the cast is unsuccessful.
// Safe cast as? returns null, if the cast is unsuccessful.
// Declare the s variable to make the first line print null and the second one throw an exception.

/* CODE */
fun main(args: Array<String>) {
    val s = /*[mark]*/TODO()/*[/mark]*/
    println(s as? Int)    // null
    println(s as Int?)    // exception
}