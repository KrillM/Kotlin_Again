fun main() {

    // List
    val list1 = listOf("Kotlin", "Java", "Kotlin")
    println(list1[2])

    // Check datas through forEach
    list1.forEach{
        i -> println("$i")
    }

    val list2 = mutableListOf("Honshu", "Java", "Kotlin")
    println(list2[0])

    list2[0] = "Kyushu"
    println(list2[0])

    // Set
    val set1 = setOf(1,1,2,2,3,3,3,4,5,5)
    println(set1)

    val set2 = mutableSetOf(1,1,2,2,3,3,3,4,5,5)
    println(set2)

    // set 추가
    set2.add(6)
    println(set2)

    // set 제거
    set2.remove(2)
    println(set2)

    // Map
    val map1 = mapOf("name" to "krille", "age" to 22, "height" to 180)
    println(map1["name"])

    val map2 = mutableMapOf("name" to "krille", "age" to 22, "height" to 22)
    map2.forEach{
        i-> println("$i")
    }

    println(map2["age"])

    // map 변경 방법 1
    map2["age"] = 23
    println(map2["age"])

    // map 변경 방법 2
    map2.replace("age", 24)
    println(map2["age"])

    // map 추가
    map2.put("hobby", "game")
    println(map2["hobby"])

    // map 제거
    map2.remove("height")
    println(map2)

    // Stack (LIFO)
    val stack = ArrayDeque<Int>()
    stack.addLast(10) // push
    stack.addLast(20)
    stack.addLast(30)
    println(stack)

    stack.removeLast() // pop
    stack.removeLast()
    println(stack)

    // Queue (FIFO)
    val queue = ArrayDeque<Int>()
    queue.addLast(1) // enqueue
    queue.addLast(2)
    queue.addLast(3)
    println(queue)

    queue.removeFirst() // dequeue
    queue.removeFirst()
    println(queue)
}