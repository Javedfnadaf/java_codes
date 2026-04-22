public class Main {
    
    public static void multipication_table(int n){
        
        
        if(n > 10){
            return;
        }
        System.out.println("5"+"*"+n+"="+(5*n));
        multipication_table(n+1);
    }
    
    



public static void main(String[] args){
    
    multipication_table(1);
    
}
}