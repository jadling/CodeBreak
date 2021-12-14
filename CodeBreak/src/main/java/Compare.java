

import java.util.Arrays;

public class Compare
{

   //checkPosition counts the number of values that are in the correct position in the guess
   public int checkPosition(int[] user, int[] code)
   {  
      int count = 0;
      for (int i = 0; i < user.length; i++)
      {
         if (user[i] == code[i])
         {
            count++;
         }
      }
      return count;
   }

   
   //checkValue counts the number of values that match between the guess and the code, position agnostic
   public int checkValue(int[] user, int[] code)
   {
      int[] countUser = makeUnique(user);
      int[] countCode = makeUnique(code);
      int count = 0;
      for (int i = 0; i < countUser.length; i++)
      {
         for (int j = 0; j < countCode.length; j++)
         {
            if (countUser[i] == countCode[j])
            {
               count++;
            }
         }
      }
      
      return count;
   }
   
   //The below method scans for duplicates and adds a unique identified to duplicates
   public int[] makeUnique(int[] unique)
   {
      
      int temp[] = new int[unique.length];
      
      for (int i = 0; i < unique.length; i++)
      {
         temp[i] = unique[i];
      }

      Arrays.sort(temp);
      
      for (int i = 0; i < temp.length; i++)
      {
         for (int j = i + 1; j < temp.length; j++)
         {
            if (temp[j] == temp[i])
            {
               temp[j] = (temp[j] + 1) * 10;
            }

            for (int k = j + 1; k < temp.length; k++)
            {
               if (temp[k] == temp[i])
               {
                  temp[k] = (temp[k] + 1) * 100;
               }
               for (int l = k + 1; l < temp.length; l++)
               {
                  if (temp[l] == temp[i])
                  {
                     temp[l] = (temp[l] + 1) * 1000;
                  }
               }
            }

         }
      }
      return temp;
   }

}