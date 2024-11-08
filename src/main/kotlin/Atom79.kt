//val va: (String, Int) -> String = {
//    str, n -> str.repeat(n) + str.repeat(n)
//}
//
//val vb: String.(Int) -> String = {
//    this.repeat(it) + repeat(it)
//}
//
//fun main() {
//    va("a", 2)
//    vb("b", 3)
//    "c".vb(2)
//}


//fun Int.d1(f: (Int) -> Int) = f(this) * 10
//
//fun f1(n: Int) = n + 3
//
//fun main() {
//    74.d1(::f1) // 770
//}


open class Recipe : ArrayList<RecipeUnit>()

open class RecipeUnit {
    override fun toString() = "${this::class.simpleName}"
}

open class Operation : RecipeUnit()
class Toast : Operation()
class Grill : Operation()
class Cut : Operation()

open class Ingredient : RecipeUnit()
class Bread : Ingredient()
class Ham : Ingredient()
class Swiss : Ingredient()
class Mustard : Ingredient()


open class Sandwich : Recipe() {
    fun action(op: Operation): Sandwich {
        add(op)
        return this
    }

    fun grill() = action(Grill())
    fun toast() = action(Toast())
    fun cut() = action(Cut())
}

fun sandwich(fillings: Sandwich.() -> Unit): Sandwich {
    val sandwich = Sandwich()
    sandwich.add(Bread())
    sandwich.toast()
    sandwich.fillings()
    sandwich.cut()
    return sandwich
}

fun main() {
    val sandwich = sandwich {
        add(Ham())
        add(Swiss())
        add(Mustard())
    }
    println(sandwich)
}
