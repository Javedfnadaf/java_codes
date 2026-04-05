import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String name = "javed";

        HashMap<Integer, Character> map = new HashMap<>();

        // Store index and character
        for (int i = 0; i < name.length(); i++) {
            map.put(i, name.charAt(i));
        }

        // Reverse print
         for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(map.get(i));
    }
    }
}