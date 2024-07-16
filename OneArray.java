
package onearray;

public class OneArray 
{
    public int[] marks = new int[50];
    
    public OneArray()
    {
        for( int a = 0; a < marks.length; a++ )
        {
            marks[a] = a;
        }
    }
    public int[] getMarks()
    {  
          return marks;    
    }
    
}
