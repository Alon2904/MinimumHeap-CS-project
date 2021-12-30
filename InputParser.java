
public class InputParser {
    int index = -1;

    public void parse(String input,String status, HeapLinkedList [] x){
        
        if (input.equals("MakeHeap")) {
            HeapLinkedList list = new HeapLinkedList();
            // TODO: Make heap logic
            index++;
                
                switch(status) {
                    case "A":
                    list = new sortedLists();
                    System.out.println("Input Selected: A");
                    break;
                    
    
                    case "B":
                    list = new unsortedLists();
                    System.out.println("Input Selected: B");
                    break;
                    
    
                    case "C":
                    list = new foreignUnsortedLists();
                    System.out.println("Input Selected: C");
                    break;
              
            }
            
               System.out.println("input: MakeHeap");
               System.out.println("Heap before operation:   " + x[index]);
               x[index] =  list;
               System.out.println("Heap after operation:    " + x[index]);
               System.out.println("----------------------------------------------");
            
        }
        else if (input.contains("Insert")) {
            String [] splittedLine = input.split(" ");
            if(splittedLine[0].equals("Insert") && isNumeric(splittedLine[1])){
                
            int value = Integer.parseInt(splittedLine[1]);
            System.out.println("Input: Insert " + value);
            x[index].insert(value, index);
             x[index].toPrint();
            }
        }
    }

    private void handleMakeHeap() {

    }


    public boolean isNumeric(String str) {
     int value;
     try {
        value = Integer.parseInt(str);
        
        return true;
      } 
      
      catch (NumberFormatException e) {
          System.out.println("Input invalid");
        return false;
    }
        
}
   


    }
    // private void handleInsert(string input) {
    //     // TODO: Split string on space
    //     // TODO: Check the second split index is numeric
    //     // Insert 8
    // }

