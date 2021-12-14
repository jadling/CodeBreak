

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTesting
{

   @Test
   public void testPosition()
   {

      //This checks to see if the position comparator works for two arrays
      Compare  testCheckPosition = new Compare();
      
      int[] testCode = {0, 1, 2, 3};

      int[] testUser1 = {0, 1, 2, 3};
      int testCount1 = testCheckPosition.checkPosition(testUser1, testCode);
      assertEquals(4, testCount1);
      
      int[] testUser2 = {0, 0, 0, 0};
      int testCount2 = testCheckPosition.checkPosition(testUser2, testCode);
      assertEquals(1, testCount2);
      
      int[] testUser3 = {0, 1};
      int testCount3 = testCheckPosition.checkPosition(testUser3, testCode);
      assertEquals(2, testCount3);
      
      int[] testUser4 = {1, 2, 3, 4};
      int testCount4 = testCheckPosition.checkPosition(testUser4, testCode);
      assertEquals(0, testCount4);

   }
   
   @Test
   //This checks to see if the comparator works for checking if two arrays contain the same values, regardless of position
   public void testValue()
   {
      Compare testCheckValue = new Compare();
      
      int[] testCode = {1, 2, 3, 4};
      
      int[] testUser1 = {1, 2, 3, 4};
      int testCount1 = testCheckValue.checkValue(testUser1, testCode);
      assertEquals(4, testCount1);
      
      int[] testUser2 = {4, 3, 2, 1};
      int testCount2 = testCheckValue.checkValue(testUser2, testCode);
      assertEquals(4, testCount2);
      
      int[] testUser3 = {1, 1, 2, 2};
      int testCount3 = testCheckValue.checkValue(testUser3, testCode);
      assertEquals(2, testCount3);
      
      int[] testUser4 = {0, 2, 4, 3};
      int testCount4 = testCheckValue.checkValue(testUser4, testCode);
      assertEquals(3, testCount4);
      
      int[] testUser5 = {1, 2, 3};
      int testCount5 = testCheckValue.checkValue(testUser5, testCode);
      assertEquals(3, testCount5);
   }
}
   