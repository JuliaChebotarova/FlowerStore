package flower.store;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    // RED("#FF0000"), BLUE("#0000FF");
    // RED, WHITE, YELLOW, PINK, BLUE;
    RED("#FF0000"),
    BLUE("#0000FF"),
    WHITE("#FFFFFF"),
    YELLOW("#FFFF00"),
    PINK("#FFC0CB");

    private final String stringRepresentation;

    // public void setColor(FlowerColor color) {
    //     if (color == null) {
    //         throw new IllegalArgumentException("Color cannot be null");
    //     }
    //     this.color = color;
    // }

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    public String getName() {
        return name(); // Повертає RED, BLUE, WHITE тощо
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
