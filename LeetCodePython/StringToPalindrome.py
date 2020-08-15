from BasicStructures.LinkedList import *
from BasicStructures.Queue import *
#Prompt: turn a string into a palindrome return None on failure


l = LinkedList(1)
l.add(2)
print(l.to_string())


dl = DoubleLinkedList(1)
dl.add(3)
dl.add(4)
dl.insertAfter(1, 2)
dl.add(5)

print(dl.to_string())



def stringToPalindrome(string):
    if(len(string) == 0): return None
    if(len(string) == 1): return string

    middle = len(string)/2
    outlier = None
    queue = Queue()
    palindrome = DoubleLinkedList()

    for x in string:
        #lets check if x matches
        if outlier == x:
            
            palindrome.add(x)
            palindrome.addFront(x)
            outlier = None
        elif queue.peek() == x:
            palindrome.add(x)
            palindrome.addFront(x)


    return palindrome.to_string()