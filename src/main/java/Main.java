public class Main {
    public static void main(String[] args) {

        double totalmoneychangerprofit = 0;
        MoneyChanger moneyChanger = new MoneyChanger();

        double tx1 = moneyChanger.ExchangeSGD(200, "EUR");
        System.out.println("Exchanging $200 SGD, Gives me $" + tx1 + " EUR back");
        totalmoneychangerprofit += moneyChanger.gain;

        double tx2 = moneyChanger.ExchangeSGD(300, "MYR");
        System.out.println("Exchanging $300 SGD, Gives me $" + tx2 + " MYR back");
        totalmoneychangerprofit += moneyChanger.gain;

        double tx3 = moneyChanger.ExchangeSGD(400, "USD");
        System.out.println("Exchanging $400 SGD, Gives me $" + tx3 + " USD back");
        totalmoneychangerprofit += moneyChanger.gain;

        double tx4 = moneyChanger.ExchangeSGD(500, "JPY");
        System.out.println("Exchanging $500 SGD, Gives me $" + tx4 + " JPY back");
        totalmoneychangerprofit += moneyChanger.gain;

        double moneyChangerProfitAfterPayingRent = totalmoneychangerprofit - moneyChanger.rental_fee_per_day;

        System.out.println("Money changer total profit at the end of day is $" + totalmoneychangerprofit);
        System.out.println("Money changer total profit at the end of day after paying rent is $" + moneyChangerProfitAfterPayingRent);
    }
}
