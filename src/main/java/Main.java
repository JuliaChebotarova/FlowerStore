
import flower.store.Flower;
import flower.store.FlowerBucket;
import flower.store.FlowerColor;
import flower.store.FlowerPack;
import flower.store.FlowerType;



public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.setColor(FlowerColor.RED);
        flower.setFlowerType(FlowerType.ROSE);
        flower.setPrice(100);
        flower.setSepalLength(10.);

        FlowerPack flowerPack = new FlowerPack(flower, 11);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);

        System.out.println(flowerBucket.getPrice());
    }
}
