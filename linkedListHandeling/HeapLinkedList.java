
package linkedListHandeling;
import java.util.LinkedList;

/** Represent Parent class for all of the other lists classes.
 
 * 
 */
public class HeapLinkedList extends LinkedList {
    
    /** creating a node and assinging the given value to the node and than adding it to the list
     * @param value - given value
     * @param i - not used on that method. method is overiden in other parts of the program
     * @param x - array that hold the lists
     * @return Node - inserted node
     */
    public Node insert(int value,int i,HeapLinkedList [] x) {
        Node node  = new Node(value);
        node.value = value;
        this.add(node);

        return (Node)this.getLast();
    }
    

    
    /** 
     * @return Node
     */
    public Node getFirst() {
        Node first = (Node) super.getFirst();


        return first;
    }

   

    
    /** Returns the node in the i index of the list
     * @param index 
     * @return Node 
     */
    public Node getInIndex(int index) {
        Node indexed = (Node) super.get(index);

        return indexed;
    }

    /**Printing the HeapLinkedList 
     * 
     */
    public void toPrint() {
        System.out.print("Current Heap:  ");
        for(int i = 0;i<this.size();i++){
            System.out.print(this.getInIndex(i).value+" ");
        }
        System.out.println("");
    }

    
    /** Checking if the given array contains valid values to use later in "merge" method
     * @param splittedLine - array that holds that values
     * @param status - indicate what kind of list were working with
     * @param index - current list index in lists array
     * @return boolean - if arguments are valid
     */
    public static boolean isValidToMerge(String [] splittedLine,String status,int index) {
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

    
    /** will merge 2 lists by given indexes. assuming input is valid due to "isValidToMerge" method
     the method will call sub classes overiiden methods
     * @param first - first list to merge
     * @param second - second list to merge
     * @param status - indicate what kind of list were working with
     * @return HeapLinkedList
     */
    public static HeapLinkedList merge(HeapLinkedList first, HeapLinkedList second, String status) {
        HeapLinkedList merged = new HeapLinkedList();
    switch (status) {
        case "A":
        merged =(sortedLists) sortedLists.merge((sortedLists) first, (sortedLists) second);
        
        break;


        case "B":
        merged =(unsortedLists) unsortedLists.merge((unsortedLists) first, (unsortedLists) second);

        break;

        case "C":
        merged = (foreignUnsortedLists) foreignUnsortedLists.merge((foreignUnsortedLists) first,(foreignUnsortedLists) second);

        break;
    }

    return merged;

    }

    
  
    



/** checks if the given String is a number
 * @param str -
 * @return boolean - returns true if string is int
 */
public static boolean isNumeric(String str) {
    int value;
    try {
       value = Integer.parseInt(str);
       
       return true;
     }      catch (NumberFormatException e) {
        System.out.println("Input invalid");
      return false;
  }
    }


/** Checks if the given value already inserted into another list
 * @param value
 * @return boolean return true if it is
 */
public boolean isOnList(int value) {
        for(int i = 0;i<this.size();i++) {
            if(this.getInIndex(i).value == value) {
                return true;
            }
        }
        return false;
}
}