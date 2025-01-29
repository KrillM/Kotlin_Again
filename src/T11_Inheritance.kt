open class Device(val model : String, val company : String, val price : Int){
// 부모 클래스나 함수를 open 선언해야 자식 클래스에서 사용할 수 있다.

    fun printModel() : String{
        return "Model is $model"
    }

    fun printCompany() {
        println("Company is $company")
    }

    fun printPrice(){
        println("Price is $price")
    }

    open fun printAI(){
        println("This is AI")
    }
}

class Samsung (model: String, company: String, price: Int) : Device(model, company, price){
    override fun printAI() {
        super.printAI() // super: 자녀 클래스에서 부모의 코드를 사용할 수 있게 해준다.
        println("Hi Bixby")
    }
}

class Apple (model: String, company: String, price: Int) : Device(model, company, price){
    override fun printAI() {
        super.printAI()
        println("Hey Siri")
    }
}

fun main() {
    val galaxy = Samsung("Galaxy", "Samsung", 1250)
    println(galaxy.printModel())
    galaxy.printCompany()

    val ip = Apple("iPhone", "Apple", 1500)
    ip.printPrice()
    ip.printAI()
}