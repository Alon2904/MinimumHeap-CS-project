package linkedListHandeling;

import java.io.FilterInputStream;
import java.util.LinkedList;
import java.util.ListIterator;

/**Represent liniear sorted list
 * 
 */
public class sortedLists extends HeapLinkedList {

    
    /** Inserting a value into current list. keeping on the sorted order.
     * @param value - inserted value
     * @param i - not used in this method
     * @param x - array that holds the lists
     * @return Node
     */
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

            
            /** Merging two sorted lists into one sorted list
             * @param first - first sorted list to be merged
             * @param second - second sorted list to be merged
             * @return sortedLists
             */
            public static sortedLists merge(sortedLists first, sortedLists second) {
               sortedLists merged = new sortedLists();
               //adding object to the hand the avoid out of index problem while "hasNext()"
                first.addLast(null);
                second.addLast(null);
               ListIterator firstIterator = first.listIterator(0);
               ListIterator secondIterator = second.listIterator(0);

            
               
               Node firstNode = (Node) firstIterator.next();
               Node secondNode = (Node) secondIterator.next();
                //runing as long as one of the lists stil has objects
                while (firstIterator.hasNext() || secondIterator.hasNext()) {
                   
                    //runs while both lists still has objects
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


                        //handeling the case that one of the lists has objects and the other don't
                    }}else if(!secondIterator.hasNext() && firstIterator.hasNext()) {
                        merged.add(firstNode);
                        firstNode = (Node) firstIterator.next();
                    } else if(!firstIterator.hasNext() && secondIterator.hasNext()) {
                        merged.add(secondNode);
                        secondNode = (Node) secondIterator.next();
                        
                    }
       
               
               
            
            }

            merged.toPrint();
                        return merged;
            }

            /**
             * returns minimum value in the list
             * @return min - minimum value in the list
             */
            public int min(){
                int min = this.getFirst().value;
                return min;
            }
        }

