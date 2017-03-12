package Homework4.BankTypes;


import Homework4.EnumTypes.Currency;

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
        else return 1200;
    }

    @Override
    public int getLimitOfFunding() {
         if (getCurrency().equals(Currency.EUR)) {
            return 10000;
        }

        return 0;
    }

    @Override
    public int getMonthlyRate() {
        if (getCurrency().equals(Currency.USD)) {
            return 1;
        }
        else return 2;
    }

    @Override
    public int getCommission(int summ) {
        if (getCurrency().equals(Currency.USD)){
            if (summ<=1000) return 5;
            else if (summ>1000) return 7;
        }else if (getCurrency().equals(Currency.EUR)){
            if (summ<=1000) return 6;
            else if (summ>1000) return 8;
        }
        return 0;
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
