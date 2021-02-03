package chapter4;

/* (Salary Calculator) Develop a Java application that determines the gross pay for each of three employees. The company pays
         straight time for the first 40 hours worked by each employee and time and a half for all hours worked in excess of
         40. You’re given a list of the employees, their number of hours worked last week and their hourly rates. Your program
         should input this information for each employee, then determine and display the employee’s gross pay. Use class
          Scanner to input the data. */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String employeeName;
        int hoursWorked;
        int hourlyRate;
        int grossPay;
        int excessGrossPay;
        int counter = 1;

        while(counter <= 3) {
            System.out.println("Enter employee name");
            String employeeName = input.next();

            System.out.println("Enter hours worked");
            hoursWorked = input.nextInt();

            System.out.println("Enter hourly rates");
            hourlyRate = input.nextInt();

            if (hoursWorked <= 40) {
                grossPay = hourlyRate * hoursWorked;
                System.out.printf("Gross pay is %d%n",  grossPay);
            }
            else{
                excessGrossPay = (hourlyRate * 40) + ((hoursWorked - 40) / 2 * hourlyRate);
                System.out.println("Excess gross pay" + excessGrossPay);
            }

            counter++;
        }


    }
}
