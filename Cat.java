package CursorHomeWorkHW3.Zoo;

public class Cat extends Animal implements Swimmable, Voiceble {
    private String breed;

    public Cat(int age, String name, String breed) {
        super(age, name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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
