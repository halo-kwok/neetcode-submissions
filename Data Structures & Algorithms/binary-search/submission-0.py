class Solution:
    def search(self, nums: List[int], target: int) -> int:
        lo = 0
        hi = len(nums) - 1
        mid = lo + (hi - lo)//2

        while (lo <= hi):
            if (target == nums[mid]):
                return mid
            elif (target < nums[mid]):
                hi = mid - 1
                mid = lo + (hi - lo)//2
                print("hi:" + str(hi))
            elif (target > nums[mid]):
                lo = mid + 1
                mid = lo + (hi - lo)//2
                print("lo:" + str(lo))
        return -1