package Homework4;

/**
 * Created by user on 18.02.2017.
 */
public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency().equals(Currency.USD)) {
        return 100;
    }
    else if (getCurrency().equals(Currency.EUR)) {
        return 150;
    }

        return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency().equals(Currency.USD)) {
            return 10000;
        }
        else if (getCurrency().equals(Currency.EUR)) {
            return 5000;
        }

        return 0;
    }

    @Override
    int getMonthlyRate() {
    if (getCurrency().equals(Currency.USD)) {
        return 1/100;
    }

        return 0;
    }

    @Override
    int getCommission(int summ) {
        if (getCurrency().equals(Currency.USD)){
            if (summ<=1000) return 3/100;
            else if (summ>1000) return 1/20;
        }else if (getCurrency().equals(Currency.EUR)){
            if (summ<=1000) return 1/10;
            else if (summ>1000) return 11/100;
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
