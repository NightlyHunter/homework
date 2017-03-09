package Homework4;

/**
 * Created by user on 07.03.2017.
 */
public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        if (user.getBank().getLimitOfWithdrawal()>=amount){
            user.setBalance(user.getBalance()-amount-amount*user.getBank().getCommission(amount));

        }else System.out.println("Error!!!");
        System.out.println("Balance after withdrawal="+user.getBalance());
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount<=user.getBank().getLimitOfFunding()){
            user.setBalance(user.getBalance()+amount-amount*user.getBank().getCommission(amount));
        }else System.out.println("Error!!!");
        System.out.println("Balance after funding="+user.getBalance());
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        fromUser.setBalance(fromUser.getBalance()-amount-amount*fromUser.getBank().getCommission(amount));
        toUser.setBalance(fromUser.getBalance()+amount);
        System.out.println("After transfer: balance of "+fromUser+"="+fromUser.getBalance()+"\nBalance of "+toUser+"="+toUser.getBalance());
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance()+user.getSalary());
        System.out.println("Balance after salary="+user.getBalance());
    }
}
