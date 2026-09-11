fun twoSumInitial(target: Int, nums: Array<Int>): IntArray {
    for(left in nums.indices) {
        for (right in left + 1 until nums.size) {
            if(nums[left] + nums[right] == target) {
                return intArrayOf(left, right)
            }
        }
    }
    return intArrayOf()
}

fun twoSumImproved(target: Int, nums: Array<Int>) : IntArray {
    val mutableMap = mutableMapOf<Int, Int>() //num and index
    var needed: Int
    for(left in nums.indices) {
        needed =  target - nums[left]
        if(mutableMap.containsKey(needed)) {
            return intArrayOf(mutableMap.getValue(needed), left)
        }
        mutableMap[nums[left]] = left
    }
    return intArrayOf()
}

fun main() {
    println(twoSumInitial(6, arrayOf(3,2,4)).contentToString())
    println(twoSumImproved(6, arrayOf(3,2,4)).contentToString())
}