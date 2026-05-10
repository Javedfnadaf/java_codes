import java.util.*;

public class Main {
	public static void main(String[] args) {


    int[] num = {2,4,8,6,3,7};
    ArrayList<Integer> list = new ArrayList<>();
    
    for(int name : num){
        list.add(name);
    }
  Collections.reverse(list);
  
  Collections.sort(list);
    System.out.print(list);
  
  System.out.print(list);
//   System.out.println(Collections.min(list));



	}
}