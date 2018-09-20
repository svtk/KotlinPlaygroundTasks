package npe

open class A(open val value: String) {
    init {

    }
}

class B(override val value: String) : A(value)

fun main(args: Array<String>) {
    B("a")
}