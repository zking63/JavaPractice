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
            System.out.println(numbers);
            sum += numbers.get(i);
            System.out.println(sum);
        }
            while (numbers.size() > 1){
                numbers.clear();
                System.out.println(numbers);
                String temp2 = Integer.toString(sum);
                for(int j = 0; j < temp2.length(); j++){
                    String singleDigit2 = String.valueOf(temp2.charAt(j));
                    System.out.println(singleDigit2);
                    Integer digit2 = Integer.parseInt(singleDigit2);
                    System.out.println(digit2);
                    numbers.add(digit2);
                    System.out.println(numbers);
                    sum += numbers.get(j);
                    System.out.println(sum);
                    //add in the current sum and then delete everything before
                }
            }
    }
}