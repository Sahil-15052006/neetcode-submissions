class Solution:
    def encode(self, strs: List[str]) -> str:
        encoded_str:str=""
        for s in strs:
            encoded_str+=str(len(s))+"#"+s
        print(encoded_str)
        return encoded_str

    def decode(self, s: str) -> List[str]:
        decoded_list=[]
        i=0
        while i<len(s):
            length=""
            if s[i+1]=="#":
                length+=s[i]
                start=i+2
                decoded_list.append(s[start:start+int(length)])
                # print(s[start:start+int(length)])
                i+=(2+int(length))
                # print(i)
    
            elif s[i+2]=="#":
                length+=s[i:i+2]
                start=i+3
                decoded_list.append(s[start:start+int(length)])
                i+=(3+int(length))
                
            elif s[i+3]=="#":
                length+=s[i:i+3]
                start=i+4
                decoded_list.append(s[start:start+int(length)])
                i+=(4+int(length))
        
        # 9552057009 Uddav
        
        return decoded_list