/**
 * Auto Generated Java Language Level Class.
 */
import java.util.Random;
public class RansomNoteCreator {
  
  private World w;
  private Turtle t;
  
  /*
   * Constructor.  Should build the world and Turtle. 
   * The turtle should begin at (50, 50) facing right.
   */
  public RansomNoteCreator( int width, int height ) {
    //sets media path
    FileChooser.setMediaPath("media/"); 
    //creates new world
    w = new World(width, height);
    t= new Turtle(w);
    //no turtle lines
    t.penUp();
    //sets turtle initial position
    t.moveTo(50, 50);
    //makes turtle start dropping images horizontally
    t.turn(90);
  }
  
  public void createNote( String text ) {
    //makes all texts uppercase so that it can be queried easily
    text=text.toUpperCase();
    //for loop to iterate through each char and drop image accordingly
    for( int i=0; i< text.length(); i++) {
      //for x coord for setting turtle to new location after line breaks
      int x=50;
      //counter for line breaks
      int counter = i+1;
      
      
      //creates char "ch" which will be appleid as an argument in the drawletter method
      char ch=text.charAt(i);
      drawLetter(ch);
      
      //if statement to change turtle position
      if (counter%5==0){
        t.moveTo(0,x*(counter/5+1));
      }
      }
    }
  
  public void drawLetter(char ch) {
    // get random double number
    double x = -60 + (int)(Math.random() * ((60+60) + 1));
   
    
    //if statement to check if letter is typed
    if (ch>='A' && ch <= 'Z'){
      //retrieves corresponding image and appends ".jpg" and sets it equal to a
      Picture a = new Picture(ch + ".jpg");
      //scales image
      a=a.scale(.4,.4);
      
      //turns to set it in the right position exept for turn(x) which is randomize to make it funky.
      t.turn(-90);
      t.turn(x);
      t.drop(a);
      t.turn(-x);
      t.turn(90);
      
      //so that it is consistent with spacing
      t.forward(a.getWidth());
      
      //space between each letter in a word
      t.forward(50);
    } else if (ch == ' ') {
      //moves forward 100 additional pixels for space
      t.forward(100);
    } else {
      //error response system; replaces it with space
      System.out.println("Oh No! You did not press a letter! Its has been replaced by a space.");
      t.forward(50);
    }
  }
  
 
  
}
