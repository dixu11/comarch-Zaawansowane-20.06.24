package multithreading;

public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
        Spammer helloSpammer = new Spammer("Hello",100_000);
        Thread thread = new Thread(helloSpammer);
        thread.start();
        Thread thread2 = new Thread(helloSpammer);
        thread2.start();
        // Thread.sleep(2000);
        thread.join();
        thread2.join();
        System.out.println("Koniec");
        System.out.println(helloSpammer.getTimesPrinted2());
    }
}

/*
* t = 3
* w1 > t is 0
* w1 > t set to 1
* w1 > t is 1
  w1 > t set to 2
* w1 > t is 2
*
* w2 > t is 2
* w2 > t set to 3
* w2 > t is 3
* w2 > t set to 4
* w1 > t set to 3
* */
