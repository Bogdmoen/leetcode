package arrays_101

// Given a binary array nums, return the maximum number of consecutive 1's in the array.


fun main() {


    val nums = intArrayOf(0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1)

    println(findMaxConsecutiveOnes(nums))
}



fun findMaxConsecutiveOnes(nums: IntArray): Int {

    var pointerOne = 0
    var pointerTwo = 0

    for (i in nums.indices) {

        if(nums[i] == 1) {
            pointerOne++
        }
        else {
            pointerTwo = if (pointerOne > pointerTwo) pointerOne else pointerTwo
            pointerOne = 0
        }
    }

    return pointerOne.coerceAtLeast(pointerTwo)
}