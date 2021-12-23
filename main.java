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

            String currLine;


        // importing the txt file
        File input = new File("input.txt");
        Scanner scanner = new Scanner(input);

        //prints option for user
        System.out.println("Please Choose one of the following options by sending the capital letter to its left:");
        System.out.println("A - Sorted lists");
        System.out.println("B - Unsorted Lists");
        System.out.println("C - Unsorted and foreign lists");

        String status = scanner.nextLine();
        Mode mode = Mode.valueOf(status);
        
        
        // while(scanner.hasNextLine()){
        //     currLine = scanner.nextLine();
        

        switch(mode) {
            case A:
            
           classA.operate(scanner);
  
          
              break;
            case B:

           classB.operate(scanner);  
           
          
              break;
            case C:
            
            classC.operate(scanner);
            
        
              break;
          }
               

        
        

    }
}