package correctedOCP;

class VIPDiscount implements DiscountStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.10;
    }
}