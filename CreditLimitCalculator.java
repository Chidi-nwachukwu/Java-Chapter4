package chapter4;
/*4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several department-store customers
has exceeded the credit limit on a charge account. For each customer, the following facts are available: a) account number
b) balance at the beginning of the month c) total of all items charged by the customer this month d) total of all credits
applied to the customer’s account this month e) allowed credit limit. The program should input all these facts as integers,
calculate the new balance (= beginning balance + charges – credits), display the new balance and determine whether the new
balance exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
the message "Credit limit exceeded".*/

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int accountNumber;
        int beginningBalance;
        int itemsCharged;
        int creditsApplied;
        int allowedCredit;
        int newBalance;


        System.out.println("Enter accountNumber or -1 to quit");
        accountNumber = scanner.nextInt();

        System.out.println("Enter beginningBalance or -1 to quit");
        beginningBalance = scanner.nextInt();

        System.out.println("Enter itemsCharged or -1 to quit");
        itemsCharged = scanner.nextInt();

        System.out.println("Enter creditsApplied or -1 to quit");
        creditsApplied = scanner.nextInt();

        System.out.println("Enter allowedCredit or -1 to quit");
        allowedCredit = scanner.nextInt();

        newBalance = beginningBalance + itemsCharged - creditsApplied;

        System.out.printf("newBalance %d%n", newBalance);

        if (beginningBalance < allowedCredit) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("Credit limit not exceeded");
        }

        while (accountNumber != -1) {


            System.out.println("Enter accountNumber or -1 to quit");
            accountNumber = scanner.nextInt();

            System.out.println("Enter beginningBalance or -1 to quit");
            beginningBalance = scanner.nextInt();

            System.out.println("Enter itemsCharged or -1 to quit");
            itemsCharged = scanner.nextInt();

            System.out.println("Enter creditsApplied or -1 to quit");
            creditsApplied = scanner.nextInt();

            System.out.println("Enter allowedCredit or -1 to quit");
            allowedCredit = scanner.nextInt();

            newBalance = beginningBalance + itemsCharged - creditsApplied;


            if (beginningBalance < allowedCredit) {
                System.out.println("Credit limit exceeded");
            } else {
                System.out.println("Credit limit not exceeded");

                System.out.printf("newBalance %d%n", newBalance);


            }


        }
    }
}