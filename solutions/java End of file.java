import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lnum=1;
        
        while(scan.hasNext()==true){
        String str = scan.nextLine();
        System.out.println(lnum+" "+str);
        lnum++;
        }
        
    }
}
