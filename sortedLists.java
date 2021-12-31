import java.util.LinkedList;

public class sortedLists extends HeapLinkedList {

    @Override
    public Node insert(int value,int i) {
        Node node  = new Node(value);
        node.value = value;

       int x = 0;

       if(this.size() > 0){

        while(x<this.size() && value>this.getInIndex(x).value){

            x++;
       } 
       }

       
        
       
       
            
             this.add(x, node);
             return node;
            }
        }

// 