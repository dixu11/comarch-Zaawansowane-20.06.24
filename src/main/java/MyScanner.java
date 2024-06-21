import java.util.Scanner;

public class MyScanner {

   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        int number1 = scanner.nextInt();
        String text2 = scanner.nextLine();
        int number2 = scanner.nextInt();

        System.out.println(text1);
        System.out.println(number1);
        System.out.println(text2);
        System.out.println(number2);*/

        /*
             a
             1
             2
             a
             1

             2
         */

        String text1= readText();
        int number1 = readInt();
        String text2 = readText();
        int number2 = readInt();

        System.out.println(text1);
        System.out.println(number1);
        System.out.println(text2);
        System.out.println(number2);
    }


    public static String readText() {
        return scanner.nextLine();

    }

    public static int readInt() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

   /* public static Scanner invokeScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    } */

}
