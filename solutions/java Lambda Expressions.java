import java.util.Scanner;

interface PerformOperation { boolean check(int a); }

class MyMath { 
    public static PerformOperation isOdd() { 
        return (int a) -> a % 2 != 0; 
        }

// Method to check if the number is prime
public static PerformOperation isPrime() {
    return (int a) -> {
        if (a <= 1) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    };
}

// Method to check if the number is a palindrome
public static PerformOperation isPalindrome() {
    return (int a) -> {
        String str = Integer.toString(a);
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);
    };
}

// Method to execute the operation based on the condition
public static boolean checker(PerformOperation p, int num) {
    return p.check(num);
}
}

public class Solution { public static void main(String[] args) { 
    MyMath math = new MyMath(); 
    Scanner sc = new Scanner(System.in); 
    int T = sc.nextInt();

    while (T-- > 0) {
        int ch = sc.nextInt();
        int num = sc.nextInt();
        PerformOperation op;
        boolean result = false;

        switch (ch) {
            case 1:
                op = MyMath.isOdd();
                result = MyMath.checker(op, num);
                System.out.println(result ? "ODD" : "EVEN");
                break;
            case 2:
                op = MyMath.isPrime();
                result = MyMath.checker(op, num);
                System.out.println(result ? "PRIME" : "COMPOSITE");
                break;
            case 3:
                op = MyMath.isPalindrome();
                result = MyMath.checker(op, num);
                System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
                break;
        }
    }
    sc.close();
}
}
