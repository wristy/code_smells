class Item {
    private String name;
    private double price;
    private int quantity;
    private DiscountType discountType;
    private double discountAmount;

    public Item(String name, double price, int quantity, DiscountType discountType, double discountAmount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discountType = discountType;
        this.discountAmount = discountAmount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double calculatePriceAfterDiscount() {
        double finalPrice = price;
        switch (discountType) {
            case PERCENTAGE:
                finalPrice -= discountAmount * price;
                break;
            case AMOUNT:
                finalPrice -= discountAmount;
                break;
            default:
                // No discount applied
                break;
        }
        return finalPrice > 0 ? finalPrice : 0; // Ensuring final price doesn't go negative
    }

    public boolean hasDiscount() {
        return discountAmount > 0;
    }
}
