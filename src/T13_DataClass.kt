data class Memo(val title: String, val content: String, val isDone : Boolean)

fun main() {
    val memo1 = Memo("Study Kotlin", "Study Data Table", true)
    println(memo1.toString())
    println(memo1.title) // Study Kotlin

    val memo2 = memo1.copy()
    println(memo2.content) // Study Data Table

    val memo3 = memo1.copy("Study SQL")
    println(memo3.toString())
}