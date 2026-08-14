class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t) : return False

        s_map={}
        
        for i in s:
            if i in s_map:
                s_map[i] = s_map[i]+1
            else:
                s_map[i] = 1
        
        for j in t:
            if j in s_map and s_map[j]!=0:
                s_map[j] = s_map[j]-1
            else:
                return False

        return True