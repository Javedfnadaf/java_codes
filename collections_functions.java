import java.util.*;

public class Main {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);

        
        
// Collections.sort(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        


    }
}