package linkedListHandeling;

public class Node {
    int value;
    Node parent;
    Node leftChild;
    Node rightChild;

    public Node(int num){
        value = num;
        parent = null;
        leftChild = null;
        rightChild = null;
    }

    
    /** 
     * @return int
     */
    public int getValue(){
        int n = this.value;
        return n;

    }

    
    /** 
     * @return Node
     */
    public Node getLeftChild(){
        Node x = this.leftChild;
        return x;
    }

    
    /** 
     * @return Node
     */
    public Node getRightChild(){
        Node x = this.rightChild;
        return x;
    }

    
    /** 
     * @return Node
     */
    public Node getParent(){
        Node x = this.parent;
        return x;
    }
}