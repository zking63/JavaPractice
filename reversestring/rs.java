import java.util.ArrayList;
public class rs{
    private ArrayList<String> back;
    public void reverse(String word){
        System.out.println(word);
        back = new ArrayList<String>();
        String letter = String.valueOf(word.charAt(word.length()-1));
        System.out.println(letter);
        for (int i = 0; i < word.length(); i++){
        }
    }
}