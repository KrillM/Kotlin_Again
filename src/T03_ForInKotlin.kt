fun main(args: Array<String>){

    // range
    var charRange : CharRange = 'A'..'H'
    var numRange : IntRange = 1 until 10

    println(charRange.contains('H')) // true
    println(numRange.contains(10))  // false

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
    for(s in 2 .. 10 step 2){
        print(s)
    }

    println()

    // 응용
    for(r in 100 downTo 1 step 10){
        print(r)
    }
    println()

}