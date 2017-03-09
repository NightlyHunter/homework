package Homework4;

/**
 * Created by user on 07.03.2017.
 */
public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        if (user.getBank().getLimitOfWithdrawal()>=amount){
            user.setBalance(user.getBalance()-amount+amount*user.getBank().getCommission(amount));

        }else System.out.println("Error!!!");
    }

    @Override
    public void fundUser(User user, int amount) {

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

    }

    @Override
    public void paySalary(User user) {

    }
}
