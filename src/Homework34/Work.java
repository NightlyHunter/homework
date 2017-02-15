package Homework34;

/**
 * Created by user on 15.02.2017.
 */
public class Work {
    public static void main(String[] args) {
        User Vasya=new User("Vasya",5,6,"Stripclub",10,"usd");
        Vasya.paySalary();
        System.out.println("Баланс после зарплаты="+Vasya.getBalance());
        Vasya.withdraw(2);
        System.out.println("Баланс после списания денег="+Vasya.getBalance());
        Vasya.mounthIncreaser(5);
        System.out.println("Время работы(месяцы)="+Vasya.getMounthOfEmployment());
        System.out.println("Длинна имени компании="+Vasya.companyNameLength());
    }
}
