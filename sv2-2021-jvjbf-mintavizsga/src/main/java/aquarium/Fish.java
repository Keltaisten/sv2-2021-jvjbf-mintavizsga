package aquarium;

public abstract class Fish {
    private String name;
    private int weight;
    private String color;
    private boolean memory;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public void setMemory(Boolean memory){
        this.memory = memory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss(){
        return memory;
    }

    public String getStatus(){
        return getName() + ", weight: " + getWeight() + ", color: " +
                getColor() + ", short-term memory loss: " + hasMemoryLoss();
    }

    public abstract void feed();
}
