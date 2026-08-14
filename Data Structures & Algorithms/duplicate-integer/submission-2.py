class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashmap = {}
        for num in nums:
            print(num)
            if num in hashmap:
                return True
            else:
                hashmap[num]=0
        return False

        