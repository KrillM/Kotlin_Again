/* 구조
* fun 함수 이름(변수명: 자료형): 반환할 자료형{
*   return 값
* }
* */

// 매개 변수와 반환 값이 있는 함수
fun func1(name: String) : String{
    return "My name is $name"
}

// 반환 값만 있는 함수
fun func2() : Int {
    return 3*4
}

/* 구조
* fun 함수 이름(변수명: 자료형){ // 매개 변수는 생략 가능
*   println(값)
* }
* */

// 매개 변수만 있는 함수
fun func3(name: String, num: Int){
    println("$name : $num")
}

// 결과만 출력하는 함수
fun func4() : Unit{
    println("Box Only")
}

fun main() {

    // 매개 변수와 반환 값이 있는 함수
    var name = func1("Jihoon")
    println(name)

    // 반환 값만 있는 함수
    var result = func2()
    println(result)

    // 매개 변수만 있는 함수
    func3("Haaland", 9)

    // 결과만 출력하는 함수
    func4()
}