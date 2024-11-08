interface Shape {
    fun draw(): String
    fun erase(): String
}

class Circle : Shape {
    override fun draw(): String {
        return "c d"
    }

    override fun erase(): String {
        return "c e"
    }
}

fun show(shape: Shape) {
    println(shape.draw())
}

fun main() {
    show(Circle())
}
