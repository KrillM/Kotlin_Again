interface AirCraft{
    val company : String
    fun fly(company: String, model: String)
}

class Airbus : AirCraft{
    override val company: String
        get() = "Airbus"

    override fun fly(company: String, model: String) {
        println("$company $model")
    }
}

interface Carrier {
    fun carrier () : String
}

class Boeing : AirCraft, Carrier{
    override val company: String
        get() = "Boeing"

    override fun fly(company: String, model: String) {
        println("$company $model flying")
    }

    override fun carrier(): String {
        return "Korean Air"
    }
}

fun main() {
    val a350 = Airbus()
    a350.fly(a350.company, "A350") // Airbus A350

    val b787 = Boeing()
    println(b787.carrier()) // Korean Air
    b787.fly(b787.company, "B787") // Boeing B787 flying
}
