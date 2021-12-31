// class BaseLinkedList {
//     Node first;
//     Node last;
 
//     class Node {
//         int value;
//         Node next;
//         Node parent;
//         Node leftChild;
//         Node rightChild;

//         Node(int value) {
//              this.value = value; 
//             }
    
//         }
//     public void add(int value) {
//         Node node = new Node(value);
//         node.next = null;

//         if (this.first == null) {
//             this.first = node;
//             this.last = node;
//         } else {
//             this.last.next = node;
//             this.last = node;
//         }
//     }

//     public void delete(int index) {
//         Node current = this.first;
//         Node previous = null;

//         if (index == 0 && current != null) {
//             this.first = current.next;
//         } else {
//             int counter = 0;

//             while (current != null) {
 
//                 if (counter == index) {
//                     previous.next = current.next;
//                     break;
//                 } else {
//                     previous = current;
//                     current = current.next;
//                     counter++;
//                 }
//             }

//             if (current == null) {
//                 throw new IndexOutOfBoundsException("Can't delete as an item does not exist at this index");
//             }
//         }
//     }

   

 
// }