

import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import flower.store.Flower;
import flower.store.FlowerBucket;
import flower.store.FlowerColor;
import flower.store.FlowerPack;
import flower.store.FlowerType;
import flower.store.Rose;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }


    @Test
    public void testAdd() {
        Flower flower = new Flower(FlowerColor.RED, FlowerType.TULIP, 150, 5);
        Flower flower2 = new Flower(FlowerColor.WHITE, FlowerType.CHAMOMILE, 15, 20);
        FlowerPack flowerPack = new FlowerPack(flower, 2);
        FlowerPack flowerPack2 = new FlowerPack(flower2, 3);
        flowerBucket.add(flowerPack);
        flowerBucket.add(flowerPack2);
        List<FlowerPack> packs = flowerBucket.getFlowerPacks();
        Assertions.assertEquals(2, packs.size());
    }
}
