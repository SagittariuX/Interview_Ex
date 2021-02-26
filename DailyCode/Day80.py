
def deepest_node(node):
    
    return deepest_node_search(node, 1)[0]
   
def deepest_node_search(node, depth):

    if(node == None):
        return ['' , depth]

    left = deepest_node_search(node.left, depth+1)
    right = deepest_node_search(node.right, depth+1)

    # if left is a null
    if not left[0]:
        left = [node, depth]
    
    # if right is a null
    if not right[0]:
        right = [node, depth]

    if left[1] >= right[1]:
        return left
    else:
        return right

class Node:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


tree = Node('a')
tree.left = Node('b')
tree.left.left = Node('d')
tree.right = Node('c')


print(deepest_node(tree).value)