
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n=0;n<nums.length;n++){
            map.put(nums[n],map.getOrDefault(nums[n],0)+1);
        }

        List<int[]> entries = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            entries.add(new int[]{entry.getValue(),entry.getKey()});
        }

        entries.sort((a,b)->b[0]-a[0]);

        int[] output = new int[k];
        for(int i=0; i<output.length;i++){
            output[i] = entries.get(i)[1];
        }

        return output;
    }
}
