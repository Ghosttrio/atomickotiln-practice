class Default {
    var i: Int = 0
        var d: Int = 2

        get() {
            return field + 1
        }

        set(value) {
            field = value + 1
        }
}

fun main() {
    val default = Default()
    println(default.d)
    default.d = 1
    println(default.d)
}
