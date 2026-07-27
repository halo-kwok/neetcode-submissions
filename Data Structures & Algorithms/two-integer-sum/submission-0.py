class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indices = {}

        # need to ensure that i != j
        # store og indices in dict

        for i, n in enumerate(nums):
            indices[n] = i # key = num, val = index

        for i, n in enumerate(nums): # loops through each num in nums
            diff = target - n # number in nums that needs to be in the array
            if diff in indices and indices[diff] != i: # checks if num exists and if not same index
                return [i, indices[diff]]
        return []
        
        
        

