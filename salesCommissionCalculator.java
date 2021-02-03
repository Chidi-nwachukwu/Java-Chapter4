package chapter4;
/*4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis. The salespeople receive
$200 per week plus 9% of their gross sales for that week. For example, a salesperson who sells $5,000 worth of merchandise
in a week receives $200 plus 9% of $5000, or a total of $650. You’ve been supplied with a list of the items sold by each
salesperson. The values of these items are as follows: Item Value 1 239.99 2 129.75 3 99.95 4 350.89 Develop a Java
application that inputs one salesperson’s items sold for last week and calculates and displays that salesperson’s earnings.
There’s no limit to the number of items that can be sold.*/


import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class salesCommissionCalculator {
    public static void main(String[] args) {
//
        Scanner input = new Scanner(System.in);

        double weeklyPay = 200.00;
        double pricePeritem1 = 239.99;
        double pricePeritem2 = 129.75;
        double pricePeritem3 = 99.95;
        double pricePeritem4 = 350.89;
        double salesPersonsEarnings = 0.0;
        double commissionOnItemOne = 0;
        double commissionOnItemTwo = 0;
        double commissionOnItemThree = 0;
        double commissionOnItemFour = 0;
        int counter = 1;

        while(counter < 5) {
            if(counter == 1) {
                System.out.println("How many item 1 did you sell?");
                int numberOfItemOneSold = input.nextInt();
                 commissionOnItemOne = pricePeritem1 * numberOfItemOneSold * 0.09;
            }
            if(counter == 2) {
                System.out.println("How many item 2 did you sell?");
                int numberOfItemTwoSold = input.nextInt();
                 commissionOnItemTwo = pricePeritem2 * numberOfItemTwoSold * 0.09;
            }
            if(counter == 3) {
                System.out.println("How many item 3 did you sell?");
                int numberOfItemThreeSold = input.nextInt();
                commissionOnItemThree = pricePeritem3 * numberOfItemThreeSold * 0.09;
            }
            if(counter == 4) {
                System.out.println("How many item 4 did you sell?");
                int numberOfItemFourSold = input.nextInt();
                commissionOnItemFour = pricePeritem4 * numberOfItemFourSold * 0.09;
            }
            counter ++;
        }
        salesPersonsEarnings = weeklyPay + commissionOnItemOne + commissionOnItemTwo + commissionOnItemThree + commissionOnItemFour;

        System.out.printf("Bravo you are rich, your weekly earning is %f%n", salesPersonsEarnings);



//

        }

    }


