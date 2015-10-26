/**
 * Auto Generated Java Language Level Class.
 */
import java.util.Scanner;
class NewProgram1 {
  
  /* ADD YOUR CODE HERE */
  public static void main(String[] args) {
    Scanner ask = new Scanner(System.in);
    String answer;
    String answer2;
    String answer3;

    System.out.println("Enter a word");
    answer = ask.nextLine();
    answer2 = answer.toUpperCase();
    answer3 = answer.toLowerCase();
   
    
    for (int i = 0; i < answer.length(); i++){
      char letterat;
      char letterat2;
      letterat = answer3.charAt(i);
      letterat2 = answer2.charAt(i);
      System.out.print(letterat);
      System.out.print(letterat2);
      
      
      
    }
    
    
  }
  
  
}
