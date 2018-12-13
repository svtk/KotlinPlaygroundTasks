interface X {
    var first: Int
    var second: Int
    var third: Int
}

interface Y {
    fun start()
    fun finish()
}

interface Z {
    fun init()
}

fun foo(x: X, y: Y?, z: Z) {
    x.let {
        it.first = 1
        it.second = 2
        it.third = 3
    }
    y?.let {
        with(it) {
            start()
            finish()
        }
    }
    val result = with(z) {
        init()
        this
    }

    x.also {  }
}