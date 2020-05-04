'''
API

TrieNode:
The class TrieNode will extend from Node base class to represent a node in Trie

Attributes:
children- dict() to represent children of the node
isEndofWord- Boolean to represent leaf position (end of the word).

Trie:
The class Trie to represent data structure Trie.

Attributes:
root - start Node 

Methods:

insert(string): insert a key(=string) in Trie
search(string): returning True if key presents in trie, else false. 
delete(string): delete a key from Trie
'''
'''
        Represents a trie data structure.

        Parameters
        ==========
        dtype: type
            A valid object type.
        N: number of keys in trie
        K: world inserting or searching 
        alphabet_size: size of alphabet *26

        Raises
        ======
        IndexError: 
            list index out of range
        TypeError: 
            object of type 'int' has no len()

        Examples
        ========
        >>> from pydatastructs import trie_structure as 
        >>> key = ["hi","bye"]
        >>> output = ["Not present in trie", 
              "Present in trie"] 
        >>> new = Trie()
        >>> for key in keys: 
               new.insert(key)
        >>> output[new.search("bye")]
        "Present in trie"
        >>> output[new.search("the")]
        "Not present in trie"

        References
        ==========
        .. [1] https://www.geeksforgeeks.org/trie-insert-and-search/
        .. [2] https://gist.github.com/huseynlilkin/d512e7e57dce32cc7317754c3d9d9bce
        '''

#Init node class
class Node: 
      
    def __init__(self): 
        self.children = [None]*26 #26 because we are taking the alphabet_size 
  
        # isEndOfWord is True if node represent the end of the word 
        self.isEndOfWord = False

        self.parent = None

        self.ch = ' '

#Init class trie 
class Trie: 
      
    def __init__(self): 
        self.root = self.getNode() 
  
    def getNode(self): 
      
        return Node()  #Returns new trie node (initialized to NULLs) 
  
    def toIndex(self,ch): 
        '''
        Notes to know about char to Index func:
        Converts key current character into index 
        Using only 'a' through 'z' and lower case 
        Ord() definition: Given a string of length one, return an integer representing the Unicode code point of the character when the argument is a unicode object, or the value of the byte when the argument is an 8-bit string.
        '''
        return ord(ch)-ord('a') 
    
    def insertKey(self,key): 
        '''
        Notes to know about insertion in trie structure:
        Every character of input key is inserted as an individual trie node.
        The children is an array of pointers to next level trie nodes.
        Key refers to the world that you are inserting or searching in the trie

        Insert and search costs O(k) where k is length of key.
        The memory requirements of trie is O(alphabet_size*k*N) where N is number of keys in trie.

          
        If not present, inserts key into trie 
        If the key is prefix of trie node, just marks leaf node 
        ''' 
        pC = self.root 
        length = len(key) 
        for level in range(length): 
            idx = self.toIndex(key[level])  #charToIndex function above
  
            # if character not present:
            if not pC.children[idx]: 
                pC.children[idx] = self.getNode() 
            pC = pC.children[idx] 
  
        #marking last node as leaf:
        pC.isEndOfWord = True #isEndOfWord is True if node represent the end of the word
    
    def searchKey(self, key): 
        '''
        Notes to know about searching in trie structure:
        While searching we only compare the characters and move down.
        Search key in the trie .
        Returning true if key presents in trie, else false. 
        The search can end because of end of a string, if the value field of last node is non-zero then the key exists in trie.
        '''
        pC = self.root 
        length = len(key) 
        for level in range(length): 
            idx2 = self.toIndex(key[level]) #charToIndex function above
            if not pC.children[idx2]: 
                return False
            pC = pC.children[idx2] 
  
        return pC != None and pC.isEndOfWord #and is a boolean expression  | isEndofWord: True if node represent the end of the word
    
    def delete(self,key):
        pC=self.root

        if self.searchKey(key):
            for c in key:
                idx3 = self.toIndex(c)
                pC = pC.children[idx3]
        
            
            pC.isEndOfWord = False

    def delete2(self, key):
        pC = self.root
        length = len(key)
        idx = self.toIndex()
        if len(key) == idx:
            pC.isEndOfWord = False
            return bool(pC.children)
        
        ch = key[idx]
        if ch not in pC.children:
            return True
        flag = self.delete2(key, idx+1, pC.children[ch])
        if flag:
            return True
        
        key.children.pop(ch)
        return bool(key.children) or key.isEndofWord
   
def main(): 
  
    # Input keys with charToIndex rule of a-z in lowercase
    keys = ["hi","pydatastructs","this","is","a", 
            "try","trie"] 
    output = ["Not present in trie", 
              "Present in trie"] 
  
    # Trie object 
    t = Trie() #new class Trie | Object
  
    # Construct trie, inserting keys
    for key in keys: 
        t.insertKey(key) 
  
    # Search for different keys 
    print("{} ---- {}".format("trie",output[t.searchKey("trie")])) 
    print("{} ---- {}".format("bye",output[t.searchKey("bye")])) 
    print("{} ---- {}".format("no",output[t.searchKey("no")])) 
    print("{} ---- {}".format("pydatastructs",output[t.searchKey("pydatastructs")])) 
    
    #delete function
    print("{} ---- {}".format("try",output[t.searchKey("try")]))
    #t.delete("try")
    t.delete2("try")
    print("{} ---- {}".format("try",output[t.searchKey("try")]))

    #printing
    print(keys)


  
if __name__ == '__main__': 
    main() 
  
  