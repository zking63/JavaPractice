import java.util.ArrayList;

public class One {
    public ArrayList<String> One(Integer Digits){
        //create a formula that gets a number down to single digits by adding each digit
        String temp = Integer.toString(Digits);
        ArrayList<String> numbers = new ArrayList<String>();
        int sum = 0;
        for(int i = 0; i < temp.length(); i++){
            String singleDigit = String.valueOf(temp.charAt(i));
            numbers.add(singleDigit);
            System.out.println(numbers);
        }
        for(int j = 0; j < numbers.size(); j++){
            //int digit = (int) numbers.indexOf(j); 
            //int digit = (int) Integer.valueOf(numbers.indexOf(j));
            //System.out.println(digit);
            String digit = String.valueOf(numbers.indexOf(j));
            System.out.println(digit);
        }
        /*for(int j = 0; j < numbers.size(); j++){
            sum += numbers.indexOf(j); 
        }*/
        return numbers;
    }
}