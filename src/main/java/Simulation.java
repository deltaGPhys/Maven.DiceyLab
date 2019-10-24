public class Simulation {

    private int numDice;
    private int numThrows;
    private Bins bins;

    public Simulation(int numDice, int numThrows) {
        this.numDice = numDice;
        this.numThrows = numThrows;
        this.bins = new Bins(2,12);
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2,1000000);

        simulation.runSimulation();
        simulation.printResults();
    }

    public void runSimulation() {
        Dice dice = new Dice(numDice);

        for (int i = 0; i < this.numThrows; i++ ){
            this.bins.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults() {
        System.out.println("***");
        System.out.println(String.format("Simulation of %d dice tossed for %d times", this.numDice, this.numThrows));
        System.out.println("***");
        System.out.println("");

        String line = "";
        double percentage;
        int stars;
        String starBar;
        for (int i = 2; i <= 12; i++ ){
            percentage = this.bins.getBin(i).doubleValue()/this.numThrows;
            stars = (int)Math.round(percentage*100);
            starBar = "";
            for (int j = 0; j < stars; j++ ){
                starBar += "*";
            }
            line = String.format("%1$2d :%2$10d: ",i,this.bins.getBin(i)) + String.format("%.2f ", percentage) + starBar;
            System.out.println(line);
            //System.out.println(this.bins.getBin(i));
        }
    }

}
