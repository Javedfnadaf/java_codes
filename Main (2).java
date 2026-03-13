public class Main {
	public static void main(String[] args) {


int[] num = {0,8,0,0,9,4,0};

for(int i = 0; i < num.length; i++){
    
    for(int j = i+1; j < num.length; j++){
        
        if(num[i] == 0){
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            
        }
    }
        System.out.print(num[i]);
    }
        
        
    


		
	}
}