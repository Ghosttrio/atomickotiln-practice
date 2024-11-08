import Airport.Plane

class Airport(private val code: String) {
    open class Plane {
        // 자신을 둘러싼 클래스의 private 프로퍼티에 접근 가능
        fun contact(airport: Airport) = "Contacting ${airport.code}"
    }
    private class PrivatePlane : Plane()
    fun privatePlane(): Plane = PrivatePlane()
}

fun main() {
    val denver = Airport("DEN")
    var plane = Plane()
    plane.contact(denver)
}

fun localClasses() {
    open class A
    class Frog: A()
}
