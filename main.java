import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthLabelUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.*;


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
           sortedLists[ ] listsArr = new sortedLists[100]; // creating array of sorted lists
        } else if(mode.equals(Mode.B)){
            System.out.println("b");
             unsortedLists[ ] listsArr = new unsortedLists[100];
 
        } else if(mode.equals(Mode.C)){
            System.out.println("c");
            foreignUnsortedLists[ ] listsArr = new foreignUnsortedLists[100]  ;

            System.out.println(listsArr);
            listsArr[0] = new foreignUnsortedLists();
            System.out.println(listsArr[0]);

            // TODO - create array of foreignUnsortedLists objeccts
            // call it "listsArr"
        }

                    String currLine;
                    int index = 0; //index of current linkedlist


        while(scanner.hasNext()){
           currLine = scanner.nextLine();

           if(currLine.equals("MakeHeap")){
           LinkedList x = new LinkedList();
           
           System.out.println("sucsses");
           }


        }
        // while(scanner.hasNext()){
        //     currLine = scanner.nextLine();
        //     heap.analyze(currLine);
        // }
          
        }

}