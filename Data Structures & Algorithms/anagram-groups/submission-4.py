class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        strs_dict={}
        
        for s in strs:
            count = [0]*26
            for char in s:
                count[ord(char)-ord("a")]+=1
            sorted_string = tuple(count)
            if sorted_string in strs_dict:
                strs_dict[sorted_string].append(s)
            else:
                strs_dict[sorted_string] = [s]

        return list(strs_dict.values())
        