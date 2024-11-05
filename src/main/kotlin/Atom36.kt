fun compute(input: Int): Pair<Int, String> =
    if (input > 5)
        Pair(input * 2, "High")
    else
        Pair(input * 2, "Low")

fun main() {
    val (input, level) = compute(10)
    println(input)
    println(level)
}
