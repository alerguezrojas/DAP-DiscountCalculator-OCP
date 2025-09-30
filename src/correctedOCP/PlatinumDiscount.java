package correctedOCP;

class PlatinumDiscount implements DiscountStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.20;
    }
}
