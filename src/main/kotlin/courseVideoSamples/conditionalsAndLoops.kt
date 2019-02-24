package courseVideoSamples

fun main() {
    assert(inExample('a'))
    
    loops()

    onEvent("Test")
    onEvent(4)
    onEvent(10.5)
}

fun inExample(c: Char) = c !in '0'..'9'

// if & when are expressions
fun onEvent(event: Any) = when (event) {
    is String -> println(event.length)
    is Int -> println("Number came $event")
    else -> println("is big")
}

fun loops() {
    for (i in 1..5)
        print(" $i")
    println()

    for (i in 1 downTo -10 step 3)
        print(" $i")
    println()

    for (ch in "abcd")
        print(" ${ch + 1}")
    println()

    for ((index, value) in listOf(1 * 2, 2 * 2, 3 * 2).withIndex())
        print("#$index: $value ; ")
    println()

    for ((key, value) in mapOf(1 to "one", 2 to "two", 3 to "three"))
        print("$key-$value ; ")
    println()
}