package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Spammer implements Runnable{

    private String spam;
    private int times;
    private int timesPrinted = 0;
    private AtomicInteger timePrinted2 = new AtomicInteger(0);

    public Spammer(String spam, int times) {
        this.spam = spam;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            //System.out.println(spam);
            /*int value = timesPrinted;
            timesPrinted = value + 1;*/
           // timesPrinted++;
            increment();
            timePrinted2.incrementAndGet();
        }
    }

    private synchronized void increment(){
        timesPrinted++;
    }

    public int getTimesPrinted() {
        return timesPrinted;
    }

    public int getTimesPrinted2() {
        return timePrinted2.get();
    }
}
