/*
 In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

Wikipedia if-else flow chart

Source: Wikipedia

Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints:
1=<n=<100

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
Explanation

Sample Case 0: n=3
n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n=24
n>20 and n is even, so it isn't weird. Thus, we print Not Weird.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    int EvenOdd(int a){
        if(a%2==0 && a>=2 && a<5  || a%2==0 && a>20){
            
            System.out.println("Not Weird");
        }
        
        else {
            System.out.println("Weird");
        }
        return 0;
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Solution method = new Solution();
        method.EvenOdd(N);

        scanner.close();
    }
}
