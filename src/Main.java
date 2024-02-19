public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int S = 1_000_000;
        double P = 9.99;
        int N = 12;

        int annuity = service.calculate(S, P, N);

        System.out.println("Ежемесячный платеж = " + annuity + " рублей");


    }
}