
fun firstUniqueCharacter(word: String): Int {
    var key: Char
    val mapCounts = mutableMapOf<Char, Int>()
    for(letter in word) {
        mapCounts[letter] = (mapCounts[letter] ?: 0) + 1
    }
    for(mapEntry in mapCounts) {
        if(mapEntry.value == 1) {
            key = mapEntry.key
            return word.indexOf(key)
        }
    }
    return -1
}

fun main() {
    println(firstUniqueCharacter("leetcode"))
}
