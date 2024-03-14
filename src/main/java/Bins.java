import java.util.HashMap;

public class Bins {

    // instance variables
    private int[] results;
    private int lowerBound; // lowerbound(2) is the lowest range
    private int upperBound; // upperbound(12) is the upper range


    // Constructor
    public Bins(int lowerBound, int upperBound) { // outcome of the diceroll 2-12
        results = new int[upperBound - lowerBound+1]; // possible results 11
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public void incrementBin(int rollResult) {
        results[rollResult - lowerBound] += 1; // increment rollResult to tally in the array

    }
    public int getBins(int howManyTimesDannyRolledA10) { //

        return results[howManyTimesDannyRolledA10-lowerBound];



    }

}
