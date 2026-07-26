class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        List<List<String>> output =  new ArrayList<>();

        for(int i = 0; i<strs.length;i++){

            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String current = new String(chars);

            if(map.containsKey(current)){

                List<String> currentList = map.get(current) ;

                currentList.add(strs[i]);
                map.put(current,currentList);

            } else {

                List<String> currentList = new ArrayList<>();
                currentList.add(strs[i]);
                map.put(current,currentList);

            }
        } 

        map.forEach((key,value)->{
            output.add(value);
        });

        return output;
    }
}
