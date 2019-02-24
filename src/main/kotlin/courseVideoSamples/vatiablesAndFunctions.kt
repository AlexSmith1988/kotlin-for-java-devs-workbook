package courseVideoSamples

fun main() {
    println(listJoinExample())
}


fun listJoinExample(): String {
    return listOf(1,2,3).joinToString(postfix = "][")
}

fun outer(): String {
    fun local(): String {
        return "Test2"
    }
    return local()
}

fun max(a: Int, b: Int): Int = if (a < b) b else a

private fun pairTest() {
    println(1 to 2)
}

fun variableTypes() {
    val greeting = "Hi!"
    var number = 0
//    greeting = "Test"
    number += 10
    println(number)
}

private fun mutableListTest() {
    val mutableListOf = mutableListOf("Java")
    mutableListOf.replaceAll(String::toUpperCase)
    mutableListOf[0] = "Test"
    println(mutableListOf)
    println(mutableListOf.javaClass.name)
}

private fun listOfTest() {
    val listOf = listOf("Test", "Ups")
    println(listOf.javaClass.name)
}