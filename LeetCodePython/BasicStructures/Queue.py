#BasicQueue
class Queue:
    def __init__(self, node = None):
        if node == None:
            self.head = None
            self.tail = None
            return
        elif not isinstance (node, Node):
            node = Node(node)
        self.head = node
        self.tail = node

    def __iter__(self):
        n = self.head
        while n:
            yield repr(n)
            n = n.next

    def add(self, node):
        if not isinstance(node, Node):
            node = Node(node)
        
        if self.head == None:
            self.head = node
            self.tail = node
            return
        
        self.tail.next = node
        self.tail = node
    
    def remove(self):
        if self.head == None:
            return
        
        if self.head == self.tail:
            self.head = None
            self.tail = None

        self.head = self.head.next
    
    def to_string(self):
        return ''.join(iter(self))


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
    def __repr__(self):
        return repr(self.data)