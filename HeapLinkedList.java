import java.util.LinkedList;

public class HeapLinkedList extends LinkedList {
    public Node insert(int value,int i) {
        Node node  = new Node(value);
        node.value = value;
        this.add(node);

        return (Node)this.getLast();
    }
    

    public Node getFirst() {
        Node first = (Node) super.getFirst();


        return first;
    }

   

    public Node getInIndex(int index) {
        Node indexed = (Node) super.get(index);

        return indexed;
    }
}
