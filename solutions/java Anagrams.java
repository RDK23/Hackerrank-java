import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean isAnagram = false;
      for(int i =0;i<a.length() && a.length() ==b.length();i++){
         char CharCount = a.charAt(i);
          int ACount = 1;
          int BCount = 0;
          for(int j=0;j<a.length();j++){
              if(i != j && CharCount == a.charAt(j)){
                  ACount +=1;
              }
              if(CharCount == b.charAt(j)){
                  BCount +=1;
              }
          }isAnagram = (ACount == BCount)? true : false;
      }  return isAnagram;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}