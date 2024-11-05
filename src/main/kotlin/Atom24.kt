fun main() {
    // val var에 가변 리스트를 대입하는 경우
    val list1 = mutableListOf('A') // or var
    list1 += 'A'// 다음 줄과 같다.
//    list1.plusAssign('A')
    println(list1.toString())

    // val에 불변 리스트를 대입하는 경우
    val list2 = listOf('B')
//    list2 += 'B' // 다음 줄과 같다.
//    list2 = list2 + 'B'

    var list3 = listOf('C')
    list3 += 'C'// 다음 줄과 같다
    val newList = list3 + 'C'
    list3 = newList
    println(list3)
}
