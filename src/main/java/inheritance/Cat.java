package inheritance;

public class Cat extends Animal {
    private String name;
    private int age;
    private boolean hardTemperament;

    public Cat() {
        name = "Kicia";
        age = 2;
        hardTemperament = true;
    }

    public Cat(String name, int age, boolean hardTemperament) {
        this.name = name;
        this.age = age;
        this.hardTemperament = hardTemperament;
    }

    public void makeSound() {
        meow();
    }

    public void meow() {
        System.out.println("Miał miał");
    }

    public void hunt(){
        System.out.println("<Kot przynosi mysz>");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hardTemperament=" + hardTemperament +
                '}';
    }
}
