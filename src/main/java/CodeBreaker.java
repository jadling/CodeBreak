


//This game is called code breaker v2.  It was created by Jeffrey Adling at IHMC in December 2021

import java.io.IOException;




public class CodeBreaker
{

   static final int numberOfTries = 10;

   public static void main(String[] args) throws IOException 
   {

      Code master = new Code();
      
      Code[] user = new Code[numberOfTries];

      Compare compare = new Compare();
      Message message = new Message();
      
      
      master.setPlayAgain(1);
      
      while(master.getPlayAgain() == 1)
      {
         message.scrollSixtyLines();
         message.startGameMessage();
         master.makeCode();
         
         for (int i = 0; i < numberOfTries; i++)
         {
            
            user[i] = new Code();        
            user[i].userInput();
            
            user[i].setId(i);

            int[] masterCode = master.getCode();
            int[] userCode = user[i].getCode();

            int position = compare.checkPosition(userCode, masterCode);
            user[i].setPosition(position);
            
            int value = compare.checkValue(userCode, masterCode);
            user[i].setValue(value);
            
            if (position == 4)
            {
               message.win(masterCode);
               break;
            }
            else if (i == numberOfTries - 1)
            {
               message.failed(masterCode);
            }
            else
            {
               /*message.positionMessage(position);
               message.valueMessage(value);
              */
               for (int j = 0; j <= i; j++)
               {
                  message.attempt(user[j].getId(), user[j].getCode(), user[j].getValue(), user[j].getPosition());
               }
               message.turnsRemaining(numberOfTries - 1 - i);
            }
         }
         master.repeatInput();

         if(master.getPlayAgain() == 0)
         {
            break;
         }
      }

      message.byeBye();
   }
}