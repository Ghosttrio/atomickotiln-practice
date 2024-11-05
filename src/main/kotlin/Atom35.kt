data class Simple (
    val arg1: String,
    var arg2: Int
)

fun main() {
    val simple = Simple("h1", 1)
    val copy = simple.copy(arg1 = "test", arg2 = 100)
    println(copy)
}
