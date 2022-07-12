public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println();
        System.out.println("Сумма кредита 1 000 000 руб, срок 1 год, процент 9,99%");
        System.out.println("Ежемесячный платеж " + service.calculate(1000_000, 12, 9.99) + "руб");
        System.out.println();
        System.out.println("Сумма кредита 1 000 000 руб, срок 2 года, процент 9,99%");
        System.out.println("Ежемесячный платеж " + service.calculate(1000_000, 24, 9.99) + "руб");
        System.out.println();
        System.out.println("Сумма кредита 1 000 000 руб, срок 3 года, процент 9,99%");
        System.out.println("Ежемесячный платеж " + service.calculate(1000_000, 36, 9.99) + "руб");
    }
}
