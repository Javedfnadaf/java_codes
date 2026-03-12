
public class Main{
    public static void main(String[] args){
        
    String name = "modam";
    String rev = "";
    
    for(int  i = 0; i < name.length(); i++){
        
        rev = name.charAt(i) + rev;
    }
    if(name.equals(rev)){
        System.out.println("its palindrom");
    }
    else{
            System.out.println("Not Palindrome");
    }
   
}
}