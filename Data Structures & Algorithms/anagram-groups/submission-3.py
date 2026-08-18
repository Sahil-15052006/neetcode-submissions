class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        strs_dict =  {}
        output = []
        for s in strs:
            sorted_string = "".join(sorted(s))
            # print(sorted_string)
            if sorted_string in strs_dict:
                strs_dict[sorted_string].append(s)
            else:
                strs_dict[sorted_string] = [s]
        # print(strs_dict)
        for value in strs_dict.values():
            output.append(value)
        return output
        