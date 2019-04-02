package quizzes._3week.lateinit

/* HEAD */
// Unstable val

/* TASK */
// Implement the property 'foo' so that it produced
// a different value on each access.

/* LINK */
// https://www.coursera.org/learn/kotlin-for-java-developers/lecture/EOc1D/solution-unstable-val

/* CODE */
val foo: Int
    get() = /*[mark]*/TODO()/*[/mark]*/

fun main(args: Array<String>) {
    // The values should be different:
    println(foo)
    println(foo)
    println(foo)
}

/* SOLUTION */
var counter = 0
val foo_: Int
    get() = counter++

