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

            public static sortedLists merge(sortedLists first, sortedLists second) {
                //will merge 2 lists given by index in the input and will return a new heap object contatins the merge
                //we need to make sure the union is also sorted. make sure the union dosent contain doubles
                
            }
        }

// 