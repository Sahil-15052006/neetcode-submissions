class MinStack:
    stack:list
    minArray:list

    def __init__(self):
        self.stack:list = []
        self.minArray:list=[]

    def push(self, val: int) -> None:
        self.stack.append(val)
        if len(self.minArray)==0:
            self.minArray.append(val)
        else:
            self.minArray.append(min(self.minArray[-1],val))
            
    def pop(self) -> None:
        self.stack.pop()
        self.minArray.pop()

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.minArray[-1]
        
        
