import java.util.Random;
public class RandomInt {
    int die1;
    int die2;
    int counter = 0;
    public void getRandomInt(){
        Random rand = new Random();
        int upperbound = 7;
        die1 = rand.nextInt(upperbound); 
        die2 = rand.nextInt(upperbound);

        while (die1 != die2){
            counter++;
            die1 = rand.nextInt(upperbound); 
            die2 = rand.nextInt(upperbound);
            System.out.println("The first die comes up " + die1);
            System.out.println("The second die comes up " + die2);
        }
        System.out.println("Counter: " + counter);
    }
}