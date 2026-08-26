class TrieNode:
    def __init__(self):
        self.childrens:dict[str,TrieNode]={}
        self.isEnd = False

class Trie:
    def __init__(self):
        self.root = TrieNode()
    
    def insert(self,word)->void:
        current = self.root
        for char in word:
            if char not in current.childrens:
                current.childrens[char] = TrieNode()
            current = current.childrens[char]
        current.isEnd:bool = True 

    def longest_common_prefix(self):
        current = self.root
        lcp = ""
        while len(current.childrens.keys())==1 and current.isEnd == False :
            iterator = iter(current.childrens.keys())
            key = str(next(iterator))
            lcp+=key
            current = current.childrens[key]
        return lcp


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        trie = Trie()
        for s in strs:
            trie.insert(s)

        return trie.longest_common_prefix()
            