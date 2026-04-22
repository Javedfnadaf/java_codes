import java.util.*;

public class Main {
    
    public static void  main(String[] args) {
        
        
        Stack<Integer>st = new Stack<>();
        st.push(100);
        st.push(20);
        st.push(22);
        st.push(88);
        
        // afet the stack this Like
        // 88
        // 22
        // 20
        // 100
        
        
          System.out.println(st.pop());//its remove the top of the element from tht stack ,print 88
        // System.out.println(st.peek());print the top item 88 
        
        // System.out.println(st.size()); its print size of the elsments 4
    }
}