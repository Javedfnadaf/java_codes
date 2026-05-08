public class Main {
    public static void main(String[] args){
        
        
        int[] num = {1,2,5,7};
        
        for(int i = 1; i <= 7; i++){
            boolean found = false;
            
            for(int j = 0; j < num.length; j++){
                
                if(num[j] == i){
                    found = true;
                    
                }
            }
            if(!found){
                System.out.println(i);
            }
        }
        
    }
}