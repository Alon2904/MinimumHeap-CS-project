package Inputmanaging;

import linkedListHandeling.HeapLinkedList;
import linkedListHandeling.foreignUnsortedLists;
import linkedListHandeling.sortedLists;
import linkedListHandeling.unsortedLists;


/**
 * @author Alon Cohen
 * 
 * The class holds methods needed to analyze the program input. the method will be able to operate
 sub methodes through the InpurParser object
 * 
 */
public class InputParser {
    //index will be used iterate through the different lists in the the array that holds them
    int index = -1;

    
    /** This very main method will operate all of the other sub classes
     * @param input - Line from the txt file
     * @param status - one of the letters A/B/C that represents the kind of lists were working with
     * @param x - Array that holds all of the created lists
     */
    public void parse(String input,String status, HeapLinkedList [] x){
        

        //makeheap handeling
        if (input.equals("MakeHeap")) {
            HeapLinkedList list = new HeapLinkedList();
            // TODO: Make heap logic
            index++;
                System.out.println("----------------------------------------------");
                switch(status) {
                    case "A":
                    list = new sortedLists();
                    System.out.println("Input Selected: A - Sorted List");
                    break;
                    
    
                    case "B":
                    list = new unsortedLists();
                    System.out.println("Input Selected: B - Unsorted List");
                    break;
                    
    
                    case "C":
                    list = new foreignUnsortedLists();
                    System.out.println("Input Selected: C - Foriegn Unsorted List");
                    break;
              
            }
            
               System.out.println("input: MakeHeap");
               System.out.println("Heap before operation:   " + x[index]);
               x[index] =  list;
               System.out.println("Heap after operation:    " + x[index]);
            
        } // insert handeling
        else if (input.contains("Insert")) {

            //splitting the txt line into 2 parts and sotre it in array
            String [] splittedLine = input.split(" ");
            //checks if the input is valid
            if(splittedLine[0].equals("Insert") && HeapLinkedList.isNumeric(splittedLine[1])){
                
            int value = Integer.parseInt(splittedLine[1]);
            System.out.println("----------------------------------------------");
            System.out.println("Input: Insert " + value);
            x[index].insert(value, index,x);
             x[index].toPrint();
            }

            //merge handeling
        } else if(input.contains("Merge")){
            
            //splitting the input into 3 parts
            String [] splittedLine = input.split(" ");

            //checking input validty
                if(HeapLinkedList.isValidToMerge(splittedLine,status,index)){
                    index++;
                    int index1 = Integer.parseInt(splittedLine[1]);
                    int index2 = Integer.parseInt(splittedLine[2]);
                    System.out.println("----------------------------------------------");
                    System.out.println("Input: Merge " + index1 + " " + index2);

                //method will return a list
                x[index] = HeapLinkedList.merge(x[index1],x[index2],status);
                x[index].toPrint();
                }

            } else if(input.equals("Minimum")) {
                int min = x[index].min();
                System.out.println("----------------------------------------------");

                System.out.println("Input: Minimum");
                System.out.println("value returned: " + min);


            } else if(input.equals("ExtractMin")) {
                int min = x[index].extractMin();
                System.out.println("----------------------------------------------");

                System.out.println("Input: ExtractMin");
                System.out.println("value returned: " + min);

            } else {
                System.out.println("Input Invalid - " + input);
            }
        }


    

  

   
      
 
        

   


    }
  

