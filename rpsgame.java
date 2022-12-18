import java.util.Scanner;
import java.util.Random


public class rpsgame {
    public static void main(String[] args) {
        
      
        int userChoice, computerChoice, rock, paper, scissors;
        
        Scanner input = new Scanner (System.in);
        
   
        Random rnd = new Random();  
        
        rock = 0;
        paper = 1;
        scissors = 2;
        
        
        //display the game name
        System.out.println("ROCK - PAPER - SCISSORRS GAME");
        System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
        //User input
        userChoice = input.nextInt();
               
                while (userChoice > 2) {
              System.out.println("give number between 0 and 2");
              userChoice = input.nextInt();
          }
       
         if (userChoice == rock)
         {
           System.out.println("User chose ROCK");
         }
        else
        {
          if(userChoice== paper)
          {
            System.out.println("User chose PAPER");
          }
          else
          {
            System.out.println("User chose SCISSORS");
          }
              }
      
        computerChoice = rnd.nextInt(3);
        
      
        if(computerChoice == rock)
        {
          System.out.println("Computer chose ROCK");
        }
        else
        {
          if(computerChoice == paper)
          {
            System.out.println("Computer chose PAPER");
          }
          else
          {
            System.out.println("Computer chose SCISSORS");
          }
        }
        
        //result
        while (userChoice == computerChoice) {
              System.out.println("draw try again");
              
              
              userChoice = input.nextInt();
                            while (userChoice > 2) {
                              System.out.println("give number between 0 and 2");
                              userChoice = input.nextInt();
                              }
              computerChoice = rnd.nextInt(3);
                     
                          if (userChoice == rock)
                              {
                                  System.out.println("User chose ROCK");
                              }
                          else
                          {
                              if(userChoice== paper)
                              {
                                  System.out.println("User chose PAPER");
                              }
                              else
                              {
                                  System.out.println("User chose SCISSORS");
                              }
              }      
                       
                          if(computerChoice == rock)
                              {
                                  System.out.println("Computer chose ROCK");
                              }
                          else
                              {
                                  if(computerChoice == paper)
                                  {
                                      System.out.println("Computer chose PAPER");
                                  }
                                  else
                                  {
                                      System.out.println("Computer chose SCISSORS");
                                  }
                              }
                          } 
        
  //RESULTS
        if (computerChoice==rock)
          {
              if (userChoice==paper)
              {  
                  System.out.println("You wins!");
              }
              else 
              {
                  System.out.println("Computer Wins");
              }
          }
        else if (computerChoice==paper)
        {
          if (userChoice==rock)
              {
                  System.out.println("Computer wins");
              }
          else
              {
                  System.out.println("You Wins!");
              }
        }
        else if (userChoice==rock)
        {
          System.out.println("You Wins");
        }
        else
        {
            System.out.println("Computer Wins");
        } //END RESULTS
      }//END main
}
