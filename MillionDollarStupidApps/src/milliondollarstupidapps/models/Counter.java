package milliondollarstupidapps.models;

/**
 *
 * @author sam
 */
public class Counter {
    
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    public void increment(int step){
        this.counter += step;
    }
    
}
