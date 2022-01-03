
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
            if(splittedLine[0].equals("Insert") && HeapLinkedList.isNumeric(splittedLine[1])){
                
            int value = Integer.parseInt(splittedLine[1]);
            System.out.println("Input: Insert " + value);
            x[index].insert(value, index,x);
             x[index].toPrint();
            }
        } else if(input.contains("Merge")){
            
            String [] splittedLine = input.split(" ");
                if(HeapLinkedList.isValidToMerge(splittedLine,status,index)){
                    index++;
                    int index1 = Integer.parseInt(splittedLine[1]);
                    int index2 = Integer.parseInt(splittedLine[2]);
                    System.out.println("Input: Merge " + index1 + " " + index2);

                //method will return a list
                x[index] = HeapLinkedList.merge(x[index1],x[index2],status);
                x[index].toPrint();
                }
            }
        }


    

    private void handleMakeHeap() {

    }


   
      
 
        

   


    }
    // private void handleInsert(string input) {
    //     // TODO: Split string on space
    //     // TODO: Check the second split index is numeric
    //     // Insert 8
    // }

