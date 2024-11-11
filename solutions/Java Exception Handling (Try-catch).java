import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
Scanner input = new Scanner(System.in);
        
        try{
            int x = input.nextInt();
            int y = input.nextInt();
            if(x>=0 && y>=0)
            System.out.println(x/y);
        }catch(InputMismatchException ee){
            System.out.println("java.util.InputMismatchException");
        }
            catch(Exception e){
            System.out.println(e.toString());
        }
       
        
    }
}    
