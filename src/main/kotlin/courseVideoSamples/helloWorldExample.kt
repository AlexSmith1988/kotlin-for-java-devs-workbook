package courseVideoSamples

fun main(args: Array<String>) {
    val addressee = if (args.isEmpty()) "Kotlin" else args[0]
    println("Hello, $addressee")
}
