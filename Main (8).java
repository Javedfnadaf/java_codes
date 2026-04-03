/******************************************************************************
arr = [1, 8, 3, 7, 4, 2]

target = 9

output_arr = [8, 1]

*******************************************************************************/

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 7, 4, 2};
        int target = 9;

        for(int i = 0; i < arr.length; i++){
            
            int needed = target - arr[i];
            
            for(int j = i+1; j < arr.length; j++){
                
                if(arr[j] == needed){
                   System.out.println("o/p : ["+arr[i]+","+arr[j]+"]");
                }
                
            }
        }
    }
}
    