class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false ;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int value = map.get(s.charAt(i));
                value+=1;
                map.put(s.charAt(i),value);
            }
            map.putIfAbsent(s.charAt(i),1);
        }
        for(int i=0; i<t.length();i++){
            if(!map.containsKey(t.charAt(i))){
                return false;
            }
            int value = map.get(t.charAt(i));
            if(value==0){
                return false;
            }
            value-=1;
            map.put(t.charAt(i),value);
        }
        return true;
    }
}
