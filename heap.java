
// public class Heap extends BaseLinkedList {
//     public void insert(int value) {
//         this.add(value);
//         this.bubbleUp(this.last);
//     }

//     private void bubbleUp(Node node) {
//         Node current = this.first;

//         while (current.next != null) {

            
//         }

//     }
// }

public interface Heap {
    Node insert(int key,int i);
    // int Min();
    // int ExtractMin();
    // Heap merge(int index1, int index2);
}

