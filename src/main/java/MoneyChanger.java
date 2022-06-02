public class MoneyChanger {

    public double rental_fee_per_day = 1000;
    public double gain = 0;

    public double ExchangeSGD(double sgd, String toCurrency) {
        double exchange = 0;

        if (toCurrency == "USD") {
            exchange = sgd * 0.73;
            gain = exchange * 0.1;
        }
        if (toCurrency == "MYR") {
            gain = exchange * 0.1;
            exchange = sgd * 3.1;
        }
        if (toCurrency == "IND") {
            exchange = sgd * 56.42;
            gain = exchange * 0.1;
            return exchange - gain;
        }
        if (toCurrency == "AUD") {
            exchange = sgd * 1.02;
            gain = exchange * 0.1;
        }
        if (toCurrency == "CND") {
            exchange = sgd * 0.93;
            gain = exchange * 0.1;
            return exchange - gain;
        }
        if (toCurrency == "EUR") {
            gain = exchange * 0.1;
            exchange = sgd * 0.68;
        }

        return exchange - gain;
    }
}
