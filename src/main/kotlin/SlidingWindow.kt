fun slidingWindow(target: Int, ints: IntArray): Int {
   var sum = 0
    var minimumLength = Int.MAX_VALUE
    var left = 0

    for(right in ints.indices) {
        sum += ints[right]

        while(sum >= target) {
            val windowLength = right - left + 1
            if(windowLength < minimumLength) { minimumLength = windowLength }
            sum -= ints[left]
            left++
        }
    }
    return if (minimumLength == Int.MAX_VALUE) 0 else minimumLength
}

fun main() {
    println(slidingWindow(7, intArrayOf(2,3,1,2,4,3)))
}