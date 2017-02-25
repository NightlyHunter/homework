package Homework4;

/**
 * Created by user on 18.02.2017.
 */
public class User {
    USBank Bebe=new USBank(123,"USA",Currency.USD,15,15,1,100);

    public static void main(String[] args) {

        System.out.println (Bebe.getLimitOfWithdrawal());
    }
}
