public class last{
    public static void lastD(Integer digit, Integer exponent){
        String temp = Integer.toString(digit);
        String last = String.valueOf(temp.charAt(temp.length()-1));
        Integer final1 = Integer.parseInt(last);
        System.out.println(final1);
    }
}