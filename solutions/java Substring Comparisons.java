import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        for(int i=0;i<s.length()-k;i++){
            String st=s.substring(i+1,i+1+k);
            if(st.compareTo(largest)>0){
                largest = st;
            }
            if(st.compareTo(smallest)<0){
                smallest = st;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}