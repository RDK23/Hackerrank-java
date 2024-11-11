import java.util.*;
class Solution{
	
	public static void main(String []argh)
{
    Scanner sc = new Scanner(System.in);
    Solution sc2 = new Solution();
    HashMap<Character,Character> hm = new HashMap<>();
    hm.put('{','}');
    hm.put('[',']');
    hm.put('(',')');

    while (sc.hasNext()) {
        String input=sc.next();
        Stack<Character> tc = new Stack<>();
        System.out.println(sc2.isBalanced(tc,input,hm)); 
    }

}

public boolean isBalanced(Stack<Character> tc, String input, HashMap<Character,Character> hm){

    if ( input.length() %2 == 0){
         for (char a : input.toCharArray()){

            if (a=='{' || a=='[' || a=='('){
                tc.push(a);
            }else{
                if (tc.isEmpty()){
                    return false;
                }
             if ((a=='}' || a==']' || a==')')){
                 if(a==hm.get(tc.peek())){
                     tc.pop();
                 }  
             } 
             }
        }
    } 
    else return false;
    return tc.isEmpty();
}
}



