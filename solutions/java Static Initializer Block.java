import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static boolean flag = true;
static int B,H;
static{
    Scanner input = new Scanner(System.in);
    B = input.nextInt();
    H = input.nextInt();
    flag = B > 0 && H > 0;
    if(!flag){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        System.exit(0);
    }
    input.close();
}


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

