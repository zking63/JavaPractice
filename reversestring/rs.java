//reverse a string and print a new string of it
import java.util.ArrayList;
public class rs{
    public void reverse(String word){
        String back = String.valueOf(word.charAt(word.length()-1));
        String firstLetter = String.valueOf(word.charAt(0));
        for (int i = word.length() -2; i > 0; i--){
            String letter = String.valueOf(word.charAt(i));
            back += letter;
        }
        String finalback = back + firstLetter;
        System.out.println(finalback);
    }
}