fun main() {
    val nonName = color(1, 1, 1) // 이름 X
    val named = color(red = 1, green = 1, blue = 1) // 이름 o
    val order = color(green = 1, blue = 1, red = 1)

    println(nonName)
    println(named)
    println(order)

    val color2 = color2()
    println(color2(red = 2))
}

fun color(red: Int, green: Int, blue: Int) = "$red, $green, $blue"

fun color2(red: Int = 1, green: Int = 1, blue: Int = 1) = "$red, $green, $blue"


//fun main() {
//    val list = listOf(1, 2, 3)
//    val joinToString = list.joinToString(prefix = "(", postfix = ")", separator = ", ")
//    println(joinToString)
//}

