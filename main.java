import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.plaf.synth.SynthLabelUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import Inputmanaging.InputParser;
import linkedListHandeling.HeapLinkedList;

import java.util.Scanner;

/**Runs the commands given by txt file using the InputParser
 * @author Alon Cohen
 */


public class main {
    
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
        
        //Initializing array to hold all of the lists to be created
        HeapLinkedList[] arrOfLists = new HeapLinkedList[100];
        String currLine;
       
        //this object will handle all of the input lines
        InputParser parser = new InputParser();
                    
        while(scanner.hasNext()){
            parser.parse(scanner.nextLine(),status,arrOfLists);
        

        }
           

    

 

}       


        
}





