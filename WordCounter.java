import java.util.*;
public class WordCounter
{
     static Scanner key = new Scanner(System.in);
     public static void main(String[] args) {    
      int wordcount = 0;
      System.out.println("Enter sentence");
      String a = key.nextLine();
      for(int i = 0; i < a.length(); i++)
        if (!Character.isLetter(a.charAt(i))){
            i++; 
        }
        else {
            wordcount= i;
            i++;
        }          
      System.out.println(wordcount);
   }
}
        
            
        
            
        
    
