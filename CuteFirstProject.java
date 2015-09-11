/**
 * Copyrighted Kristof Torok & Ethan Chiu 
 * 2015
 */
import java.awt.Color;
public class CuteFirstProject {
  
  /* ADD YOUR CODE HERE */
  public static void main(String[] args)
  {
    //Set media path
    FileChooser.setMediaPath("mediasources/");
    
    //New world
    World world = new World(800,800);
    
    //Sets Dimensions
    Picture back = new Picture(800,800);
    
    //Assigns picture to f variable
    Picture f = 
      new Picture(FileChooser.getMediaPath("background.jpg"));
    
    //Sets background picture
    world.setPicture(f);
    
    //Creates new Turtle 
    Turtle turtle = new Turtle(200,250,world);
    
    //Sets Turtle's color
    turtle.setColor(new Color(255, 0, 255));
    
    //Create Turtle 2
    Turtle turtledog = new Turtle(world);
    
    //Assigns dog picture to variable d
    Picture d = 
      new Picture(FileChooser.getMediaPath("doggie.jpg"));
    
    //Scale images 
    d = d.scale(.3,.3);
    
    //Drop the picture to location
    //turtledog.penUp();
    turtledog.backward(100);
    turtledog.drop(d);
    
    //Creates Turtle 3
    Turtle turtledog2 = new Turtle(world);
    
    //Assigns dog picture to variable d
    Picture k = 
      new Picture(FileChooser.getMediaPath("doggie2.jpg"));
    
    //Scale
    k = k.scale(.8,.8);
    
    //Drop the picture to location
    turtledog2.backward(100);
    turtledog2.turn(90);
    turtledog2.backward(100);
    turtledog2.drop(k);
    
    //Creates Turtle 4
    Turtle turtledog3 = new Turtle(world);
    
    //Assigns dog picture to variable d
    Picture o = 
      new Picture(FileChooser.getMediaPath("batmanunicorn.jpg"));
    
    //Scale
    o = o.scale(.8,.8);
    
    //Drop the picture to location
    turtledog3.turn(90);
    turtledog3.forward(350);
    turtledog3.turn(90);
    turtledog3.backward(200);
    turtledog3.drop(o);
    
    
    //Line color width
    turtle.setPenWidth(2);
    
    //Assigns p to chisum.pjg
    Picture p = 
      new Picture(FileChooser.getMediaPath("chisum.jpg"));
    
    //Scale image to . 5 of original
    p=p.scale(.5,.5);
    
    //Get image
    Picture bearbunny = 
      new Picture(FileChooser.getMediaPath("bearbunny.jpg"));
    bearbunny = bearbunny.scale(.8,.8);
    //Make and Drop Bunny and Bear
    Turtle indigo = new Turtle(500,350,world);
    indigo.forward(100);
    indigo.drop(bearbunny);
    
    
    //For loop to make multiple images in various directions
    for (int i = 0; i < 360; i=i+45)
    {
      turtle.forward(200);
      turtle.drop(p);
      turtle.backward(200);
      turtle.turn(45);
    }
  }
}
