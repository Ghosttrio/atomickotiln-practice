//fun main() {
//    val logMsg = StringBuilder()
//    fun log(message: String) = logMsg.appendLine(message)
//    log("start")
//    println(logMsg.toString())
//}

//fun main() {
//    fun String.exclaim() = "$this!"
//    val exclaim = "Hello".exclaim()
//}


//class Session(
//    val title: String,
//    val speaker: String
//)
//
//val sessions = listOf(Session("kc", "re"))
//
//val fs = setOf("re")
//
//fun main() {
//    sessions.any(
//        fun(session: Session): Boolean {
//            if (session.title.contains("kc") && session.speaker in fs) {
//                return true
//            }
//            return false
//        }
//    )
//    fun itr(session: Session): Boolean {
//        if (session.title.contains("kc") && session.speaker in fs) {
//            return true
//        }
//        return false
//    }
//    val any = sessions.any(::itr)
//    println(any)
//}

//fun main() {
//    val list = listOf(1, 2, 3, 4, 5)
//
//    val value = 3
//    var result = ""
//
//    list.forEach {
//        result += "$it"
//        if (it == value) {
//            return // return은 main() 함수를 끝낸다는 뜻
//        }
//    }
//        println(result)
//}
//fun main() {
//    val list = listOf(1, 2, 3, 4, 5)
//
//    val value = 3
//    var result = ""
//
//    list.forEach {
//        result += "$it"
//        if (it == value) {
//            return@forEach
//        }
//    }
//    println(result)
//}

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    list.forEach tag@{
        return@tag
    }
}
