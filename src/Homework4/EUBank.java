package Homework4;

/**
 * Created by user on 18.02.2017.
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency().equals(Currency.USD)) {
            return 2000;
        }
        else if (getCurrency().equals(Currency.EUR)) {
            return 2200;
        }

        return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency().equals(Currency.USD)) {
            return 10000;
        }
        else if (getCurrency().equals(Currency.EUR)) {
            return 20000;
        }

        return 0;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency().equals(Currency.EUR)) {
            return 1/100;
        }

        return 0;
    }

    @Override
    int getCommission(int summ) {
        if (getCurrency().equals(Currency.USD)){
            if (summ<=1000) return 1/20;
            else if (summ>1000) return 7/100;
        }else if (getCurrency().equals(Currency.EUR)){
            if (summ<=1000) return 1/50;
            else if (summ>1000) return 1/25;
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}