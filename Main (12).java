import java.util.*;
public class Main{
    public static void main(String[] args){
        
        
        int[] num = {1,8,3,4,9,5};
        int firstGreatest  = num[0];
        
        for(int i = 1; i < num.length; i++){
            if(num[i] > firstGreatest){
                firstGreatest  = num[i];
            }
        }
    
    System.out.println(firstGreatest);
    
                
                
            
           
        

    }
}