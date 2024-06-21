package inheritance;

public class Dog extends  Animal{
    private String name;
    private int age;
    private  int knownTricks;

    public Dog() {
        name = "Burek";
        age = 1;
        knownTricks = 1;
    }

    public Dog(String name, int age, int knownTricks) {
        this.name = name;
        this.age = age;
        this.knownTricks = knownTricks;
    }


    public void makeSound() {
        bark();
    }

    public void feed() {
        System.out.println("pies je karmę dla psa");
    }



    public void bark() {
        System.out.println("Hau hau");
    }

    public void sit() {
        System.out.println("<piesek siada>");
    }



    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", knownTricks=" + knownTricks +
                '}';
    }
}
