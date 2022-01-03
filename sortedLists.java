import java.io.FilterInputStream;
import java.util.LinkedList;
import java.util.ListIterator;

public class sortedLists extends HeapLinkedList {

    @Override
    public Node insert(int value,int i, HeapLinkedList [] x) {
        Node node  = new Node(value);
        node.value = value;

       int j = 0;

       if(this.size() > 0){

        while(j<this.size() && value>this.getInIndex(j).value){

            j++;
       } 
       }

          
             this.add(j, node);
             return node;
            }

            public static sortedLists merge(sortedLists first, sortedLists second) {
               sortedLists merged = new sortedLists();
                first.addLast(null);
                second.addLast(null);
               ListIterator firstIterator = first.listIterator(0);
               ListIterator secondIterator = second.listIterator(0);

            
               
               Node firstNode = (Node) firstIterator.next();
               Node secondNode = (Node) secondIterator.next();
                //runing as long both lists stil has objects
                while (firstIterator.hasNext() || secondIterator.hasNext()) {
                   
                    if(firstIterator.hasNext() && secondIterator.hasNext()){
                    if(firstNode.value < secondNode.value){
                        merged.add(firstNode);
                        firstNode = (Node) firstIterator.next();
                        
                    } else  if(firstNode.value > secondNode.value) {
                        merged.add(secondNode);
                        secondNode = (Node) secondIterator.next();
                        
                    } else if(firstNode.value == secondNode.value){
                        merged.add(secondNode);
                        secondNode = (Node) secondIterator.next();
                        firstNode = (Node) firstIterator.next();


                        
                    }}else if(!secondIterator.hasNext() && firstIterator.hasNext()) {
                        merged.add(firstNode);
                        firstNode = (Node) firstIterator.next();
                    } else if(!firstIterator.hasNext() && secondIterator.hasNext()) {
                        merged.add(secondNode);
                        secondNode = (Node) secondIterator.next();
                        
                    }
       
               
               
            
            }//out wwhile

            merged.toPrint();
                        return merged;
            }//function
        }//class

// 