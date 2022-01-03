package linkedListHandeling;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.LinkedList;






/**Represent unsorted lists
 * 
 */
public class unsortedLists extends HeapLinkedList {

    
   /** Inserting a given value into the list in unsroted order
     * @param value - inserted value
     * @param index - current list index
     * @param x - array that holds the lists
     * @return Node - the inserted node
     */
    @Override
    public Node insert(int value,int i,HeapLinkedList [] x) {
        Node inserted = super.insert(value,i,x);

        // TODO: Sort node logic

        return inserted;
}
            

/** merging to unsorted lists in unsorted order
 * @param first - first list to merge
 * @param second - second list to merge
 * @return unsortedLists
 */
public static unsortedLists merge(unsortedLists first, unsortedLists second) {
    unsortedLists merged = new unsortedLists();
    first.addAll(second);

    return first;

        }

        
/**Returns the minimum value in the list
 * 
 * @return min - minimum value in the list
 */
        public int min(){
            int min = this.getInIndex(0).value;
            for(int i = 1;i<this.size();i++){
                if(this.getInIndex(i).value<min){
                    min = this.getInIndex(i).value;
                }
            }
            return min;
        }

        public int extractMin() {
            
        }

        

}
