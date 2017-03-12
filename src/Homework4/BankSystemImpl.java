package Homework4;

/**
 * Created by user on 07.03.2017.
 */
public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        if (user.getBank().getLimitOfWithdrawal()>=amount){
            user.setBalance(user.getBalance()-amount-amount*user.getBank().getCommission(amount)/100);

        }else System.out.println("Error!!!");
        System.out.println("Balance after withdrawal="+user.getBalance());
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount<=user.getBank().getLimitOfFunding()){
            user.setBalance(user.getBalance()+amount-amount*user.getBank().getCommission(amount)/100);
        }else System.out.println("Error!!!");
        System.out.println("Balance after funding="+user.getBalance());
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBank().getCurrency().equals(toUser.getBank().getCurrency())) {
            fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount)/100);
            toUser.setBalance(fromUser.getBalance() + amount);
        }else if (fromUser.getBank().getCurrency().equals(Currency.EUR) && toUser.getBank().getCurrency().equals(Currency.USD)){
            fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount)/100);
            toUser.setBalance(fromUser.getBalance() + amount*11/10);
            System.out.println("Convertation index from EUR to USD=1.1");
        }else if (fromUser.getBank().getCurrency().equals(Currency.USD) && toUser.getBank().getCurrency().equals(Currency.EUR)){
            fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount)/100);
            toUser.setBalance(fromUser.getBalance() + amount*10/11);
            System.out.println("Convertation index from USD to EUR=0.909");
        }
        System.out.println("After transfer: balance of "+fromUser+"="+fromUser.getBalance()+"\nBalance of "+toUser+"="+toUser.getBalance());
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance()+user.getSalary());
        System.out.println("Balance after salary="+user.getBalance());
    }
}
