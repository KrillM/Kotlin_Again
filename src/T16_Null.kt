fun main() {

    var name1 = "MusiK"
    println(name1) // MusiK

    // reverse
    var name2 = name1.reversed()
    println(name2) // KisuM

//    var name3 // 완전 에러
//    var name3 : String? // Kotlin: Variable 'name3' must be initialized.

    var name3 : String? = null
//    println(name3.reversed()) // 데이터 타입이 뭔지 추론할 수 없어서 에러
    var name4 = null

    println(name3) // null
    println(name4) // null

    var noName = "Anonymous"

    // ?:
    var name5 = name2 ?: noName
    var name6 = name4 ?: noName
    println(name5) // KisuM
    println(name6) // Anonymous

    // !! : 나의 변수는 Null이지 않아
//    println(name4!!) // 대놓고 Null이라 에러
    println(name5!!) // KisuM
    println(name3!!) // Exception in thread "main" java.lang.NullPointerException

}