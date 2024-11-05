fun main() {
    val mapOf = mapOf(
        "test" to 1,
        "test2" to 2
    )

    for (entry in mapOf) {
        println(entry.key)
        println(entry.value)
    }

    for ((key, value) in mapOf) {
        println(key)
        println(value)
    }
}
