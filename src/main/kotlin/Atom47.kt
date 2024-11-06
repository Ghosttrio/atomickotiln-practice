//data class Message(
//    val sender: String,
//    val text: String,
//    val isRead: Boolean
////)
//data class Message(
//    val sender: String,
//    val text: String,
//    val isRead: Boolean,
//    val attachments: List<Attachment>
//)
//
//data class Attachment(
//    val type: String,
//    val name: String
//)
//
//fun Message.isImportant(): Boolean =
//    text.contains("Salary Increase") ||
//            attachments.any {
//                it.type == "image" && it.name.contains("cat")
//            }
//
//fun ignore(message: Message) =
//    !message.isImportant() && message.sender in setOf("Boss", "Mom")

//data class Student(
//    val id: Int,
//    val name: String
//)

fun Int.times47() = times(47)

class Frog
fun Frog.speak() = "Ribbit!"

fun goInt(n: Int, g: (Int) -> Int) = g(n)

fun goFrog(frog: Frog, g: (Frog) -> String) = g(frog)


fun main() {

    goInt(12, Int::times47) // 564
    goFrog(Frog(), Frog::speak) // "Ribbit!"


//    val names = listOf("a", "b")
//    val students = names.mapIndexed{index, name -> Student(index, name)}
//    names.mapIndexed(::Student)

//    val text = "Let's discuss goals for next year"
//    val listOf = listOf(
//        Message(
//            "Boss", "Let's discuss goals for next year", false,
//            listOf(Attachment("image", "cut cats"))
//        ),
//        Message(
//            "Boss", "Let's discuss goals for next year", false,
//            listOf(Attachment("image", "cut cats"))
//        )
//    )
//    listOf.filter(::ignore)
//
//    val messages = listOf(
//        Message(
//            "Boss", "Let's discuss goals for next year", false,
//            listOf(Attachment("image", "cut cats"))
//        )
//    )
//    val any = messages.any(Message::isImportant) // true


//    val messages = listOf(
//        Message("a", "a1", true),
//        Message("b", "b2", false)
//    )
//
//    val unread = messages.filterNot(Message::isRead)
//    val filterNot = messages.filterNot { e: Message -> e.isRead }
//    val messages = listOf(
//        Message("a", "a1", true),
//        Message("bcasc", "b2asc", false)
//    )

    // 1. 읽지 않은 메시지가 보낸 사람 순서대로 정렬
    // 2. 읽은 메시지가 역시 보낸 사람 순서로 정렬
//    messages.sortedWith(compareBy(Message::isRead, Message::sender))
}
