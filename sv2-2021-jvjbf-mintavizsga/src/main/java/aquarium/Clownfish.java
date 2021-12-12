package aquarium;

public class Clownfish extends Fish{

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
        this.setMemory(false);
    }

    @Override
    public void feed() {
        setWeight(getWeight() + 1);
    }
}
