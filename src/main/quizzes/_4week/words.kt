package quizzes._4week.words

/* HEAD */
// Member extensions

/* TASK */
// Implement member extension functions 'record' and 'unaryPlus'
// so that the code below compiled and stored specified words.
// These functions should be unavailable outside of the 'Words' class.

/* CODE */
//sampleStart
class Words {
    private val list = mutableListOf<String>()

    /*[mark]*/// TODO/*[/mark]*/

    override fun toString() = list.toString()
}

fun main(args: Array<String>) {
    val words = Words()
    with(words) {
        // The following two lines should compile:
        //"one".record()
        //+"two"
    }
    words.toString() eq "[one, two]"
}
//sampleEnd

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}
