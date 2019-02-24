package courseVideoSamples

fun main(args: Array<String>) {
    println("Hello, World")
    val person = Person("Alice", 29)
    println(person.name)
    updateWeather(10)
}

enum class Colour {
    BLUE, ORANGE, RED
}

fun updateWeather(degrees: Int) {
    val (description, colour) =
        when {
            degrees < 5 -> "cold" to Colour.BLUE
            degrees < 23 -> "mild" to Colour.ORANGE
            else -> "hot" to Colour.RED
        }

    println("$description $colour")
    val mapOf = mapOf(1 to "test", "s" to 10)
    println(mapOf)
}
