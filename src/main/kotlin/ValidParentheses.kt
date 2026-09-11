import java.util.*

fun validParenthesesV1(text: String): Boolean {
    val stack = ArrayDeque<Char>()
    for(i in text.indices) {
        val expectedOpening = when (text[i]) {
            ')' -> '('
            ']' -> '['
            '}' -> '{'
            else -> null
        }
        when(text[i]) {
            '(', '{', '[' -> stack.push(text[i])
            else -> {
                if (stack.isEmpty()) {
                    return false
                } else {
                    if (expectedOpening != stack.peek()) {
                        return false
                    }
                    stack.pop()
                }
            }
        }
    }
    return stack.isEmpty()
}

fun main() {
    println(validParenthesesV1("([)]"))
}