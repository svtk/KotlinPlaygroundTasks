class Value(val i: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Value) return false
        return i == other.i
    }
}

fun main(args: Array<String>) {

}