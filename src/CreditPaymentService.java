public class CreditPaymentService {
    public int calculate(int amount, int period, double percent) {
        double mounthPercent = percent / 12 / 100;
        double coefficient = (mounthPercent * Math.pow((1 + mounthPercent), period)) / (Math.pow((1 + mounthPercent), period) - 1);
        int result = (int) (coefficient * amount);
        return result;
    }
}
