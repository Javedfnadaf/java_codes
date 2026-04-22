import java.util.*;

public class Main {
    public static void main(String[] args){
        
        HashMap<Integer,String>map = new HashMap<>();
        
        
        map.put(1,"javed");
        map.put(2,"kalmesh");
        map.put(3,"harish");
        // map.remove(3);
        
        System.out.println(map.containsKey(1));
        System.out.println(map.values());
        System.out.println(map.get(2));
    }
}