public class CreditPaymentService {

    public int calculate(int loanSum, double percent, int months) {

        double monthlyPercent = percent / 100 / 12;
        double annuity = loanSum * (monthlyPercent + monthlyPercent / (Math.pow(1 + monthlyPercent, months) -1));

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
