//remove the blanks from a string of multiple words
import java.lang.String;
public class rb{
    public void trim(String sent){
        String newS = sent.trim();
        String leftRemoved = "";
        for (int i = 0; i < newS.length(); i++){
            leftRemoved = newS.replaceAll("\\s+", "");
        }
        System.out.println(leftRemoved);
    }
}