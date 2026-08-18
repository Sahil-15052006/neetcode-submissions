class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count= Counter(nums)
        output=[]
        # print(count)

        values = [value for value in count.values()]
        values.sort(reverse=True)
        
        required_values = [ values[v] for v in range(0,k)]
        # print(required_values)
        for key in count.keys():
            if count[key] in required_values:
                output.append(key)

        return output