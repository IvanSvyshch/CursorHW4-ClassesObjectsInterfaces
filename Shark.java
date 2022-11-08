package CursorHomeWorkHW3.Zoo;

public class Shark extends Animal implements Swimmable, Voiceble{
    private int numberOfTeeth;

    public Shark(int age, String name, int numberOfTeeth) {
        super(age, name);
        this.numberOfTeeth = numberOfTeeth;
    }

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    @Override
    public void canSwim() {
        System.out.println("Swim - Yes!");
    }

    @Override
    public void canSing() {
        System.out.println("Sing - No!");
    }

}
