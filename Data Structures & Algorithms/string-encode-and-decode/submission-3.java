class Solution {

    public String encode(List<String> strs) {

        String encoded_string = "";

        for(int i=0; i<strs.size(); i++){
            encoded_string+=Integer.toString(strs.get(i).length());
            encoded_string+='#';
            encoded_string+=strs.get(i);
        }

        System.out.println(encoded_string);
        return encoded_string;

    }

    public List<String> decode(String str) {

        List<String> decoded_strs = new ArrayList<>();

        int j=0;
        for(int i=0; i<str.length(); i=j){
            int start = i;
            int end = i;
            i+=1;
            while(str.charAt(i)!='#'){
                end+=1;
                i+=1;
            }
            i+=1;
            int len = Integer.parseInt(str.substring(start,end+1));
            String word = str.substring(i,i+len);
            decoded_strs.add(word);
            j=i+len;
        }
        
        return decoded_strs;
    }
}
