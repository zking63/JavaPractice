import java.util.ArrayList;
public class rs{
    private ArrayList<String> back;
    public void reverse(String word){
        System.out.println(word);
        back = new ArrayList<String>();
        String lastLetter = String.valueOf(word.charAt(word.length()-1));
        System.out.println(lastLetter);
        String firstLetter = String.valueOf(word.charAt(0));
        back.add(firstLetter);
        for (int i = 0; i < word.length(); i++){
            System.out.println(firstLetter);
        }
    }
}