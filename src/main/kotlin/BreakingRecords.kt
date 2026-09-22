
import kotlin.collections.*

import kotlin.io.*
import kotlin.text.*

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var highestValue = Int.MIN_VALUE
    var lowestValue = Int.MAX_VALUE
    var highValueCount: Int = 0
    var lowValueCount: Int = 0
    for(score in scores) {
        if(score > highestValue) {
            highestValue = score
            highValueCount++
        }
        if(score < lowestValue) {
            lowestValue = score
            lowValueCount++
        }
    }

    return arrayOf<Int>(highValueCount-1, lowValueCount-1)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
