import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<N;i++){
        list.add(sc.nextInt());
    }
    int Q = sc.nextInt();
    for(int i=0;i<Q;i++){
        String s = sc.next();
        if(s.equalsIgnoreCase("Insert")){
            int index = sc.nextInt();
            int value = sc.nextInt();
            list.add(index,value);
        }else if(s.equalsIgnoreCase("Delete")){
            int indexToDelete= sc.nextInt();
            list.remove(indexToDelete);
        }
    }
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + " ");
    }
}
}
