fun main(args: Array<String>){

    // range
    var numRange1 : IntRange = 1 .. 10
    var numRange2 : IntRange = 1 until 10

    println(numRange1.contains(10))  // true
    println(numRange2.contains(10))  // false

    var charRange : CharRange = 'A'..'H'
    println(charRange.contains('H')) // true

    // ..
    for(i in 1..10){
        print(i)
    }

    println()

    // until
    for(u in 1 until 11){
        print(u)
    }

    println()

    // downTo
    for(d in 10 downTo 1){
        print(d)
    }

    println()

    // step
    for(s in 1 .. 10 step 2){
        print(s)
    }

    println()

    // 응용
    for(r in 100 downTo 1 step 10){
        print(r)
    }
    println()

}