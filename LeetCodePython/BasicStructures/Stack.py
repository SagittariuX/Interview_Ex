#Basic Stack

class Stack:
    def __init__(self, node = None):
        if node == None:
            self.head = None
            return
        elif not isinstance (node, Node):
            node = Node(node)
        self.head = node
        
    def __iter__(self):
        n = self.head
        while n:
            yield repr(n)
            n = n.next

    def add(self, node):
        if not isinstance(node, Node):
            node = Node(node)
        node.next = self.head
        self.head = node
        return

    def pop(self):
        if self.head == None:
            return None
        node = self.head
        self.head = self.head.next
        return repr(node)

    def pop_node(self):
        if self.head == None:
            return None
        node = self.head
        self.head = self.head.next
        return node
    
    def peek(self):
        if self.head == None: return None
        return repr(self.head)
    
    def peek_node(self):
        if self.head == None: return None
        return self.head
    
    def is_empty(self):
        return self.head == None



class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
    def __repr__(self):
        return repr(self.data)

