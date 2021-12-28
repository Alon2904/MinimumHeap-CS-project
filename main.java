import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.plaf.synth.SynthLabelUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.*;


public class main {
    public static void main(String[] args) throws Exception{
        // a/b/c defines the linked-list status
        



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
        

        LinkedList[] arrOfLists;

        switch (status.toLowerCase()) {
            case "a":
            System.out.println("a");
            arrOfLists = new sortedLists[100];
                break;

            case "b":
            System.out.println("b");
            arrOfLists = new unsortedLists[100];
                break;

            case "c":
            System.out.println("c");
            arrOfLists = new foreignUnsortedLists[100];
                break;

            default:
                throw new Exception("Invalid input detected");
        }

                    String currLine;
                    int index = 0; //index of current linkedlist
                    

        while(scanner.hasNext()){
           currLine = scanner.nextLine();
                "Insert 9"
           if(currLine.equals("MakeHeap")){
           arrOfLists[0] = new foreignUnsortedLists();
           
           System.out.println("sucsses");
           }


        }
        // while(scanner.hasNext()){
        //     currLine = scanner.nextLine();
        //     heap.analyze(currLine);
        // }
          
        }

}