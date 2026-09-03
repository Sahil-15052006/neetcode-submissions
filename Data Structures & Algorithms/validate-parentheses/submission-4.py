class Solution:
    def isValid(self, s: str) -> bool:
        parentheses={
            "{" : "}",
            "[" : "]",
            "(" : ")"
        }

        stack=[]

        for i in s:
            print(i)
            if i in parentheses:
                stack.append(i)
            else:
                if len(stack) <= 0 :
                    return False
                stacktop = stack.pop()
                if parentheses[stacktop] != i:
                    return False
                
            
        if len(stack) > 0:
                print('stack not empty')
                return False
        return True
            
        