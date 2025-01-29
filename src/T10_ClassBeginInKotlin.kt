class Car(name: String, color: String, age: Int){ // 매개 변수를 바로 받을 수 있다.

    init { // 주 생성자
        println("Name : $name , Color : $color , Age : $age")
    }

    constructor (name: String, color: String) : this(name, color, 5) {  // Int 변수가 5로 동일하다.
        // 보조 식별자로 여러 번 사용이 가능하다.
    }
}

fun main() {
    val c1 = Car("Toyota", "Red", 10)
    val c2 = Car("Hyundai", "White", 15)

    val c3 = Car("Volkswagen", "Blue")
    val c4 = Car("Flat", "Yellow")
}