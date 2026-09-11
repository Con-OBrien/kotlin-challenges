
fun frequencyMap(nums: Array<Int>): Int {
    val map = mutableMapOf<Int, Int>()

    for(i in nums.indices) {
        map[nums[i]] = (map[nums[i]] ?: 0) + 1
        if(map.getValue(nums[i]) > 1) {
            println(map)
            return nums[i]
        }
    }
    return -1
}

fun main() {
    println("Frequency map: " + frequencyMap(arrayOf(5,5,1,2,3,5)))
}