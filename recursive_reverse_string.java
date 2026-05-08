public class Main {
    
    public static void reverse_str(String s,int n){
        
        
        if(n < 0){
            return;
        }
        
            System.out.print(s.charAt(n));
            reverse_str(s,n-1);
           
        
     
        
         
       
        
        
        
        
    }
    
    public static void main(String[] args){
    
        String str = "javed";
        reverse_str(str,str.length()-1);
        
        
    }
}