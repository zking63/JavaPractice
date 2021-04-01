//implement a function that takes two non-negative integers and finds the
//last digit of the first then multiplies it by an exponent of the second
import java.lang.Math;
public class last{
    public void lastD(Integer digit, Integer exponent){
        if (digit < 0 || exponent < 0){
            System.out.println("The number cannot be negative");
            return;
        }
        String temp = Integer.toString(digit);
        String last = String.valueOf(temp.charAt(temp.length()-1));
        Integer final1 = Integer.parseInt(last);
        Double result = Math.pow(final1, exponent);
        System.out.println(result);
    }
}