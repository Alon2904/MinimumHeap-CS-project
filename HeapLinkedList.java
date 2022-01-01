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

    public void toPrint() {
        System.out.print("Current Heap:  ");
        for(int i = 0;i<this.size();i++){
            System.out.print(this.getInIndex(i).value+" ");
        }
        System.out.println("");
    }

    static boolean isValidToMerge() {
        //will check if the input is correct
    }

    static HeapLinkedList merge() {
        //will merge 2 lists given by index in the input and will return a new heap object contatins the merge
    }

    }
  
    
}
