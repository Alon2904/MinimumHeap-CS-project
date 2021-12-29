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

    public int getValue(){
        int n = this.value;
        return n;

    }

    public Node getLeftChild(){
        Node x = this.leftChild;
        return x;
    }

    public Node getRightChild(){
        Node x = this.rightChild;
        return x;
    }

    public Node getParent(){
        Node x = this.parent;
        return x;
    }
}