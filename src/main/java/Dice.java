import java.util.Random;

public class Dice {
    //field instance variables
    private int numberOfDice;
    private Random random;


    //constructor
    public Dice(int numberOfDice) {

        this.numberOfDice = numberOfDice;

        this.random = new Random();
    }

    // method
    public int tossAndSum() {
        int sum = 0;

        for (int i = 0; i < numberOfDice; i++) {

            sum += random.nextInt(6)+1; // bound starts a 0, so add 1
        }
        return sum;
    }
}
