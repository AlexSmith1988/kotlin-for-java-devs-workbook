package courseVideoSamples

fun isValidIdentifier(s: String): Boolean {
    if (s.isBlank() || !s[0].isLetter() && s[0] != '_') return false

    for (char in s)
        if (!char.isLetterOrDigit() && char != '_') return false
    return true

}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}