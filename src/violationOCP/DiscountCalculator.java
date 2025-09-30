package violationOCP;

// Class that violates the Open/Closed Principle
class DiscountCalculator {
    public double calculateDiscount(String customerType, double price) {
        if (customerType.equals("REGULAR")) {
            return price * 0.05; // 5%
        } else if (customerType.equals("VIP")) {
            return price * 0.10; // 10%
        } else if (customerType.equals("PLATINUM")) {
            return price * 0.20; // 20%
        }
        return 0;
    }
}