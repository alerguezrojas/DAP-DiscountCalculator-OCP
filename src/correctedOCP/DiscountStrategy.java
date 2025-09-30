package correctedOCP;

// Strategy interface for different discount types
interface DiscountStrategy {
    double calculate(double price);
}