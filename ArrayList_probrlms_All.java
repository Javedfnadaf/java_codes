import java.util.*;

public class Main {
    public static void main(String[] args){
        
        ArrayList<String>map = new ArrayList<>();
        
        
        map.add("javed");
        map.add("kalmesh");
        map.add("harish");
        map.add("harish");
        // map.remove(3);
        
        
        System.out.println(map);
        System.out.println(map.contains(1));
          System.out.println(map.get(1));

        map.remove("Om");

        System.out.println(map.size());
        
        System.out.println(map.get(2));
    }
}