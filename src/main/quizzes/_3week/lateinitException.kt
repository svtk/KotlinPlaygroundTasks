package quizzes._3week.lateinit

/* HEAD */
// Using lateinit property

/* TASK */
// Without modifying the class 'A' complete the code in 'main'
// so that an exception
// UninitializedPropertyAccessException was thrown.
// Then fix the code so that no exception was thrown.

/* LINK */
// https://www.coursera.org/learn/kotlin-for-java-developers/lecture/JGkcw/solution-using-lateinit-property

/* CODE */
class A {
    private lateinit var property: String

    fun setUp() {
        property = "value"
    }

    fun display() {
        println(property)
    }
}

fun main(args: Array<String>) {
    val a = A()

}

/* SOLUTION */
// first
// a.display()
// then
// a.setUp()
// a.display()
