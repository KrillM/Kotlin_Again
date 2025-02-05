abstract class Game{
    abstract fun gameStart(title: String)
    abstract val name : String
}

class Gta : Game(){
    override fun gameStart(title: String) {
        println(" released?")
    }

    override val name: String
        get() = "Grand Theft Auto VI"
}

fun main() {
    val gta = Gta();
    val title = gta.name
    gta.gameStart(title)
}