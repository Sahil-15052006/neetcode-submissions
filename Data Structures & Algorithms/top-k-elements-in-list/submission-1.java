
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
                if(map.containsKey(n)){
                    map.put(n,map.get(n)+1);
                }
                map.putIfAbsent(n,1);
        }
        System.out.println(map);

        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
                entries.add(entry);
        }

        entries.sort((a,b)->b.getValue()-a.getValue());
        System.out.println(entries);

        int[] output = new int[k];
        for(int i=0; i<output.length;i++){
            output[i] = entries.get(i).getKey();
        }

        return output;
    }
}
