#singly linkedlist
class LinkedList:
    def __init__(self,head = None):
        self.head = head
        
    def __iter__(self):
        n = self.head
        while n:
            yield n.data
            n = n.next
        
    def add(self,node):
        if not isinstance(node, Node):
            node = Node(node)
        
        if self.head == None:
            self.head = node
            return
        
        n = self.head
        while n.next != None:
            n = n.next
        
        n.next = node
    
    def to_string(self):
        return ''.join(iter(self))
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

#Node class
#NOTE: Singly linked list does not use the prev variable
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None
        
    def __repr__(self):
        return self.data