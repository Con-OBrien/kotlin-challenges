import kotlin.math.max


fun longestSubarray(text: String): Int {
    val mapCounter = mutableMapOf<Char, Int>()
    var windowLength: Int
    var left = 0
    var maxLength = 0
    for (right in text.indices) {
        if(mapCounter.containsKey(text[right])) {
            left = max(left, mapCounter[text[right]]!! + 1)
        }
        windowLength = right - left+1
        mapCounter[text[right]] = right
        maxLength = (if(windowLength > maxLength) { windowLength } else { maxLength})
    }
    return maxLength
}

fun main() {
    println(longestSubarray("abba"))
}