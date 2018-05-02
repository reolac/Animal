import animal.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setName("foo");

        Animal animal2 = new Animal();

        animal2.setName("bar");

        System.out.println(animal.getName());
        System.out.println(animal2.getName());
    }
}
