import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.plaf.synth.SynthLabelUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.Scanner;

/**
 * @author Alon Cohen
 */


public class main {
    /**
    This program creats sorted/unsorted/foriegn and unsroted(foreign - two different lists can't have the same value)
      and coresponding to user commands like "MakeHeap", "Insert", "Merge".
      The input of the program will be in a txt file name "input.txt" and will have to be stored in the same folder with the program.
      The first two arguments 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        // a/b/c defines the linked-list status
        



        // importing the txt file
        File input = new File("input.txt");
        Scanner scanner = new Scanner(input);

        //prints option for user
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(" Please Choose one of the following options by sending the capital letter to its left:");
        System.out.println(" A - Sorted lists");
        System.out.println(" B - Unsorted Lists");
        System.out.println(" C - Unsorted and foreign lists");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("");

        //recieving the heap type wer'e working with
        String status = scanner.nextLine();
        
        HeapLinkedList[] arrOfLists = new HeapLinkedList[100];
        String currLine;
       
                    
        InputParser parser = new InputParser();
                    
        while(scanner.hasNext()){
            parser.parse(scanner.nextLine(),status,arrOfLists);
        

        }
           

        //    // TODO - add a function to make it look nicer
        //    if(currLine.equals("MakeHeap")){
        //     index++;
        //     HeapLinkedList list;
        //     switch(status) {
        //         case "A":
        //         list = new sortedLists();
        //         System.out.println("A");
        //         break;
                

        //         case "B":
        //         list = new unsortedLists();
        //         System.out.println("B");
        //         break;
                

        //         case "C":
        //         list = new foreignUnsortedLists();
        //         System.out.println("C");
        //         break;
                

            

            
        //     arrOfLists[index] = list;
        //    System.out.println("input - MakeHeap");
        //    System.out.println(arrOfLists[index]);
        // }
    

 

}       


        
}





