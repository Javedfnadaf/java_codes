
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
      
      
      
      int[] arr = {5,7,36,4};
      
      
      int max = arr[0];
      
      for(int i = 1; i < arr.length; i++){
          
          max = Math.max(max,arr[i]);
          
          
      }
      System.out.println(max);
    }
}