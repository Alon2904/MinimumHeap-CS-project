

import java.util.LinkedList;





public class foreignUnsortedLists extends HeapLinkedList {
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

public static foreignUnsortedLists merge(foreignUnsortedLists first, foreignUnsortedLists second) {
    foreignUnsortedLists merged = new foreignUnsortedLists();
    first.addAll(second);

    return first;



    
}
}

