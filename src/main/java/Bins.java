import java.util.ArrayList;

public class Bins {

    private int min;
    private int max;
    private ArrayList<Integer> data;

    public Bins (int min, int max) {
        this.min = min;
        this.max = max;
        this.data = new ArrayList<Integer>(this.max+1);
        for (int i = 0; i <= max; i++ ){
            this.data.add(0);
        }
    }

    public void incrementBin(int bin) {
        int size = data.get(bin);
        data.set(bin, size+1);
    }

    public Integer getBin(int bin) {
        return data.get(bin);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
