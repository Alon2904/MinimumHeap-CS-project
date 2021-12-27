import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {
    public static void main(String[] args) throws FileNotFoundException{
        // a/b/c defines the linked-list status
        enum Mode {
            A, 
            B,
            C
            }



        // importing the txt file
        File input = new File("input.txt");
        Scanner scanner = new Scanner(input);

        //prints option for user
        System.out.println("Please Choose one of the following options by sending the capital letter to its left:");
        System.out.println("A - Sorted lists");
        System.out.println("B - Unsorted Lists");
        System.out.println("C - Unsorted and foreign lists");

        //recieving the heap type wer'e working with
        String status = scanner.nextLine();
        Mode mode = Mode.valueOf(status);


        //initialize array of linked lists from the class we want to work with -TODO

        
        if(mode.equals(Mode.A)){
            System.out.println("a");
            // TODO - create array of sortedLists objects
            // call it "listsArr"
        } else if(mode.equals(Mode.B)){
            System.out.println("b");
             // TODO - create array of UnsortedLists objects
                // call it "listsArr"
 
        } else if(mode.equals(Mode.C)){
            System.out.println("c");

            // TODO - create array of foreignUnsortedLists objeccts
            // call it "listsArr"
        }

                    String currLine;


        while(scanner.hasNext()){
           currLine = scanner.nextLine();
           object.handleLine(currLine); // will get the line and will handle with it include printing


        }
        // while(scanner.hasNext()){
        //     currLine = scanner.nextLine();
        //     heap.analyze(currLine);
        // }
          
        }

}