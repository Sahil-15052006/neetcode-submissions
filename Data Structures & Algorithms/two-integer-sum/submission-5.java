class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int RequiredNumber = target - nums[i];
            if(map.containsKey(RequiredNumber)){
                return new int[]{map.get(RequiredNumber),i};
            } else {
                map.put(nums[i],i);
            }
        }
        return output;
    }
}
