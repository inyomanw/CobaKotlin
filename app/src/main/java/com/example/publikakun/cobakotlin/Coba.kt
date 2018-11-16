package com.example.publikakun.cobakotlin

fun main(args: Array<String>) {

    println(describeString(null))
    val test =Test(null,null)
    val stack = mutableStackOf(5,67,4,8)
    val yorkshire = Yorkshire()
    yorkshire.sayHello()

    println(stack)
    println(test.name)
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
//    printAllWithPrefix(
//            1, 2, 3, 4, 5,
//            ngehe = "Greeting: "
//    )
}
fun describeString(someString : String?):String {
    if(someString!=null && someString.length>0)
    {
        return "String of length ${someString.length}"
    }else{
        return "kosong boor"
    }
}
fun <T> mutableStackOf(vararg elements: T) = MutableStack(*elements)
fun printAllWithPrefix(vararg messages: Int, ngehe: String) {
    for (s in messages) println(ngehe + s)
}

class BaseResponse(val status:String , val message:String)

class Test(val id: Int?, var name:String? )

class MutableStack<T>(vararg items: T) {              // 1

    private val elements = items.toMutableList()

    fun push(element: T) = elements.add(element)        // 2

    fun peek(): T = elements.last()                     // 3

    fun pop(): T = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}
open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}
class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}