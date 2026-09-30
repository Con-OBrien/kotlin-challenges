import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'hurdleRace' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY height
 */

fun hurdleRace(k: Int, height: Array<Int>): Int {
    // Write your code here
    //k = amount chararacter can jump normally
    //height = list of hurdle height
    // if char clears them w/o potion return 0
    // jump potion increase for the rest of the iteration
    // so for 1 2 3 3 2 - starts with 1, could we just get the max value and take k from it

    var big = height.maxOrNull() ?: 0
    var potions = big.minus(k)

    if(potions > 0) {
        return potions
    }

    return 0

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val height = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}
