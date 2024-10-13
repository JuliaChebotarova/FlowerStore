package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<FlowerBucket> buckets = new ArrayList<>();

    public void addBucket(FlowerBucket bucket) {
        buckets.add(bucket);
    }

    public List<Flower> search(FlowerType type, FlowerColor color, double minPrice, double maxPrice) {
        List<Flower> matchingFlowers = new ArrayList<>();

        for (FlowerBucket bucket : buckets) {
            for (FlowerPack pack : bucket.getFlowerPacks()) {
                Flower flower = pack.getFlower();
                if (flower.getFlowerType() == type 
                    && flower.getColor().equals(color.toString()) 
                    && flower.getPrice() >= minPrice 
                    && flower.getPrice() <= maxPrice) {
                    matchingFlowers.add(flower);
                }
            }
        }
        return matchingFlowers;
    }
}

