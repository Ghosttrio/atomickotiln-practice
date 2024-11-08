interface Bag {
    fun setUp()
}
class BetterSuitcase : Bag {
    lateinit var items: String
    override fun setUp() {
        items = "a, b, c"
    }
}

fun main() {
    val suitcase = BetterSuitcase()
    suitcase.setUp()
}
