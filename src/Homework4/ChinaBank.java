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
    else return 150;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency().equals(Currency.USD)) {
            return 10000;
        }
        else return 5000;
    }

    @Override
    int getMonthlyRate() {
    if (getCurrency().equals(Currency.USD)) {
        return 1;
    }

        return 0;
    }

    @Override
    int getCommission(int summ) {
        if (getCurrency().equals(Currency.USD)){
            if (summ<=1000) return 3;
            else if (summ>1000) return 5;
        }else if (getCurrency().equals(Currency.EUR)){
            if (summ<=1000) return 10;
            else if (summ>1000) return 11;
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
