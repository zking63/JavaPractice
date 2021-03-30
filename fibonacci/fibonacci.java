import java.util.ArrayList;
public class fibonacci{
    public ArrayList<Integer> fibonacci(int[] numbers){
        ArrayList<Integer> fibsequence = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++){
            if(i==0){
                int j = 0;
                fibsequence.add(j);
            }
            if (i==1){
                int j = numbers[i -1];
                fibsequence.add(j);
            }
            if(i>=2){
                int j = numbers[i -1] + numbers[i -2];
                fibsequence.add(j);
            }
        }
        System.out.println(fibsequence);
        return fibsequence;
    }
}