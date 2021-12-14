

import java.util.Arrays;

public class Message extends CodeBreaker
{
   public void startGameMessage()
   {
      System.out.println("Welcome to CodeBreaker.  It's a text-based game based on Master Mind.");
      System.out.println("You will have 10 turns to guess a four digit numeric code.");
      System.out.println("At the end of each guess, you will be given feedback on how many digits are correct");
      System.out.println("and how many digits are contained in the code but incorrectly positioned.");
      System.out.println();
   }
   
   public void positionMessage(int count)
   {
      if (count == 0)
      {
         System.out.println("There were no digits in the correct position and");
      }
      else if (count == 1)
      {
         System.out.println("One digit was in the correct position and");
      }
      else
      {
         System.out.println(count + " digits were in the correct position");
      }
   }

   public void valueMessage(int count)
   {
      if (count == 0)
      {
         System.out.println("None of those digits were contained in the code");
      }
      else if (count == 1)
      {
         System.out.println("One digit was contained in the code");
      }
      else
      {
         System.out.println(count + " digits were contained in the code");
      }
   }

   
   public void turnsRemaining(int turns)
   {
      System.out.println("You have " + turns + " attempts remaining");
      System.out.println();
   }
   
   public void failed(int[] code)
   {
      System.out.println("GAME OVER!  The correct code was " + Arrays.toString(code));
   }
   
 
   
   public void scrollSixtyLines()
   {
      for (int i = 0; i < 60; i++) System.out.println();

   }
   
   public void byeBye()
   {
      System.out.println("Thanks for playing.  Bye!");
   }

   public void win(int[] masterCode)
   {
      System.out.println("You win!!!  The correct code was " + Arrays.toString(masterCode));
      
   }

   public void attempt(int id, int[] code, int value, int position)
   {
      System.out.println("Guess " + (id+1) + 
                         ": " + Arrays.toString(code) + 
                         " ---- " + value + 
                         " digits contained in the code ---- " + position + 
                         " digits in the correct position");   }
   
}