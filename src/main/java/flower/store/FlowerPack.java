package flower.store;

public class FlowerPack {
    private Flower flower;
    private int quantity;


    public Flower getFlower() {
        return flower;
    }
    public void setFlower(Flower flower) {
        this.flower = flower;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    public double getPrice(){
        return flower.getPrice() * quantity;
    }


    public FlowerPack(Flower flower, int quantity){
        this.flower = flower;
        this.quantity = quantity;
    }
}
