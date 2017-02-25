package Homework4;

import static Homework4.Currency.EUR;
import static Homework4.Currency.USD;

/**
 * Created by user on 18.02.2017.
 */
public class USBank extends Bank {
    private int limitOfWithdrowl;
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }


    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency().equals(Currency.USD)){
            limitOfWithdrowl=1000;
        } else if (getCurrency().equals(Currency.EUR)) {
            limitOfWithdrowl = 1200;
        }
        return limitOfWithdrowl;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getCommission(int summ) {
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
