import Material.Plastic

//class WithSecondary(a: Int) {
//    init {
//        println("primary:$a")
//    }
//    constructor(b: Char) : this(0) {
//        println("secondary: '$b'")
//    }
//    constructor(c: String) : this(1) {
//        println("secondary: $c")
//    }
//}
//
//fun main() {
//    val withSecondary = WithSecondary(1)
//    println()
//    val withSecondary1 = WithSecondary('b')
//    println()
//    val withSecondary2 = WithSecondary("c")
//}


enum class Material {
    Ceramic, Metal, Plastic
}

class GardenItem(val name: String) {
    var material: Material = Plastic

    constructor(name: String, material: Material) : this(name) {
        this.material = material
    }

    constructor(material: Material) : this("Strange Thing", material)

    override fun toString(): String {
        return "$material $name"
    }
}
