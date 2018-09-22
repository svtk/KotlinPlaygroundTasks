package npe

open class A(open val value: String) {
    init {
        value.length
    }
}

class B(value: String) : A(value)

fun main(args: Array<String>) {
    B("a")
}