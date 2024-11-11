import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String s=input.next();
        
    input.close();
    try{
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] messageDigest = md.digest(s.getBytes());
        BigInteger num = new BigInteger(1, messageDigest);
        String hashNext =num.toString(16);
        while(hashNext.length() < 32){
            hashNext = "O" +hashNext;
            
        } 
    System.out.println(hashNext);
    }
     catch (Exception e) {
            throw new Exception(e);   
    }
    }
    }
