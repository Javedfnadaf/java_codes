import java.util.*;


public class Main {
    public static void main (String[] args) {


LinkedList<String> list = new LinkedList<>();

list.add("Javed");
list.add("Raju");
list.add("Ali");


// list.addFirst("akash");
// list.addLast("om");

// list.remove("Javed");

// System.out.println(list.getFirst());

// System.out.println(list.getLast());


// list.removeFirst();
System.out.println(list.contains("Raju"));
 System.out.println("Size: " + list.size());
}
}