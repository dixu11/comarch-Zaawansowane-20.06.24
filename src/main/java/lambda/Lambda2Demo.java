package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda2Demo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ala");
        names.add("Adam");
        names.add("Ania");
        names.add("Ania");
        names.add("Ania");
        names.add("Ania");
        names.add("Anna");

        names.stream()
                .filter( name -> name.endsWith("a") )
                .forEach(name -> System.out.println(name));

        List<String> newList = names.stream()
                .distinct()
                .filter(name -> name.endsWith("a"))
                .toList();

        System.out.println(newList);


        Equation addition = new Equation(){
          @Override
          public int execute(int number, int number2) {
              return number + number2;
          }
      };

        Equation subtraction = (int number, int number2) -> {
                    return number - number2;
            };



        System.out.println(addition.execute(2,1));
        System.out.println(subtraction.execute(4,2));


//        Runnable, Consumer, Predicate, Function, Supplier, Operator

        testEquation(( number,  number2) ->  number * number2);



    }

    static void testEquation(Equation equation) {
        System.out.println("For 2 and 2 equation gives:");
        System.out.println(equation.execute(2,2));
    }
}
