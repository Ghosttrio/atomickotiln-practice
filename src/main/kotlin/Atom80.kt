data class Tag(var n: Int = 0) {
    var s: String = ""
    fun increment() = ++n
}

fun main() {

    // let(): 객체를 'it'로 접근하고 람다의 마지막 식을 반환한다.
    Tag(1).let {
        it.s = "let: ${it.n}"
        it.increment()
    }

    // run(): 객체를 'this'로 접근하고 람다의 마지막 식의 값을 반환한다.
    Tag(3).run {
        s = "run: $n"
        increment()
    }

    // with(): 객체를 'this'로 접근하고 람다의 마지막식을 반환한다.
    with(Tag(3)) {
        s = "run: $n"
        increment()
    }

    // apply(): 객체를 'this'로 접근하고 변경된 객체를 다시 반환한다.
    Tag(5).apply {
        s = "apply: $n"
        increment()
    }

    // also(): 객체를 'it'으로 접근하고 변경된 객체를 다시 반환한다.
    Tag(6).also {
        it.s = "also: ${it.n}"
        it.increment()
    }
}
