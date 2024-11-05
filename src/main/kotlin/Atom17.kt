class Giraffe
class Bear
class Hippo
class Cat {
    fun meow() = "meow!!"
}

fun main() {
    val g1 = Giraffe()
    val g2 = Giraffe()
    val b = Bear()
    val h = Hippo()

    println(g1)
    println(g2)
    println(b)
    println(h)

    val cat = Cat()
    val meow = cat.meow()
    println(meow)
}


class Outer {
    private val outerProperty = "Outer"

    inner class Inner {
        fun accessOuter() {
            println(outerProperty) // 직접 접근 가능
            println(this@Outer.outerProperty) // Outer 클래스의 속성 접근
        }
    }
}
