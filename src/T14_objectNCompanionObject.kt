object Sole{
    val number = 1
    fun sayHello() : String{
        return "Hello Object"
    }
}

class NotSole{
    val number = 1
    fun sayHello() : String{
        return "Hello Object"
    }
}

class Meal{

    val lunch = "Kimbap"

    companion object {
        val dinner = "Steak"
        fun showDiet(menu : String) : String{
            return "Today\'s dinner is $menu"
        }
    }
}

fun main() {
    // 오브젝트
    println(Sole.number) // 1
    println(Sole.sayHello()) // Hello Object

    // 일반 클래스
    val notSole = NotSole()
    println(notSole.number) // 1
    println(notSole.sayHello()) // Hello Object

    // Companion Object
    println(Meal.showDiet(Meal.dinner)) // Today's dinner is Steak

    val lunch = Meal()
    println(Meal.showDiet(lunch.lunch)) // Today's dinner is Kimbap
}
