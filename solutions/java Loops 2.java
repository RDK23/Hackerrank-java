import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int cu=a;
        for(int j=0;j<n;j++){
            int c=(int)Math.pow(2,j);
            cu+=b*c;
            System.out.print(cu+" ");
        }
        System.out.println();
        }
        in.close();
    }
}
