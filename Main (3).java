public class Main
{
    public static void main(String[] args)
    {
        String str = "I love java programming";
        
        String[] words = str.split(" ");
        System.out.println(words);
        
        for(int i = words.length-1; i >= 0; i--){
            // System.out.println(words[2]);
        
            // int rep = words[i];
        
        System.out.print(words[i]+" ");
        }
    }
}