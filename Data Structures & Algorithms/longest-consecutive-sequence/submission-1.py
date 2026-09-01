class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums)<=0 : 
            return 0
        arr=[]
        lc=1
        nums.sort()
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                pass
            elif nums[i]-1 == nums[i-1]:
                lc+=1
            else:
                arr.append(lc)
                lc=1
        arr.append(lc)
        arr.sort()
        return arr[len(arr)-1]

            