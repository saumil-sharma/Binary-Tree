# Java Binary Tree
#### 1/4/2024

This is an example of a Binary Treew written in Java. The binary tree class
contains the following methods:
```java
void addNode(int data);
void removeNode(int data);
void display();
boolean exists();
```

Most of the methods are used recursively, with a `private` method counterpart within the class.

### addNode()
The `addNode()` method takes an input in the form of an `int`, it first
checks if the `root` Node is occupied, if that isn't it creates a new Node
and sets the `root` variable to that.

If there is a `root` variable, we first check using the `exists()` method if the
given number exists within the tree. If we see that it does exist, we throw an Exception 
with the message `"Number already exists in tree."`. If the number doesn't already exist,
we then add it recursively.

To add the Node recursively, we start with the `root` Node and work out way
down gradually. We use the `private` method of `addNode()` and use that
recursively.

First, we check if the `data` variable that we want to add is greater or less than the current node. If it is less than the current Node, we check if the `Node.getLeft()` is `null`, if we see that it is `null`,
we can create a new Node and set it to the `left` of the current Node using `Node.setLeft()` 


If the `data` variable is greater than the current Node, we then use the same procedure
but use the `Node.getRight()` and `Node.setRight()` methodss.

### removeNode()
Will be written later.

### display()
Will be written later.

### exists()
Uses recursion to navigate around the tree in similar fashion to `addNode()`,
if the `data` matches the current Node's `data` variable we return `true`, if not, we check
if there are children to the current Node, if not, we return `false`, else continue.
