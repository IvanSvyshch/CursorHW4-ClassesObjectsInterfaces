package CursorHomeWorkHW3.Zoo;

public class Parrot extends Animal implements Swimmable, Voiceble{
    private String colorOfWings;

    public Parrot(int age, String name, String colorOfWings) {
        super(age, name);
        this.colorOfWings = colorOfWings;
    }

    public String getColorOfWings() {
        return colorOfWings;
    }

    public void setColorOfWings(String colorOfWings) {
        this.colorOfWings = colorOfWings;
    }

    @Override
    public void canSwim() {
        System.out.println("Swim - No!");
    }

    @Override
    public void canSing() {
        System.out.println("Sing - Yes!");
    }

}
