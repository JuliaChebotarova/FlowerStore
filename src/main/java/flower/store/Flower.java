package flower.store;

public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower() {
        this.color = FlowerColor.RED;
        this.flowerType = FlowerType.ROSE;
        this.price = 1;
        this.sepalLength = 1;
    }

    public Flower(FlowerColor color, FlowerType flowerType, double price, double sepalLength) {
        this.color = color;
        this.flowerType = flowerType;
        this.price = price;
        this.sepalLength = sepalLength;
    }

    public String getColor() {
        return color.toString();
    }

    public void setColor(FlowerColor color) {
        if (color == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        this.color = color;
    }

    
    public double getSepalLength() {
        return sepalLength;
    }

    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }
}
