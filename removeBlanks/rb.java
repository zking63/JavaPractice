//remove the blanks from a string of multiple words
import java.lang.String;
public class rb{
    public void trim(String sent){
        String newS = sent.trim();
        String leftRemoved = "";
        System.out.println(newS + ".");
        for (int i = 0; i < newS.length(); i++){
            System.out.println(newS.charAt(i));
            leftRemoved = newS.replaceAll("\\s+", "");
        }
        System.out.println(leftRemoved);
    }
}