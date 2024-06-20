package pachage1;

import pachage2.Class1; //import mówi: w tej klasie bede uzywal Class1 z pakietu pachage2.
//dzieki temu nie musze tego wspominac zawsze odnoszac sie do tej klasy
import java.util.Scanner;

public class Class3 {


    public static void main(String[] args) {
       // Class1.sayHello(); // nie mogę dostać się do Class1
        // (które jest bezpośrednio w pakiecie głównym java bo nie mogę go zaimportować)
        // pisząc nazwę klasy bez żadnych pakietów i importów szuka jej w tym pakiecie czyli "package1"
        Class1.sayHello();
        Class1.sayHello();
        Class1.sayHello();
        Class1.sayHello();
        Class1.sayHello();
        Class1.sayHello();
        Class1.sayHello();

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
       // pachage2.Scanner.scan(); //gdybysmy uzywali drujgiel klasy o tej samej nazwie z innego pakietu
    }
}
