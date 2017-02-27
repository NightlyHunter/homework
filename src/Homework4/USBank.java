package Homework4;


/**
 * Created by user on 18.02.2017.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }


    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency().equals(Currency.USD)) {
            return 1000;
        }
        else if (getCurrency().equals(Currency.EUR)) {
            return 1200;
        }

        return 0;
    }

    @Override
    int getLimitOfFunding() {
         if (getCurrency().equals(Currency.EUR)) {
            return 10000;
        }

        return 0;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency().equals(Currency.USD)) {
            return 1/100;
        }
        else if (getCurrency().equals(Currency.EUR)) {
            return 1/50;
        }

        return 0;
    }

    @Override
    int getCommission(int summ) {
        if (getCurrency().equals(Currency.USD)){
            if (summ<=1000) return 1/20;
            else if (summ>1000) return 7/100;
        }else if (getCurrency().equals(Currency.EUR)){
            if (summ<=1000) return 3/50;
            else if (summ>1000) return 2/25;
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}