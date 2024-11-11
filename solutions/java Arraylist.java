import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.nextLine();
        ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>(n);
        for (int i = 0; i < n; i++) {
            s = scan.nextLine();
            a.add(i, new ArrayList<String>(Arrays.asList(s.split("\\s"))));
        }

        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x <= a.size() && y < a.get(x-1).size() && y >= 0) {
                System.out.println(a.get(x-1).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
