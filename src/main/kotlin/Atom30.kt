//fun String.singleQuote() = "'$this' + 1"
//
//fun main() {
//    val singleQuote = "hi".singleQuote()
//    println(singleQuote)
//}


class Book(val title: String)

fun Book.categorize(category: String) = "title : $title, category: $category"

fun main() {
    val categorize = Book("test").categorize("cspark")
    println(categorize)

    println("test".strange("a"))
}

fun String.test(test: String) = "$test"

fun String.strange(test: String) = this.test(test)

