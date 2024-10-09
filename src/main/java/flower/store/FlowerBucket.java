package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket(){
        flowerPacks = new ArrayList<>();
    }

    public void add(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
    }

    public double getPrice(){
        int sum = 0;
        for (FlowerPack pack : flowerPacks){
            sum+=pack.getPrice();
        }
        return sum;
    }

    public List<FlowerPack> getFlowerPacks() {
        return flowerPacks;
    }

    public void setFlowerPacks(List<FlowerPack> flowerPacks) {
        this.flowerPacks = flowerPacks;
    }
}
