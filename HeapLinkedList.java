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

    static boolean isValidToMerge(String [] splittedLine,String status,int index) {
        //will check if the input is correct 
        int list1 = Integer.parseInt(splittedLine[1]);
        int list2 = Integer.parseInt(splittedLine[2]);
        if(splittedLine[0].equals("Merge") && 
        list1 <= index &&
        list2 <= index &&
        list1 != list2){
            return true;
        } else
        return false;
    }

    static HeapLinkedList merge() {
        //will merge 2 lists given by index in the input and will return a new heap object contatins the merge
    }

    
  
    


public static boolean isNumeric(String str) {
    int value;
    try {
       value = Integer.parseInt(str);
       
       return true;
     } 
    }
}