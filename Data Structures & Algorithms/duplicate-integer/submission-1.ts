class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums: number[]): boolean {
        let map = new Map<number,number>()
        for(let i:number=0;i<nums.length;i++){
            if(map.has(nums[i])){
                return true
            }
            map.set(nums[i],1)
        }
        return false
    }
}
