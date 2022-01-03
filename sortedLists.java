import java.io.FilterInputStream;
import java.util.LinkedList;
import java.util.ListIterator;

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
               sortedLists merged = new sortedLists();
                first.addLast(null);
                second.addLast(null);
               ListIterator firstIterator = first.listIterator(0);
               ListIterator secondIterator = second.listIterator(0);

               int i = 0;
               int j = 0;
               
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
                        
                    } } else if(!secondIterator.hasNext() && firstIterator.hasNext()) {
                        merged.add(firstNode);
                        firstNode = (Node) firstIterator.next();
                    } else if(!firstIterator.hasNext() && secondIterator.hasNext()) {
                        merged.add(secondNode);
                        secondNode = (Node) secondIterator.next();
                        
                    }


                   
                    
                    }
                    
                     //treating left nodes on first list

                    //treating left values on second list
                


                
                        return merged;
               }
               
               
            }
        

// 