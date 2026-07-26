class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = target - nums[i];
            if(map.containsKey(num)){
                output[0]=map.get(num);
                output[1]=i;
                break;
            } else {
                map.put(nums[i],i);
            }
        }
        return output;
    }
}
