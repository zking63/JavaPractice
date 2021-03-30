import java.util.ArrayList;
public class fibonacci{
    public Integer fibonacci(int[] numbers){
        ArrayList<Integer> fibsequence = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++){
            if(i==0){
                int j = 0;
                System.out.println(j);
            }
            if (i==1){
                int j = numbers[i -1];
                System.out.println(j);
            }
            if(i>=2){
                int j = numbers[i -1] + numbers[i -2];
                System.out.println(j);
            }
        }
        return 2;
    }
}