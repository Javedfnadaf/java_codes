/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Stack<String> p = new Stack<>();
        
        p.push("javed");
        p.push("kumar");
        p.push("munna");
    
        // System.out.println(p.pop());
        System.out.println(p.peek());
        System.out.println(p);
    }
}