package Homework4.BankTypes;

import Homework4.EnumTypes.Currency;

/**
 * Created by user on 18.02.2017.
 */
public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency().equals(Currency.USD)) {
        return 100;
    }
    else return 150;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency().equals(Currency.USD)) {
            return 10000;
        }
        else return 5000;
    }

    @Override
    public int getMonthlyRate() {
    if (getCurrency().equals(Currency.USD)) {
        return 1;
    }

        return 0;
    }

    @Override
    public int getCommission(int summ) {
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
    public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
