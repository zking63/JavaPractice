import java.util.ArrayList;

public class One {
    private ArrayList<Integer> numbers;

    public void One(Integer Digits){
        //create a formula that gets a number down to single digits by adding each digit
        String temp = Integer.toString(Digits);
        numbers = new ArrayList<Integer>();
        Integer sum = 0;
        for(int i = 0; i < temp.length(); i++){
            String singleDigit = String.valueOf(temp.charAt(i));
            Integer digit = Integer.parseInt(singleDigit); 
            numbers.add(digit);
            sum += numbers.get(i);
        }
        while (sum > 9){
            String temp2 = Integer.toString(sum);
            sum = 0;
            for(int j = 0; j < temp2.length(); j++){
                numbers.clear();
                String singleDigit2 = String.valueOf(temp2.charAt(j));
                Integer digit2 = Integer.parseInt(singleDigit2);
                numbers.add(digit2);
                sum += numbers.get(0);
            }
        }
        System.out.println(sum);
    }
}