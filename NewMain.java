
package onearray;

import java.util.Arrays;
import java.util.Scanner;

public class NewMain
{

    public static void main(String[] args) 
    {
     
       OneArray oneArray = new OneArray();
       
        System.out.println( oneArray );  // here reference of object of OneArray is take place.
         
        int[] aa = oneArray.getMarks();
        
        System.out.println("marks = "+Arrays.toString(aa));
    }
    
}
