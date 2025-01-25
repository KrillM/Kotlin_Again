fun main(args: Array<String>){
    val name : String = "krille"
    println(name)

    var age : Int = 24
    println(age)

    age = 25
    println(age)

    // 자료형 정리
    // 1. 숫자형
    // 1.1. 정수형
    var a : Byte = 10
    var b : Short = 3000
    var c : Int = 500000
    var d : Long = 8200901284L

    println(a)
    println(b)
    println(c)
    println(d)

    // 1.2. 실수형
    var e : Float = 3.141592f
    var f : Double = 3.141592653589793
    var f2 : Double = Math.PI

    println(e)
    println(f)

    // 2. 문자형
    var g : Char = 'g'
    var h : String = "Hello"

    println(g)
    println(h)

    // 3. 논리형
    var i : Boolean = true
    println(i)
    println(!i)

    // 4. 배열
    var j : Array<Int> = arrayOf(1,2,3,4,5)
    println(j[0])
    println(j.get(2))

}