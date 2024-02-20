public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int loanSum = 1_000_000;
        double percent = 9.99;
        int months = 36;

        int annuity = service.calculate(loanSum, percent, months);

        System.out.println("Ежемесячный платеж = " + annuity + " рублей");


    }
}