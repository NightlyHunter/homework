package Homework4.BankTypes;

import Homework4.EnumTypes.Currency;

/**
 * Created by user on 18.02.2017.
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency().equals(Currency.USD)) {
            return 2000;
        }
        else return 2200;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency().equals(Currency.USD)) {
            return 10000;
        }
        else return 20000;
    }

    @Override
    public int getMonthlyRate() {
        if (getCurrency().equals(Currency.EUR)) {
            return 1;
        }

        return 0;
    }

    @Override
    public int getCommission(int summ) {
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
    public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
