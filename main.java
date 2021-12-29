import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.plaf.synth.SynthLabelUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.Scanner;


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
        
        HeapLinkedList[] arrOfLists = new HeapLinkedList[100];
       
       

                    String currLine;
                    int index = -1; //index of current linkedlist
                    
                    
        while(scanner.hasNext()){
           currLine = scanner.nextLine();

           // TODO - add a function to make it look nicer
           if(currLine.equals("MakeHeap")){
            index++;
            HeapLinkedList list;
            switch(status) {
                case "A":
                list = new sortedLists();
                System.out.println("A");
                

                case "B":
                list = new unsortedLists();
                System.out.println("B");
                

                case "C":
                list = new foreignUnsortedLists();
                System.out.println("C");
                

            

            
            arrOfLists[index] = list;
           System.out.println("input - MakeHeap");
           System.out.println(arrOfLists[index]);
        }
    }

    while(scanner.hasNext()){
        currLine = scanner.nextLine();
        // TODO - create a function that will take care of merge, insert,min,extraxtMin
    }

}


           



           


        
       
          
}
public void analyze(Heap list,String str){


}
}





