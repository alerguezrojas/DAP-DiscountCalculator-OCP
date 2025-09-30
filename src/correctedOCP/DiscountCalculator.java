package correctedOCP;

// Calculator is closed for modification, open for extension
class DiscountCalculator {
    public double applyDiscount(DiscountStrategy strategy, double price) {
        return strategy.calculate(price);
    }
}