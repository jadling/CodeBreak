

import java.io.IOException;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Code
{
   private int id;
   private int[] code = new int[4];
   private int position;
   private int value;
   private int playAgain;
   Scanner scanner = new Scanner(System.in);

   public int getId() {return id;}
   public void setId(int id) {this.id = id;}
   public int[] getCode() {return code;}
   public void setCode(int[] code) {this.code = code;}
   public int getPosition() {return position;}
   public void setPosition(int position) {this.position = position;}
   public int getValue() {return value;}
   public void setValue(int value) {this.value = value;}
   public int getPlayAgain() {return playAgain;}
   public void setPlayAgain(int playAgain) {this.playAgain = playAgain;}
  
   //this method is used to create the master code at the start of each game
   public void makeCode()
   {
      int[] make = new int[4];
      for (int i = 0; i < 4; i++)
      {
         make[i] = ((int) ((Math.round(Math.random() * 9))));
      }

      setCode(make);

   }

   //this method gets user input for each iteration within the game
   public void userInput()  throws IOException
   {
      String userCode = "";
            
      System.out.println("Enter a four digit numeric code.> ");
      
      while(userCode.length() != 4)
      {
         userCode = scanner.next();
      
         if(userCode.length() != 4)
         {
            System.out.println();
            System.out.println("That wasn't a four digit numeric code.  Try again.>");
         }
      
      }
      int[] input = new int[4];

      String[] splitGuess = userCode.split("");

      try
      {
         for (int i = 0; i < splitGuess.length; i++)
         {
            input[i] = Integer.parseInt(splitGuess[i]);
         }
      }
      catch (NumberFormatException exception) {System.out.println("Non-numeric inputs replaced with zero.  Make sure you're just entering numbers!\r");}
      catch (Exception exception) {System.out.println("Non-numeric inputs replaced with zero. Make sure you're just entering numbers!/r");}
      
      setCode(input);

   }

   //this method determines if the user would like to play again
   public void repeatInput() throws IOException
   {

      String input = new String();
      List<String> continueResponses = Arrays.asList("Y", "y", "Yes", "yes");
      List<String> endResponses = Arrays.asList("N", "n", "No", "no");
      int repeat = 0;

      while(repeat == 0)
      {
      System.out.println("Would you like to play again? <Y/N>");
      input = scanner.next();
      
      if (continueResponses.contains(input))
      {
         repeat = 1;
      }
      
      else if (endResponses.contains(input))
      {
         repeat = 2;
      }
      else
      {
         System.out.println();
         System.out.println("Invalid response.  Try again>");
      }
      }
      setPlayAgain(repeat);

   }
   
}