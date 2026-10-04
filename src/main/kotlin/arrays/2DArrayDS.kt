package arrays

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun hourglassSum(arr: Array<Array<Int>>): Int {
    var r = 0
    val hourglassSums = mutableListOf<Int>().toMutableList()

    while(r < arr.size-2) {
        for(c in arr.indices.first..(arr.indices.last-2)) {
            hourglassSums += (arr[r][c] +
                    arr[r][c+1] +
                    arr[r][c+2] +
                    arr[r+1][c+1] +
                    arr[r+2][c] +
                    arr[r+2][c+1] +
                    arr[r+2][c+2])
        }
        r++
    }

    return hourglassSums.max()
}

fun main(args: Array<String>) {

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}
