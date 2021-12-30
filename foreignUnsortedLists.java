

import java.util.LinkedList;





public class foreignUnsortedLists extends HeapLinkedList {
    @Override
    public Node insert(int value,int i) {
        Node inserted = super.insert(value,i);

        // TODO: Sort node logic

        return inserted;
}
}