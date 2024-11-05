fun main() {
    var x: String? = "abc"
    val x1 = x!!
    x = null
    val s: String = x!!
}
