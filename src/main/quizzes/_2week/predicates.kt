package quizzes._2week.predicates

/* HEAD */
// Interchangeable predicates

/* TASK */
// Functions `all()`, `none()` and `any()` are interchangeable, you can use one
// or the other to implement the same functionality.
// Implement the functions `allNonZero()` and `containsZero()` using all three
// predicates in turn. `allNonZero()` checks that all the elements in the list
// are non-zero; `containsZero()` checks that the list contains `zero` element.
// Add negation where necessary.

/* CODE */
//sampleStart
fun List<Int>.allNonZero() = all { /*[mark]*/TODO()/*[/mark]*/ }
fun List<Int>.allNonZero1() = none { /*[mark]*/TODO()/*[/mark]*/ }
fun List<Int>.allNonZero2() = any { /*[mark]*/TODO()/*[/mark]*/ }

fun List<Int>.containsZero() = all { /*[mark]*/TODO()/*[/mark]*/ }
fun List<Int>.containsZero1() = none { /*[mark]*/TODO()/*[/mark]*/ }
fun List<Int>.containsZero2() = any { /*[mark]*/TODO()/*[/mark]*/ }

fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3)
    list1.allNonZero() eq true
    list1.allNonZero1() eq true
    list1.allNonZero2() eq true

    list1.containsZero() eq false
    list1.containsZero1() eq false
    list1.containsZero2() eq false

    val list2 = listOf(0, 1, 2)
    list2.allNonZero() eq false
    list2.allNonZero1() eq false
    list2.allNonZero2() eq false

    list2.containsZero() eq true
    list2.containsZero1() eq true
    list2.containsZero2() eq true
}

//sampleEnd
infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}

/* SOLUTION */
fun List<Int>.allNonZeroSolution() = all { it != 0 }
fun List<Int>.allNonZero1Solution() = none { it == 0 }
fun List<Int>.allNonZero2Solution() = !any { it == 0 }

fun List<Int>.containsZeroSolution() = !all { it != 0 }
fun List<Int>.containsZero1Solution() = !none { it == 0 }
fun List<Int>.containsZero2Solution() = any { it == 0 }