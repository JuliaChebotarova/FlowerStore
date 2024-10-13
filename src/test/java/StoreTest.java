import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import flower.store.Flower;
import flower.store.FlowerBucket;
import flower.store.FlowerColor;
import flower.store.FlowerPack;
import flower.store.FlowerType;
import flower.store.Store;

public class StoreTest {
    private Store store;
    private FlowerBucket bucket1;
    private FlowerBucket bucket2;

    @BeforeEach
    public void setUp() {
        store = new Store();
        
        bucket1 = new FlowerBucket();
        Flower rose = new Flower();
        rose.setFlowerType(FlowerType.ROSE);
        rose.setColor(FlowerColor.RED);
        rose.setPrice(20);
        
        Flower tulip = new Flower();
        tulip.setFlowerType(FlowerType.TULIP);
        tulip.setColor(FlowerColor.YELLOW);
        tulip.setPrice(15);
        
        bucket1.add(new FlowerPack(rose, 10));
        bucket1.add(new FlowerPack(tulip, 5));
        

        bucket2 = new FlowerBucket();
        Flower chamomile = new Flower();
        chamomile.setFlowerType(FlowerType.CHAMOMILE);
        chamomile.setColor(FlowerColor.WHITE);
        chamomile.setPrice(10);
        
        Flower rose2 = new Flower();
        rose2.setFlowerType(FlowerType.ROSE);
        rose2.setColor(FlowerColor.WHITE);
        rose2.setPrice(25);
        
        bucket2.add(new FlowerPack(chamomile, 8));
        bucket2.add(new FlowerPack(rose2, 12));
        
        store.addBucket(bucket1);
        store.addBucket(bucket2);
    }

    @Test
    public void testSearch() {
        List<Flower> result = store.search(FlowerType.ROSE, FlowerColor.RED, 15, 30);
        assertEquals(1, result.size());
        assertEquals(FlowerType.ROSE, result.get(0).getFlowerType());
        assertEquals(FlowerColor.RED.toString(), result.get(0).getColor());
    }
    @Test
    public void testSearchNoMatch() {
        List<Flower> result = store.search(null, FlowerColor.BLUE, 0, 100);
        assertTrue(result.isEmpty());
    }
}
