//reverse a string and print an arraylist of it
import java.util.ArrayList;
public class rs{
    private ArrayList<String> back;
    public void reverse(String word){
        back = new ArrayList<String>();
        String lastLetter = String.valueOf(word.charAt(word.length()-1));
        back.add(lastLetter);
        String firstLetter = String.valueOf(word.charAt(0));
        for (int i = word.length() -2; i > 0; i--){
            String letter = String.valueOf(word.charAt(i));
            back.add(letter);
        }
        back.add(firstLetter);
        System.out.println(back);
    }
}