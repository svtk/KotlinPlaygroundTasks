fun equals1(s1: String?, s2: String?): Boolean {
    return s1 == s2
}

fun equals2(s1: String?, s2: String?): Boolean = TODO()

fun main(args: Array<String>) {
    equals1("abc", "abc") eq true
    equals1("abc", null) eq false
    equals1(null, "abc") eq false
    equals1(null, null) eq true

    equals2("abc", "abc") eq true
    equals2("abc", null) eq false
    equals2(null, "abc") eq false
    equals2(null, null) eq true
    val s1 = ""
    val s2 = ""
    s1.equals(s2)

    s1 == s2       // s1.equals(s2)
    null == "abc"  // false
    null == null   // true
}