class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2] ;
        for(int i=0; i<nums.length-1; i++){
            int j = i+1;
            while(j<nums.length){
                if(nums[i]+nums[j]==target){
                    output[0]=i;
                    output[1]=j;
                }
                j++;
            }
            // for(int j=i+1; j<nums.length;j++){
            //     if(nums[i]+nums[j]==target){
            //         output[0]=i;
            //         output[1]=j;
            //     }
            // }
        }
    return output;
    }
}
