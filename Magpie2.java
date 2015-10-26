/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *       Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
 /**
  * Get a default greeting  
  * @return a greeting
  */
 public String getGreeting()
 {
  return "Hello, let's talk.";
 }
 
 /**
  * Gives a response to a user statement
  * 
  * @param statement
  *            the user statement
  * @return a response based on the rules given
  */
 public String getResponse(String statement)
 {
  String response = "";
  if (statement.length() == 0) {
    response = "You didn't type anything :(";
  }
  else if (statement.indexOf("no") >= 0)
  {
   response = "Why so negative?";
  }
  else if (statement.indexOf("mother") >= 0
    || statement.indexOf("father") >= 0
    || statement.indexOf("sister") >= 0
    || statement.indexOf("brother") >= 0)
  {
   response = "Tell me more about your family.";
  }
  else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) {
    response = "Tell me more about your pets.";
  }
  else if (statement.indexOf("dr. cohen") >=0) {
    response = "Dr. Cohen loves puppies.";
  }
  else if (statement.indexOf("computer science") >= 0) {
    response = "Computer science is so interesting. Tell me more about it!!!!!!";
  }
  else if (statement.indexOf("science") >= 0) {
    response = "Science is rad. What specific aspect about science are you interested in?";
  }
  else if (statement.indexOf("sports") >= 0) {
    response = "What do you like about sports?";
  }
  else
  {
   response = getRandomResponse();
  }
  return response;
 }

 /**
  * Pick a default response to use if nothing else fits.
  * @return a non-committal string
  */
 private String getRandomResponse()
 {
  final int NUMBER_OF_RESPONSES = 6;
  double r = Math.random();
  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  String response = "";
  
  if (whichResponse == 0)
  {
   response = "Interesting, tell me more.";
  }
  else if (whichResponse == 1)
  {
   response = "Hmmm.";
  }
  else if (whichResponse == 2)
  {
   response = "Do you really think so?";
  }
  else if (whichResponse == 3)
  {
   response = "You don't say.";
  }
  else if(whichResponse == 4) {
   response = "No way! That's intriguing.";
  }
  else if (whichResponse == 5) {
    response = "Why do you say that?";
  }

  return response;
 }
}