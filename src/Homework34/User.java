package Homework34;

/**
 * Created by user on 15.02.2017.
 */
public class User {
    private String name;
    private int balance;
    private int mounthOfEmployment;
    private String companyName;
    private int salyry;
    private String currency;

    void paySalary(){
        this.balance+=this.salyry;
    }

    void withdraw(int sum){
        if (getBalance()<1000){
            this.balance=this.balance-sum-(sum/20);
        }else if (getBalance()>=1000){
            this.balance=this.balance-sum-(sum/10);
        }

    }

    int companyNameLength(){
        return this.companyName.length();
    }

    void mounthIncreaser(int addMonth){
        this.mounthOfEmployment+=addMonth;
    }

    public User(String name, int balance, int mounthOfEmployment, String companyName, int salyry, String currency) {
        this.name = name;
        this.balance = balance;
        this.mounthOfEmployment = mounthOfEmployment;
        this.companyName = companyName;
        this.salyry = salyry;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMounthOfEmployment() {
        return mounthOfEmployment;
    }

    public void setMounthOfEmployment(int mounthOfEmployment) {
        this.mounthOfEmployment = mounthOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalyry() {
        return salyry;
    }

    public void setSalyry(int salyry) {
        this.salyry = salyry;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
