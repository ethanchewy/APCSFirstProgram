/**
 * Auto Generated Java Language Level Class.
 */
import java.awt.Color;
public class CuteFirstProject {
  
  /* ADD YOUR CODE HERE */
  public static void main(String[] args)
  {
    //Chooses folder for image
    FileChooser.setMediaPath("mediasources/");
    
    //Creates new world and sets width and height to 800 pixels
    World world = new World(800,800);
    //Picture back = new Picture(600,800);
    //back.setAllPixelsToAColor(Color.GREEN);
    //world.setPicture(back);
    
    //Creates new turtle and puts it in world
    Turtle turtle = new Turtle(world);
    
    //Sets Turtle color to green
    turtle.setColor(new Color(255, 0, 255));
    
    //Set line width
    turtle.setPenWidth(2);
    
    //Create Chisum
    Picture p = 
      new Picture(FileChooser.getMediaPath("chisum.jpg"));
    p=p.scale(.5,.5);
    
    //Create Background
    Picture r = 
      new Picture(FileChooser.getMediaPath("background.jpg"));    
    world.setPicture(r);
    
    for (int i = 0; i < 10; i++) {
      //System.out.println("Hello World");
      turtle.forward(90);
      turtle.turn(45);
      turtle.backward(90);
      turtle.turn(45);
    }
      
    
    
    //turtle.penUp();
    /*for (int i = 0; i < 360; i=i+45)
    {
      turtle.forward(200);
      turtle.drop(p);
      turtle.backward(200);
      turtle.turn(45);
    } */
  }
}
