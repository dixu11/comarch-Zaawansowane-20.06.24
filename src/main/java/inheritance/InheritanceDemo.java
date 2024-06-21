package inheritance;


import java.util.Scanner;

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bruno",2,4);
        System.out.println(dog1 instanceof Dog);



       // dog1 = new Cat();
        Dog dog2 = new Dog();
        dog1.bark();
        dog1.sit();
        dog1.feed();
        System.out.println("Test");
        System.out.println(dog1);
        System.out.println(dog2);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Parszi", 3, false);
        cat1.meow();
        cat1.hunt();
        cat1.feed();

        Animal animal = new Animal();


        System.out.println(cat1);
        System.out.println(cat2);

        AnimalKeeper animalKeeper = new AnimalKeeper();
//        animalKeeper.dogCare(dog1);
//        animalKeeper.catCare(cat1);

        animalKeeper.animalCare(dog1);
        animalKeeper.animalCare(cat1);

        System.out.println("--------");
        Animal[] animals = new Animal[2];
        animals[0] = dog1;
        animals[1] = cat2;

        for (Animal anAnimal : animals) {
            anAnimal.makeSound();
        }

        //polimorfizm
        Animal animal1 = new Cat();
        animal1.makeSound();
        animal1 = new Dog();
        animal1.makeSound();

    }
}


class AnimalKeeper {


    public void animalCare(Animal animal){
        System.out.println("Opiekuję się zwierzęciem");
        animal.feed();
        //a teraz zrób swoją specjalna rzecz
        animal.makeSound();

        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.bark();
        }else if( animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.meow();
        }

    //   animal.bark(); // ?
      //  animal.meow(); // ?
        System.out.println("zwierze nakarmione!");
    }

    public void dogCare(Dog dog){
        System.out.println("Opiekuję się psem");
        dog.feed();
        dog.bark();
        System.out.println("Pies nakarmiony!");

    }

    public void catCare(Cat cat){
        System.out.println("Opiekuję się kotem");
        cat.feed();
        cat.meow();
        System.out.println("kotem nakarmiony!");
    }
}