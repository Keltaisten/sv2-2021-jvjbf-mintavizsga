package aquarium;

public class Kong extends Fish {
    public Kong(String name, int weight, String color) {
        super(name, weight, color);
        this.setMemory(false);
    }

    @Override
    public void feed() {
        setWeight(getWeight() + 2);
    }
}
