import java.util.*;

public class Main {
    public static void main(String[] args){
        
        HashSet<String>map = new HashSet<>();
        
        
        map.add("javed");
        map.add("kalmesh");
        map.add("harish");
        map.add("harish");
        
        
         System.out.println(map.contains("Om"));
        System.out.println(map);
        System.out.println(map.size());
        
       
    }
}