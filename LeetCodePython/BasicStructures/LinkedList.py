#singly linkedlist
class LinkedList:
    def __init__(self,node = None):
        if node == None:
            self.head = None
            return
        elif not isinstance(node, Node):
            node = Node(node)
        self.head = node
        
    def __iter__(self):
        n = self.head
        while n:
            yield repr(n)
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

    def is_empty(self):
        return self.head == None
        
            
class DoubleLinkedList:
    def __init__(self,node = None):
        if node == None:
            self.head = None
            self.tail = None
            return
        elif not isinstance(node, Node):
            node = Node(node)
        self.head = node
        self.tail = node
        
    def __iter__(self):
        n = self.head
        while n:
            yield repr(n)
            n = n.next
    
    def add(self,node):
        if not isinstance(node, Node):
            node = Node(node)
        
        if self.head == None:
            self.head = node
            self.tail = node
            return
        
        node.prev = self.tail
        self.tail.next = node
        self.tail = self.tail.next

    def addFront(self, node):
        if not isinstance(node, Node):
                node = Node(node)
            
        if self.head == None:
            self.head = node
            self.tail = node
            return
        
        node.next = self.head
        self.head.prev = node
        self.head = node

    def getNode(self, target):
        if self.head == None:
            return None

        n = self.head
        for i in range(target):
            n = n.next
            if n == None:
                return None
        
        return n

    def insertAfter(self, target, node):
        if not isinstance(node, Node):
            node = Node(node)

        if self.head == None:
            return False
        
        n = self.head
        for i in range(target):
            n = n.next
            if n == None:
                return False
        
        temp = n.next
        if temp == None:#adding after tail
            self.add(node)
            return True
        
        n.next = node
        node.prev = n
        node.next = temp
        temp.prev = node
        return True


        
    
    def to_string(self):
        return ''.join(iter(self))

    def is_empty(self):
        return self.head == None
        
        

#Node class
#NOTE: Singly linked list does not use the prev variable
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None
        
    def __repr__(self):
        return repr(self.data)