
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n=0;n<nums.length;n++){
            if(map.containsKey(nums[n])){
                map.put(nums[n],map.get(nums[n])+1);
            }
            map.putIfAbsent(nums[n],1);
        }

        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            entries.add(entry);
        }

        entries.sort((a,b)->b.getValue()-a.getValue());

        int[] output = new int[k];
        for(int i=0; i<output.length;i++){
            output[i] = entries.get(i).getKey();
        }

        return output;
    }
}
