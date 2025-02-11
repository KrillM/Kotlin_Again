fun main() {

    // var -> lateinit
    // 주의 참조 자료형만 사용이 가능하며 선언하지 않은 상태로 출력을 하면 에러가 발생한다.
    lateinit var name : String
    name = "Messi"
    println(name)

    // val -> lazy
    val lazyBear : String by lazy {
        println("Bear is coming.")
        "Teddy Bear"
    }

    println("First Bear")
    println(lazyBear) // "Bear is coming." 출력

    println("Second Bear")
    println(lazyBear) // "Teddy Bear"만 리턴

}