// Time complexity O(n) space complexity O(n)

fun maxSum(nums: IntArray): Int {
    val max = nums.max()
    if (max < 0) {
        return max
    }

    val uniqueNums = nums.toSet().filter { it > 0 }

    return uniqueNums.sum()
}

fun main() {
    val input: IntArray = intArrayOf(1, 2, -1, -2, 1, 0, -1)
    val result = maxSum(input)
    println(result)
}
