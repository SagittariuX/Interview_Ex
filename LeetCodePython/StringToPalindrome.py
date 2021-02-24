from BasicStructures.LinkedList import *
from BasicStructures.Queue import *
import math
#Prompt: turn a string into a palindrome return None on failure

# Time O(n) Space O(n)
def stringToPalindrome(string):
    if(len(string) == 0): return None
    if(len(string) == 1): return string

    middle = math.floor(len(string)/2)-1
    myset = set() #return from hashset is O(1)
    palindrome = DoubleLinkedList()

    for x in string:
        #lets check if x matches
        if x in myset:
            palindrome.add(x)
            palindrome.addFront(x)
            myset.remove(x)
        #not a match
        else :
            myset.add(x)

    if len(myset) == 1:
        palindrome.insert_after(middle, myset.pop())
    elif len(myset) > 0:
        return None
    

    return palindrome.to_string()


string = 'rraacce'
string ='aabb'
string ='ababb'
string = 'c'
print(stringToPalindrome(string))

