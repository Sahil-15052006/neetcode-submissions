class Solution {
    public int[] productExceptSelf(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i],1);
        // }

        int[] output = new int[nums.length];
        Arrays.fill(output,1);

        // System.out.println(output);

        for(int k=0; k<nums.length; k++){
            for(int h=0;h<nums.length; h++){
                if(k==h){
                    // System.out.println( "k=" + nums[k] + "h=" + nums[h] + "skip" );
                    continue;
                }
                output[h] = output[h] * nums[k];
                // System.out.println( "k="+nums[k]+"h="+nums[h]+" "+nums[h]+"="+output[h]);
               
            }
            // System.out.println("______");
        }

        // System.out.println(output);

        // for(int i =0; i<output.length; i++){
        //     output[i] = map.get(nums[i]);
        // }

        return output;
    }
}  
