import java.util.Random;

public class Dice {

    private int n;

    public Dice(int n) {
        this.n = n;
    }

    public Integer tossAndSum() {
        Integer sum = 0;
        Random random = new Random();
        for (int i = 0; i < this.n; i++) {
            sum += random.nextInt(6)+1;
        }
        return sum;
    }

    public Integer getN() {
        return this.n;
    }

}
