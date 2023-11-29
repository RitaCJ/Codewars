import java.util.Scanner;

public class Problem_4 {
    public static String MakeUpperCase(String str){
      
    return (str.toUpperCase());
    }

    public static void main(String [] args){
   String text, word;

   Scanner input = new Scanner(System.in);

   text = input.nextLine();
    word = MakeUpperCase(text);
    System.out.println(word);
   
    }
}
