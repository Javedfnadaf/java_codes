/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/
import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
	    
	    	String name = "javednadaf";
		HashMap<Character,Integer>map = new HashMap<>();
		
	for(char ch :name.toCharArray()){
	    if(map.containsKey(ch)){
	        map.put(ch,map.get(ch) + 1);
	    }
	    else{
	        map.put(ch,1);
	    }
	    }
	    for(char ch :name.toCharArray()){
	        if(map.get(ch) == 1){
	            System.out.println(ch+" ");
	        }
	    }
	    
	}
		
		
	}
