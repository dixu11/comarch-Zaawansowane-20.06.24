package multithreading;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Spammer helloSpammer = new Spammer("Hello",10_000);
        Spammer byeSpammer = new Spammer("Bye", 10_000);
        Thread thread = new Thread(helloSpammer);
        thread.start();
        Thread thread2 = new Thread(byeSpammer);
        thread2.start();
       // Thread.sleep(2000);
        thread.join();
        thread2.join();
        System.out.println("Koniec");
        System.out.println(helloSpammer.getTimesPrinted());
        System.out.println(byeSpammer.getTimesPrinted());
    }
}
