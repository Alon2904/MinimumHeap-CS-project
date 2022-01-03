package linkedListHandeling;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.LinkedList;







public class unsortedLists extends HeapLinkedList {

    
    /** 
     * @param value
     * @param i
     * @param x
     * @return Node
     */
    @Override
    public Node insert(int value,int i,HeapLinkedList [] x) {
        Node inserted = super.insert(value,i,x);

        // TODO: Sort node logic

        return inserted;
}
            

/** 
 * @param first
 * @param second
 * @return unsortedLists
 */
public static unsortedLists merge(unsortedLists first, unsortedLists second) {
    unsortedLists merged = new unsortedLists();
    first.addAll(second);

    return first;

        }

        // TODO: Sort node logic

      

        

}
