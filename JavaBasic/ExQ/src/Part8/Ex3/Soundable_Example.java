package Part8.Ex3;

public class Soundable_Example {
    private static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Dog());
        printSound(new Cat());

    }
}
