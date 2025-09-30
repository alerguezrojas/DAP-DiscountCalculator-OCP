package correctedOCP;

class RegularDiscount implements DiscountStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.05;
    }
}