////class Hotel(private val reception: String) {
////    open inner class Room(val id: Int = 0) {
////        // 제약 없이 reception 사용
////        fun callReception() = "Room $id Calling $reception"
////    }
////    private inner class Closet : Room()
////    fun closet(): Room = Closet()
////}
////
////fun main() {
////    val hotel = Hotel("311")
////    // 내부 클래스의 인스턴스를 생성하려면 둘러싼 클래스의 인스턴스가 필요하다.
////    val room = hotel.Room(319)
////    room.callReception()
////}
//
//// @Fruit라는 레이블이 암시적으로 붙는다.
//class Fruit {
//    fun changeColor(color: String) = "Fruit $color"
//
//    fun absorbWater(amount: Int){}
//    // @Seed라는 레이블이 암시적으로 붙는다.
//    inner class Seed {
//        fun changeColor(color: String) = "Seed $color"
//
//        fun germinate() {}
//
//        fun whichThis() {
//            // 디폴트로 가장 안쪽의 현재 클래스를 가리킨다.
//            this.name
//            this@Seed.name
//            this@Fruit.name
//        }
//        inner class DNA {
//            fun changeColor(color: String) {
//                this@Seed.changeColor(color)
//                this@Fruit.changeColor(color)
//            }
//            fun plant() {
//                germinate()
//                absorbWater(10)
//            }
//            fun Int.grow() {
//                this.name
//                this@grow.name
//                this@DNA.name
//                this@Seed.name
//                this@Fruit.name
//            }
//            fun Seed.plant() {}
//            fun Fruit.plant() {}
//            fun whichThis() {
//                this.name
//                this@DNA.name
//                this@Seed.name
//                this@Fruit.name
//            }
//        }
//
//    }
//}


//open class Egg{
//    open inner class Yolk {
//
//    }
//}
//
//class BigEgg : Egg() {
//    inner class Yolk : Egg.Yolk() {
//
//    }
//}


fun interface Pet2 {
    fun speak(): String
}

object CreatePet {
    fun home() = "home!"

    fun dog() : Pet2 {
        val say = "bark!"
        class Dog : Pet2 {
            // 지역 내부 클래스
            override fun speak(): String {
                return say + home()
            }
        }
        return dog()
    }

    fun cat(): Pet2 {
        val emit = "meow"
        // 익명 내부 클래스
        return object : Pet2 {
            override fun speak(): String {
                return emit + home()
            }
        }
    }

    fun hamster(): Pet2 {
        val squeak = "squeak"
        // 익명 내부 클래스
        return Pet2 { squeak + home() }
    }
}
