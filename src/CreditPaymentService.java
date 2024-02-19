public class CreditPaymentService {

    // S — сумма кредита, P — процентная ставка, N — месяцы выплат, K — коэффициент аннуитета
    public int calculate(int S, double P, int N) {

        double K = (Math.pow(P * ((1 + P)), (N * 12)) / ((Math.pow((1 + P), N * 12) - 1)));
        double annuity = S * K;

        return (int) annuity;
    }
    }

/*

A = S * K, где
A - сумма месячного платежа;
S - величина кредита;
K - коэффициент аннуитета.

K = (i * (1 + i)^n) / ((1 + i)^n - 1), где
i - процентная ставка за один период;
n - количество периодов.

 */
