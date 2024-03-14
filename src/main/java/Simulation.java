public class Simulation {
    private int numberOfDies;
    private int numberOfTosses;

    private Bins bins;

    public Simulation(int numberOfDies, int numberOfTosses, int lowerBound, int upperBound) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.bins = new Bins(lowerBound, upperBound);
    }

    public void runSimulation() {
        Dice dice = new Dice(numberOfDies);
        for (int i = 0; i < numberOfTosses; i++) {
            int sum = dice.tossAndSum();
            bins.incrementBin(sum);
        }
    }

    public String printResult() {
        StringBuilder sb = new StringBuilder();
        sb.append("***\n");
        sb.append("Simulation of").append(numberOfDies).append(" dice tossed for ").append(numberOfTosses).append(" times.\n");
        sb.append("***\n");
        sb.append("\n");

        for (int i = numberOfDies; i <= 6 * numberOfDies; i++) {
            sb.append(String.format("%2d : %8d: %.2f ", i, bins.getBins(i), (double) bins.getBins(i) / numberOfTosses));
            for (int j = 0; j < (double) bins.getBins(i) / numberOfTosses * 100; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Simulation simulation = new Simulation(2, 1000000, 2, 12);

        simulation.runSimulation();

        System.out.println(simulation.printResult());
    }
}
