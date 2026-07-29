class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # return product of all numbers left of nums[i] and right of
        length = len(nums)
        # creates len(nums) elements in output, each = 1
        output = [1] * length
        prefix = 1
        for i in range(0, length):
            output[i] = prefix
            prefix *= nums[i]
        suffix = 1
        for i in range(length - 1, -1, -1):
            output[i] *= suffix
            suffix *= nums[i]
        return output
