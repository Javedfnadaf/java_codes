import java.util.*;

public class Main {
	public static void main(String[] args) {

		String name = "javednadaf";


		HashMap<Character,Integer>map = new HashMap<>();
		for(int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);

			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch) + 1);
			}
			else {
				map.put(ch,1);
			}


		}
		System.out.println(map);
	}
}