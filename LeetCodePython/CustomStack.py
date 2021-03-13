# https://leetcode.com/problems/design-a-stack-with-increment-operation/

class CustomStack(object):

    def __init__(self, max_size):
        """
        :type max_size: int
        """
        self.max_size = max_size
        self.stack = []

        

    def push(self, x):
        """
        :type x: int
        :rtype: None
        """
        if len(self.stack) == self.max_size:
            return None
        
        self.stack.append(x)
        

    def pop(self):
        """
        :rtype: int
        """
        if len(self.stack) == 0:
            return -1

        return self.stack.pop()

    def increment(self, k, val):
        """
        :type k: int
        :type val: int
        :rtype: None
        """
        if k > len(self.stack):
            k = len(self.stack)
        
        for i in range(k):
            self.stack[i] += val

