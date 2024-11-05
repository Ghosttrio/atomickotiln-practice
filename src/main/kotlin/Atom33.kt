fun mixColors(first: String, second: String) {
    when (setOf(first, second)) {
        setOf("red", "blue") -> println("purple")
        else -> println("unknown")
    }
}

fun main() {
    mixColors("red", "blue")
}
