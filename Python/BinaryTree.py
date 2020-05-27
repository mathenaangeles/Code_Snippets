class Node:
    def __init__(self, value):
        self.left = None
        self.right = None
        self.value = value

    def insert(self, value):
        if self.value:
            if value < self.value:
                if self.left is None:  # Check if it has a left child node.
                    self.left = Node(value)
                else:
                    self.left.insert(value)
            elif value > self.value:
                if self.right is None:  # Check if it has a right child node.
                    self.right = Node(value)
                else:
                    self.right.insert(value)
        else:
            self.value = value

    def show(self):
        if self.left:
            self.left.show()
        print(self.value)
        if self.right:
            self.right.show()

    # Inorder Traversal (Left -> Root -> Right)
    def inorderTraversal(self, root):
        arr = []
        if root:
            arr = self.inorderTraversal(root.left)
            arr.append(root.value)
            arr = arr + self.inorderTraversal(root.right)
        return arr

    # Preorder Traversal (Root -> Left -> Right)
    def preorderTraversal(self, root):
        arr = []
        if root:
            arr.append(root.value)
            arr = arr + self.preorderTraversal(root.left)
            arr = arr + self.preorderTraversal(root.right)
        return arr

     # Postorder Traversal (Left -> Right -> Root)
    def postorderTraversal(self, root):
        arr = []
        if root:
            arr = self.postorderTraversal(root.left)
            arr = arr + self.postorderTraversal(root.right)
            arr.append(root.value)
        return arr


root = Node(27)
root.insert(14)
root.insert(35)
root.insert(10)
root.insert(19)
root.insert(31)
root.insert(42)
print(root.inorderTraversal(root))
print(root.preorderTraversal(root))
print(root.postorderTraversal(root))
