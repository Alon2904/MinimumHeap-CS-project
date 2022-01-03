
package linkedListHandeling;
import java.util.LinkedList;




/** Represent unsorted lists that can't holds the same variables
 * 
 */
public class foreignUnsortedLists extends HeapLinkedList {
    
    /** Inserting a given value into the lists while checking if item is in other lists
     * @param value - inserted value
     * @param index - current list index
     * @param x - array that holds the lists
     * @return Node - the inserted node
     */
    @Override
    public Node insert(int value,int index,HeapLinkedList [] x) {

        for(int i=0;i<=index;i++){
            if(x[i].isOnList(value)){
                System.out.println("The input value: "+ value + " already on the list on index: " + i);
                break;
            }
        }
        Node inserted = super.insert(value,index,x);

        // TODO: foreign lists logic

        return inserted;
}


/** Merging two lists by given index
 * @param first - first list to merge
 * @param second - second list to merge
 * @return foreignUnsortedLists - merged lists as one list
 */
public static foreignUnsortedLists merge(foreignUnsortedLists first, foreignUnsortedLists second) {
    foreignUnsortedLists merged = new foreignUnsortedLists();
    first.addAll(second);

    return first;



    
}
}

