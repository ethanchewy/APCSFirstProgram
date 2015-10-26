public class SongofLove {
    public void printSong() {
      intro();
      /* Testing, (didn't have enough time to complete)
      for (int i = 1; i < 9; i++){
        if (i = 1) {
          intro();
        } else if (counter > 1 && counter < 8) {
          love();
        } else if (counter = 2) {
          
        }
        counter++;
        
        switch (i) {
          case 1: {
            intro();
          }
          case 2: {
            intro();
          }
          case 3: {
            intro();
          }
          case 4: {
            intro();
          }
          case 5: {
            intro();
          }
          case 6: {
            intro();
          }
          case 7: {
            intro();
          }
          case 8: {
            intro();
          }
        }
        
        
      } */
        
      //Runs methods (intro, verses, and conclusion)
      verse1();
      verse2();
      verse3();
      verse4();
      verse5();
      verse6();
      verse7();
      conclusion();
      
    }
    
    //intro method
    public void intro() {
      System.out.println("I like you, Fred, I like you!");
      System.out.println("You're just saying those words to be kind.");
      System.out.println("No, I mean it.  I like... I mean I love you, Fred!");
      System.out.println("He is out of his medieval mind!");
      System.out.println("I'm perfectly sane and sound!  I never felt better in my life!");
      System.out.println("Everybody... everybody, everybody!  Come on!  And meet my incipient wife!");
      System.out.println();
    }
    
   
    //verse 1
    public void verse1() {
      //calls love method and prints unique lines with println and ends with a println to seperate verses from each other
      love();
      System.out.println("My reasons must be clear.");
      System.out.println("When she shows you all how strong she is you'll stand right up and cheer!");
      with();
      System.out.println();
      
    }
    
    //verse 2
    public void verse2() {
      //calls love method and prints unique lines with println and ends with a println to seperate verses from each other
      love();
      System.out.println("She drinks just like a lord!");
      System.out.println("So sing a merry drinking song and let the wine be poured!");
      joy();
      with();
      System.out.println();
    }
    
    //verse 3
    public void verse3() {
      //calls love method and prints unique lines with println and ends with a println to seperate verses from each other
      love();
      System.out.println("She sings just like a bird!");
      System.out.println("You'll be left completely speechless when her gentle voice is heard!");
      sing();
      joy();
      with();
      System.out.println();
    }
    
    //verse 4
    public void verse4() {
      //calls love method and prints unique lines with println and ends with a println to seperate verses from each other
      love();
      System.out.println("She wrestles like a Greek!");
      System.out.println("You will clap your hands in wonder at her fabulous technique!");
      clap();
      sing();
      joy();
      with();
      System.out.println();
    }
    
    //verse 5
    public void verse5() {
      //calls love method and prints unique lines with println and ends with a println to seperate verses from each other
      love();
      System.out.println("She dances with such grace!");
      System.out.println("You are bound to sing her praises 'til you're purple in the face!");
      bravo();
      clap();
      sing();
      joy();
      with();
      System.out.println();
    }
    
    //verse 6
    public void verse6() {
      //calls love method and prints unique lines with println and ends with a println to seperate verses from each other
      love();
      System.out.println("She's musical to boot!");
      System.out.println("She will set your feet a-tapping when she plays upon her lute!");
      strum();
      bravo();
      clap();
      sing();
      joy();
      with();
      System.out.println();
    }
    
    //verse 7
    public void verse7() {
      //calls love method and prints unique lines with println and ends with a println to seperate verses from each other
      love();
      System.out.println("A clever, clownish wit!");
      System.out.println("When she does her funny pantomime your sides are sure to split!");
      System.out.println("Ha ha ha ha, ho ho ho ho, ha ha ha ha ho!");
      strum();
      bravo();
      clap();
      sing();
      joy();
      with();
      System.out.println();
    }
    
    //different methods to be called in the above verses methods.
    public void conclusion() {
      System.out.println("I'm in love with a girl.");
      System.out.println("He's in love with a girl named \"F-R-E-D\"  Fred!");
      
    }
    
    
    
    public void with() {
      System.out.println("With a \"F\" and a \"R\" and an \"E\" and a \"D\"");
      System.out.println("And a \"F-R-E-D\" Fred!  Yeah!");
    }
    
     public void love() {
      System.out.println("I'm in love with a girl named Fred.");
    }
    
    public void joy() {
      System.out.println("Fill the bowl to overflowing.  Raise the goblet high!");
    }
    public void sing(){
      System.out.println("La la la la, la la la la, la la la la la!");
    }
    public void clap() {
      System.out.println("Clap clap, clap clap, clap clap clap clap, clap, clap clap!");
      
    }
    
    
    public void bravo() {
      System.out.println("Bravo!  Bravo!  Bravissimo bravo!  Bravissimo!");
    }
    
    public void strum() {
      System.out.println("Strum strum, strum strum, strum strum strum strum strum, strum.");
    }

    
    
    
 }

