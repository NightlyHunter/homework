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
        else return 2200;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency().equals(Currency.USD)) {
            return 10000;
        }
        else return 20000;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency().equals(Currency.EUR)) {
            return 1;
        }

        return 0;
    }

    @Override
    int getCommission(int summ) {
        if (getCurrency().equals(Currency.USD)){
            if (summ<=1000) return 5;
            else if (summ>1000) return 7;
        }else if (getCurrency().equals(Currency.EUR)){
            if (summ<=1000) return 2;
            else if (summ>1000) return 4;
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
