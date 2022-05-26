public class MoneyChanger {

    public double rental_fee_per_day = 1000;
    public double currentTransactionProfit = 0;

    public double ExchangeSGD(double sgd, String toCurrency) {
        double exchange = 0;

        if (toCurrency == "USD") {
            exchange = sgd * 0.73;
            currentTransactionProfit = exchange * 0.1;
        }
        if (toCurrency == "MYR") {
            exchange = sgd * 3.1;
            currentTransactionProfit = exchange * 0.1;
        }
        if (toCurrency == "IND") {
            exchange = sgd * 56.42;
            currentTransactionProfit = exchange * 0.1;
        }
        if (toCurrency == "AUD") {
            exchange = sgd * 1.02;
            currentTransactionProfit = exchange * 0.1;
        }
        if (toCurrency == "CND") {
            exchange = sgd * 0.93;
            currentTransactionProfit = exchange * 0.1;
        }
        if (toCurrency == "EUR1") {
            exchange = sgd * 0.68;
            currentTransactionProfit = exchange * 0.1;
        }

        return exchange - currentTransactionProfit;
    }
}
