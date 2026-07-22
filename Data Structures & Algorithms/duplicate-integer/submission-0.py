class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        #true if duplicate
        empty_map = dict()
        for i in nums:
            empty_map[i] = empty_map.get(i, 0) + 1 #can't increment using += if key is yet to exist
            if empty_map[i] > 1:
                return True
        return False