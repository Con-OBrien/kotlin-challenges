package arrays

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun rotateLeft(d: Int, arr: Array<Int>): Array<Int> {
    var shiftedArr = arrayOfNulls<Int>(arr.size)

    for(num in arr.indices) {
        var newIndex = arr.size + (num - d)
        if(newIndex >= shiftedArr.size) {
            newIndex -= shiftedArr.size
            shiftedArr[newIndex] = arr[num]
        }
        else {
            shiftedArr[newIndex] = arr[num]
        }
    }

    return shiftedArr.filterNotNull().toTypedArray()
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = rotateLeft(d, arr)

    println(result.joinToString(" "))
}
