package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> fishList = new ArrayList<>();
    public final static int CAPACITY = 20;
    private final static int CAPACITY_NEED_FOR_FISH = 5;

    public void addFish(Fish fish){
        if((CAPACITY - fishList.size() * CAPACITY_NEED_FOR_FISH) >= 5){
            fishList.add(fish);
        }
        else{
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
    }

    public void feed(){
        for(Fish fish: fishList){
            fish.feed();
        }
    }

    public void removeFish(int maxWeight){
        List<Fish> toRemoveFish = new ArrayList<>();
        for(Fish fish: fishList){
            if(fish.getWeight() > maxWeight){
                toRemoveFish.add(fish);
            }
        }
        fishList.removeAll(toRemoveFish);
    }

    public List<String> getStatus(){
        List<String> newFishListWithStatus = new ArrayList<>();
        for(Fish fish: fishList){
            newFishListWithStatus.add(fish.getStatus());
        }
        return newFishListWithStatus;
    }

    public int getNumberOfFishWithMemoryLoss(){
        int numberOfFishWithMemoryLoss = 0;
        for(Fish fish: fishList){
            if(fish.hasMemoryLoss()){
                numberOfFishWithMemoryLoss++;
            }
        }
        return numberOfFishWithMemoryLoss;
    }

    public boolean isThereFishWithGivenColor(String color){
        boolean isThereAnyWithThatColor = false;
        for(Fish fish: fishList){
            if(fish.getColor().equals(color)){
                isThereAnyWithThatColor = true;
            }
        }
        return isThereAnyWithThatColor;
    }

    public Fish getSmallestFish(){
        Fish smallestFish = fishList.get(0);
        int smallest = 1_000_000;
        for(Fish fish: fishList){
            if(fish.getWeight() < smallest){
                smallestFish = fish;
                smallest = fish.getWeight();
            }
        }
        return smallestFish;
    }
}
