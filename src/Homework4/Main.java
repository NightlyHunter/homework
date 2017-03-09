package Homework4;

/**
 * Created by user on 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        USBank Moneymaker = new USBank(123,"YSA",Currency.USD,3,1000,1,99999999);
        User Kolbasa = new User(1,"Kolbasa",1000,3,"Zopa",1000,Moneymaker);
        BankSystemImpl Bankii= new BankSystemImpl();
        Bankii.paySalary(Kolbasa);
    }
}
