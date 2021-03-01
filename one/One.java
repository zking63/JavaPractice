import java.util.ArrayList;

public class One {
    public void One(Integer Digits){
        //create a formula that gets a number down to single digits by adding each digit
        String temp = Integer.toString(Digits);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> numbersFinal = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < temp.length(); i++){
            String singleDigit = String.valueOf(temp.charAt(i));
            Integer digit = Integer.parseInt(singleDigit); 
            numbers.add(digit);
            System.out.println(numbers);
            System.out.println(numbers.size());
            for(int j = 0; j < numbers.size(); j++){
                String tempsum = Integer.toString(sum);
                String sumDigit = String.valueOf(tempsum.charAt(j));
                Integer sumdigit = Integer.parseInt(sumDigit); 
                numbersFinal.add(sumdigit);
                while (numbersFinal.size() > 1){
                    sum += numbers.get(i);
                }
            }
        }
        System.out.println(sum);
        /*for(int j = 0; j < numbers.size(); j++){
            //int digit = (int) numbers.indexOf(j); 
            //int digit = (int) Integer.valueOf(numbers.indexOf(j));
            //System.out.println(digit);
            String digit = String.valueOf(numbers.indexOf(j));
            System.out.println(digit);
        }
        /*for(int j = 0; j < numbers.size(); j++){
            sum += numbers.indexOf(j); 
        }*/
    }
}