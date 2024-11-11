import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        Locale  INDIA = new Locale("en","IN");
        NumberFormat indiaformat = NumberFormat.getCurrencyInstance(INDIA);
        String india = indiaformat.format(payment);
        String InCurrency =indiaformat.getCurrency().getSymbol(INDIA);
        india = india.replace(InCurrency,"Rs.");
        
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        scanner.close();
        
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
} 
