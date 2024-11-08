//open class GreatApe(
//    val weight: Double,
//    val age: Int
//)
//
//open class Bonobo(weight: Double, age: Int) : GreatApe(weight, age)
//
//class Chimpanzee(weight: Double, age: Int) : GreatApe(weight, age)
//
//class BonoboB(weight: Double, age: Int) : Bonobo(weight, age)
//
//fun GreatApe.info() = "wt $weight, age $age"
//
//fun main() {
//    GreatApe(100.0, 12).info()
//    Bonobo(110.0, 13).info()
//    Chimpanzee(120.0, 14).info()
//    BonoboB(130.0, 15).info()
//}
//
//open class SuperClass1(val i: Int)
//class SubClass1(i: Int, j: Int) : SuperClass1(i)


open class Basezz(val i: Int)

class aa: Basezz {
    constructor(i: Int): super(i)
    constructor() : this(9)
}
