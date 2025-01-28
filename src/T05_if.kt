fun main() {

    // 예시 1
    var score = 80

    if (score >= 70) { // if문의 첫 번째 조건이다. 해당 조건이 맞으면 Pass가 출력된다.
        println("Pass")
    }
    else {
        println("Fail") // 모든 조건을 만족하지 않는다면 else문이 출력된다. Fail이 출력된다.
    }

    // 예시 2
    var score2 = 95

    if (score2>= 90) {
        println("A")
    }
    if (score2>= 70 && score2 < 90) {
        println("B")
    }
    else {
        println("Fail")
    }

    // 예시 3
    var score3 = 95

    if (score3 >= 90) {
        println("A")
    }
    else if (score3 >= 70 && score3 < 90) {
        println("B")
    }
    else {
        println("F")
    }

    // 예시 4
    score3 = 77

    if (score3 >= 90) {
        println("A")
    }
    else if (score3 >= 70 && score3 < 90) {
        println("B")
    }
    else {
        println("F")
    }
}

