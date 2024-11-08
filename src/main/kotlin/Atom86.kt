val lazyProperty by lazy {"초기화코드"}

fun main() {
    val lazyProperty1 = lazyProperty
    println(lazyProperty1)
}
