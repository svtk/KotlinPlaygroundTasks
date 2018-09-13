package quizzes._3week.npe

/* HEAD */
// NPE during initialization

/* TASK */
// Complete the declaration of the class A
// so that NPE was thrown during the creation of its subclass B instance.

/* CODE */
open class A(open val value: String) {
    init {

    }
}

class B(override val value: String) : A(value)

fun main(args: Array<String>) {
    B("a")
}

/* SOLUTION */
// value.length