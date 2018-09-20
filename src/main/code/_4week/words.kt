class Words {
    private val list = mutableListOf<String>()

    // TODO: remove this code
    fun String.record() {
        list += this
    }

    operator fun String.unaryPlus() = record()
    // TODO: remove this code

    override fun toString() = list.toString()
}

fun main(args: Array<String>) {
    val words = Words()
    with(words) {
        // The following two lines should compile:
        "one".record()
        +"two"
    }
    words.toString() eq "[one, two]"
}