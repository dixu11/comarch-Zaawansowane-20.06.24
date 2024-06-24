package lambda;


public class Demo {
    public static void main(String[] args) {
        Car car = new Car();
        Car truck = new Truck3();

        car.drive();
        truck.drive();

        class Truck4 extends Car{
            @Override
            void drive() {
                System.out.println("Jedzie wielkie auto");            }
        }
        Car truck4 = new Truck4();
        truck4.drive();

        //anonimowa klasa
        Car truck5 = new Car(){
            @Override
            void drive() {
                System.out.println("Jedzie wielkie auto");
            }
        };

        truck5.drive();

    }

    static class Truck3 extends Car{
       @Override
       void drive() {
           System.out.println("Jedzie wielkie auto");
       }
    }

}

class Truck2 extends Car{
    @Override
    void drive() {
        System.out.println("Jedzie wielkie auto");
    }
}
