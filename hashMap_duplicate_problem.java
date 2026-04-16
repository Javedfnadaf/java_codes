
import java.util.*;


public class Main {
    public static void main(String[]  args){
        
        
        HashMap<Integer,Integer>map  = new HashMap<>();
        
        int[] num = {1,2,3,4,5,2,3};
        
        for(int i = 0; i <num.length; i++){
            
            Integer n = num[i];
            
            if(map.containsKey(n)){
                map.put(n,map.get(n) + 1);
            }
            else {
                map.put(n,1);
            }
            
        }
           for (Integer key : map.keySet()) {
               if(map.get(key) > 1){
                     System.out.println(map.get(key)+"="+key);
               }
        
           }
        
        
    }
}