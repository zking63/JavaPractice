//generate the smallest number of coins to get to the parameter of cents
public class ChangeAlgo {
    int quarter = 0;
    int dime = 0;
    int nickel = 0;
    int penny = 0;
    public ChangeAlgo (int total){
        while (total >= 25){
            total -= 25;
            quarter++;
        }
        while (total >= 10){
            total -= 10;
            dime++;
        }
        while (total >= 5){
            total -= 5;
            nickel++;
        }
        while (total >= 1){
            total -= 1;
            penny++;
        }
        System.out.println("Quarters: " +quarter + "\nDimes: " + dime + "\nNickel: " + nickel + "\nPenny: " + penny);
        System.out.println("--------");
    }
    public ChangeAlgo (double total){
        total = total * 100;
        while (total >= 25){
            total -= 25;
            quarter++;
        }
        while (total >= 10){
            total -= 10;
            dime++;
        }
        while (total >= 5){
            total -= 5;
            nickel++;
        }
        while (total >= 1){
            total -= 1;
            penny++;
        }
        System.out.println("Quarters: " +quarter + "\nDimes: " + dime + "\nNickel: " + nickel + "\nPenny: " + penny);
        System.out.println("--------");
    }
}