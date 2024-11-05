enum class Level {
    A, B, C, D
}

fun main() {
    val a = Level.A
    println(a)
}

enum class Direction(val notation: String) {
    North("N"), South("S"); // 세미콜론 필수

    val opposite: Direction
        get() = when (this) {
            North -> South
            South -> South
        }
}
