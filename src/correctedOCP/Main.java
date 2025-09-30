package correctedOCP;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        double discount = calculator.applyDiscount(new VIPDiscount(), 100);
        System.out.println("Discount: " + discount);
    }
}