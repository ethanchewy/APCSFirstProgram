/**
 * Auto Generated Java Language Level Class.
 */
import java.util.*;
class RansomNoteTester {
  
  public static void main(String[] args) { 
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the text you want to convert: ");
    String text = input.nextLine();
    
    RansomNoteCreator note = new RansomNoteCreator(1000,400);
    note.createNote(text);
    
  }
  
}
