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