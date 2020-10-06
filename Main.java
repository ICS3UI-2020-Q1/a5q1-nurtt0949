import java.util.Scanner;
/**
 *multiplication table until 12
 * @author Tolga
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner
     Scanner input = new Scanner(System.in);
    //ask user for integer to create multiplication table
     System.out.println("Please enter an integer to create a multiplication table for:");
    //declare a variable for users integer
     int integer = input.nextInt();
    //for loop for multiplication table
     for(int count = 1; count <= 12; count++){
     //declare a variable for total number
     int total = count * integer;
     //loop action: print the number 
     System.out.println(integer + " x " + count + " = " + total);
     }
    
    
  }
}

