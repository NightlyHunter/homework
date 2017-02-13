package Homework22;
import java.util.Scanner;

/**
 * Created by user on 13.02.2017.
 */
public class Bank {
    public static String calculateOperation(double amount) {

        double balance = 100;
        double commission = amount * 0.05;
        String endOfOperation = "End of operation";

        if (amount + commission <= balance) {
            balance = balance - amount - commission;
            System.out.println("OK " + "Your balance now: " + balance
                    + " Commission: " + commission);
        } else {
            System.out.println("No! Operation is impossible");
        }
        return endOfOperation;

    }

    public static void main(String[] args) {

        double balance = 100;

        System.out.println("Your balance is: " + balance + "$" +
                "\nEnter the sum amount wish to get");

        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();

        System.out.println(calculateOperation(amount));
}}
