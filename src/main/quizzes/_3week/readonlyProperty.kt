package quizzes._3week.lateinit

/* HEAD */
// Read-only property

/* TASK */
// Implement the property 'foo' so that it produced
// a different value on each access.

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

