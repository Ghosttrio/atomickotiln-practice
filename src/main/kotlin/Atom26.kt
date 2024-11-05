fun main() {
    val intSet = setOf(1, 2, 3, 4, 5, 6, 7, 7)

    intSet.stream().forEach { e -> println(e) }

    val contains = intSet.contains(1)
    println(contains)

    val result = 1 in intSet
    println(result)
}
