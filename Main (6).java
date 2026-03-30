

public class Main {
    public static void main(String[] args){
        
        int[] num = {4,4,5,6,6};
        
        for(int i = 0; i < num.length; i++){
             if(i > 0 && num[i] == num[i-1]){
                 continue;
             
             }
            int count = 0;
            
            for(int j = 0; j < num.length; j++){
                
                
                if(num[i] == num[j]){
                    
                    count++;
                    
                    
                }
            }
            if(count == 2){
                System.out.println(num[i]);
            }
        }
        
    }
}