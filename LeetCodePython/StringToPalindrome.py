from BasicStructures.LinkedList import *
from BasicStructures.Queue import *
import math
#Prompt: turn a string into a palindrome return None on failure


def stringToPalindrome(string):
    if(len(string) == 0): return None
    if(len(string) == 1): return string

    middle = math.floor(len(string)/2)-1
    outlier = None
    queue = Queue()
    palindrome = DoubleLinkedList()

    for x in string:
        #lets check if x matches
        if outlier == x:
            palindrome.add(x)
            palindrome.addFront(x)
            outlier = queue.pop()
        elif queue.peek() == x:
            palindrome.add(x)
            palindrome.addFront(x)
            queue.pop()
        #not a match
        elif outlier == None:
            outlier = x
        else :
            queue.add(x)

    if not queue.is_empty():
        return None
    
    if outlier != None:
        palindrome.insert_after(middle, outlier)
    

    return palindrome.to_string()


string = 'rraacce'
string ='aabb'
print(stringToPalindrome(string))

