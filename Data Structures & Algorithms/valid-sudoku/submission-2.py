class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        # check row 
        for i in range(0,9):
            rowSet = set()
            for r in board[i]:
                if r != "." and r in rowSet:
                    return False
                rowSet.add(r)

        # check col
        for r in range(0,9):
            colSet = set()
            for c in range(0,9):
                if board[c][r] != "." and board[c][r] in colSet:
                    return False
                colSet.add(board[c][r]) 

        # check grid
        r=0
        while(r<9):
            c=0
            while(c<9):
                gridSet=set()
                for i in range(r,r+3):
                    for j in range(c,c+3):
                        if board[i][j] != "." and board[i][j] in gridSet:
                            return False
                        gridSet.add(board[i][j])
                c+=3
            r+=3
        
        return True



        