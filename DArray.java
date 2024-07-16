
package pkg1.d.array;

import java.util.Arrays;
import java.util.Scanner;

public class DArray 
{

    public static void main(String[] args)
    {
       System.out.println("------------ Static 1 D Array -------------");
      int[] khan = {1,2,3,4,5,6,7,8,9,10};
     for( int a = 0; a < khan.length; a++ )
      {
         //System.out.print(khan[a]+" ");
          System.out.println("khan["+a+"] = "+khan[a]);
      }
       // System.out.println(Arrays.toString(khan));
        
      System.out.println("++++++++++++ Dynamic 1 D Array ++++++++++++++++++");
      int[] number = new int[10];
      int b = 0;
      while( b < number.length )
      {
         Scanner value = new Scanner(System.in); 
          System.out.print("Enter value into number["+b+"] = ");
          number[b] = value.nextInt();
          b++;
      }
      int c = 0;
      do
      {
          System.out.println("number["+c+"] = "+number[c]); 
          c++;
      }
      while( c < number.length ); 
        System.out.println(Arrays.toString(number));
    }
    
}
