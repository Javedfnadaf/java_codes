
import java.util.*;


public class Main {
    public static void main(String[]  args){
        
        
        HashMap<Character,Integer>map  = new HashMap<>();
        
        
        String name = "javednadaf";
        
        for(int i = 0; i < name.length(); i++){
            
            
            char ch  = name.charAt(i);
            
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }
            else {
                map.put(ch,1);
            }
        }
        
        for(Character key : map.keySet()){
            if(map.get(key) > 1){
                System.out.println(key+"="+map.get(key));
            }
        }
        
    }
}