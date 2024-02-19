public class CreditPaymentService {

    // S — сумма кредита, P — процентная ставка, N — месяцы выплат, K — коэффициент аннуитета
    public int calculate(int loanSum, double percent, int months) {

        double rate = (Math.pow(percent * ((1 + percent)), (months * 12)) / ((Math.pow((1 + percent), months * 12) - 1)));
        double annuity = loanSum * rate;

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
