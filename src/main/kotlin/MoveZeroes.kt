fun moveZeroes(nums: IntArray): IntArray {
    // need to iterate through nums
    // modify existing, dont create second array
    // if not 0 (at point right) - swap with left index value? -
    // 0, 1, 0, 3, 12 -> skips index 0, at 1, left = 0, right is 1, set nonZero to be nums[right], nums[left] to be nums[right],
    // nums[right] to be nonZero, now we have 1, 0, 0, 3, 12, we can move left up 1 then, iterate another 2 and we'll find 3,
    // same procedure again, move left up 1 again and then iterate once move and perform procedure again
    var left = 0

    for(right in nums.indices) {
        if(nums[right] != 0) {
            val nonZeroValue = nums[left]
            nums[left] = nums[right]
            nums[right] = nonZeroValue
            left++
        }
    }

    return nums
}


fun main() {
    println(moveZeroes(intArrayOf(0, 1, 0, 3, 12)).contentToString())
}