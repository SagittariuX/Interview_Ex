from BasicStructures.Stack import * 

# implement a queue with 2 stacks
class StackQueue:
    def __init__(self, data = None):
        self.start = Stack() #represents the start of the queue
        self.end = Stack()   #represents the end of the queue
        if data == None: return
        self.end.add(data)
    
    def add(self, data):
        self.end.add(data)
    
    def pop(self):
        if self.start.is_empty() and self.end.is_empty(): return None

        if self.start.is_empty():
            while not self.end.is_empty():
                self.start.add(self.end.pop_node())
        
        return self.start.pop()

    def is_empty(self):
        return self.start.is_empty() and self.end.is_empty()


q = StackQueue()
q.add(1)
q.add(2)
q.add(3)
while not q.is_empty():
    print(q.pop())