
// Java program to illustrate the concept 
// of Autoboxing and Unboxing 
import java.io.*; 
  
public class GFG 
{ 
    public static void main (String[] args) 
    { 
        // creating an Integer Object 
        // with value 10. 
        Integer i = new Integer(10); 
  
        // unboxing the Object 
        int i1 = i; 
  
        System.out.println("Value of i: " + i); 
        System.out.println("Value of i1: " + i1); 
  
        //Autoboxing of char 
        Character gfg = 'a'; 
  
        // Auto-unboxing of Character 
        char ch = gfg; 
        System.out.println("Value of ch: " + ch); 
        System.out.println("Value of gfg: " + gfg); 
  
    } 
} 



/* Java program to illustrate autoboxing */
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
    public static void main (String[] args) 
    { 
        /* Here we are creating a list 
          of elements of Integer type. 
          adding the int primitives type values */
        List<Integer> list = new ArrayList<Integer>(); 
        for (int i = 0; i < 10; i++) 
            list.add(i); 
    } 
} 
