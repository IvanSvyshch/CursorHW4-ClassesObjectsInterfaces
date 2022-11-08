package CursorHomeWorkHW3.Zoo;

public class ZooRunner {
    public static void main(String[] args) {
        Cat bob = new Cat(3, "Bob", "NoBreed");
        Shark tommy = new Shark(10, "Tommy Lee", 9000);
        Parrot edy = new Parrot(2,"Edy", "Blue");

        System.out.println("Cat " + bob);
        bob.canSing();
        bob.canSwim();

        System.out.println("Shark " + tommy);
        tommy.canSing();
        tommy.canSwim();
        System.out.println("Parrot " + edy);
        edy.canSing();
        edy.canSwim();

    }
}
