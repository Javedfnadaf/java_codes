
public class Main
{
	public static void main(String[] args) {
	String name = "programming";
	
	
	for(int i = 0; i < name.length(); i++){
	    char ch = name.charAt(i);
	    if(name.indexOf(ch) !=i){
	        continue;
	    }
	    boolean found = false;
	    int count = 1;
	    
	    for(int j = i+1; j < name.length(); j++){
	        if(ch == name.charAt(j)){
	            found  = true;
	            count++;
	            
	        }
	    }
	    if(count > 0){
	        System.out.println(ch +"="+count);
	    }
	    else{
	        System.out.println(ch+"="+count);
	    }
	}
	}
}