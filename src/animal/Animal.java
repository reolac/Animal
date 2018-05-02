package animal;

import java.util.*;

public class Animal {

    public static final double FAVNUMBER = 1.6180;

    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favouriteChar;
    private double speed;
    private float height;

    protected static int numberOfAnimals = 0;

    static Scanner userInput = new Scanner(System.in);

    public Animal() {
        numberOfAnimals++;

        int sumOfNumbers = 5 + 1;

        System.out.println("5 + 1 = " + sumOfNumbers);
    }

    public String getName() {
        return name + "i'm a name";
    }

    public void setName(String name) {
        this.name = name;
    }
}
