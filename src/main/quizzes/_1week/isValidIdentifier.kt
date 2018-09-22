package quizzes._1week.basics

/* HEAD */
// Checking identifier

/* TASK */
// Implement the function that checks whether a string is a valid identifier.
// A valid identifier is a non-empty string that starts with a letter
// or underscore and consists of only letters, digits and underscores.

/* CODE */
fun isValidIdentifier(s: String): Boolean {
    /*[mark]*/TODO()/*[/mark]*/
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

/* SOLUTION */
fun isValidIdentifier1(s: String): Boolean {

    fun isValidCharacter(ch: Char) =
            ch == '_' || ch in '0'..'9' ||
                    ch in 'a'..'z' || ch in 'A'..'Z'

    if (s.isEmpty() || s[0] in '0'..'9') return false
    for (ch in s) {
        if (!isValidCharacter(ch)) return false
    }
    return true
}

fun isValidIdentifier2(s: String): Boolean {

    fun isValidCharacter(ch: Char) =
            ch == '_' || ch.isLetterOrDigit()

    if (s.isEmpty() || s[0].isDigit()) return false
    for (ch in s) {
        if (!isValidCharacter(ch)) return false
    }
    return true
}


