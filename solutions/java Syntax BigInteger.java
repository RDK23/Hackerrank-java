import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
   Scanner scan= new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        BigInteger sum, mul;
        sum = a.add(b);
        mul = a.multiply(b);
        System.out.println(sum + "\n" + mul);
}
}