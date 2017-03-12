package Homework4;

import Homework4.BankTypes.Bank;
import Homework4.BankTypes.ChinaBank;
import Homework4.BankTypes.EUBank;
import Homework4.BankTypes.USBank;
import Homework4.EnumTypes.Currency;
import Homework4.Interface.BankSystem;
import Homework4.Interface.BankSystemImpl;
import Homework4.UserTypes.User;

/**
 * Created by user on 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Bank USBank = new USBank(1,"US", Currency.USD,11,1000,12,235468846);
        Bank EUBank = new EUBank(2,"Germany",Currency.EUR,200,2000,8,99564852);
        Bank ChinaBank = new ChinaBank(3,"China",Currency.USD,158,1500,4,158444654);

        User userUS1 = new User(1,"Vasya",1500,3,"Kobasnyi zavod",500,USBank);
        User userUS2 = new User(2,"Petya",1254,1,"USBank",1000, USBank);

        User userEU1 = new User(3,"Alina",2356,2,"Bufet",650,EUBank);
        User userEU2 = new User(4,"Pasha",1234,7,"CTO",420,EUBank);

        User userCH1 = new User(5,"Olya",4125,2,"Error",258,ChinaBank);
        User userCH2 = new User(6,"Sasha",123.5,1,"SMTh",12,ChinaBank);

        BankSystem BSI = new BankSystemImpl();

        System.out.println("Vasya");
        BSI.withdrawOfUser(userUS1,12);
        BSI.paySalary(userUS1);
        BSI.fundUser(userUS1,1000);
        BSI.transferMoney(userUS1,userEU2,500);
        System.out.println("--------------------");
        System.out.println("\n");

        System.out.println("Petya");
        BSI.withdrawOfUser(userUS2,12);
        BSI.paySalary(userUS2);
        BSI.fundUser(userUS2,1000);
        BSI.transferMoney(userUS2,userEU1,500);
        System.out.println("--------------------");
        System.out.println("\n");

        System.out.println("Alina");
        BSI.withdrawOfUser(userEU1,12);
        BSI.paySalary(userEU1);
        BSI.fundUser(userEU1,1000);
        BSI.transferMoney(userEU1,userEU2,500);
        System.out.println("--------------------");
        System.out.println("\n");

        System.out.println("Pasha");
        BSI.withdrawOfUser(userEU2,12);
        BSI.paySalary(userEU2);
        BSI.fundUser(userEU2,1000);
        BSI.transferMoney(userEU2,userCH1,500);
        System.out.println("--------------------");
        System.out.println("\n");

        System.out.println("Olya");
        BSI.withdrawOfUser(userCH1,12);
        BSI.paySalary(userCH1);
        BSI.fundUser(userCH1,1000);
        BSI.transferMoney(userCH1,userUS2,500);
        System.out.println("--------------------");
        System.out.println("\n");

        System.out.println("Sasha");
        BSI.withdrawOfUser(userCH2,12);
        BSI.paySalary(userCH2);
        BSI.fundUser(userCH2,1000);
        BSI.transferMoney(userCH1,userUS1,500);
        System.out.println("--------------------");
        System.out.println("\n");
    }
}
