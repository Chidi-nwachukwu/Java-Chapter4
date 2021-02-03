package chapter4;

/* (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has kept track of several trips by
recording the miles driven and gallons used for each tankful. Develop a Java application that will input the miles driven and
gallons used (both as integers) for each trip. The program should calculate and display the miles per gallon obtained for
each trip and print the combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the data from the user. */


import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        Scanner chidi = new Scanner(System.in);

        int mileDriven;
        int gallonsUsed;
        double milesPerGallon = 0.0;
        double totalMilesPerGallon = 0.0;
        int totalMilesDriven = 0;
        int totalGallonsUsed = 0;

        System.out.println("Enter miles driven or -1 to quit");
         mileDriven = chidi.nextInt();

        System.out.println("Enter gallons used or -1 to quit");
         gallonsUsed = chidi.nextInt();

         while ( mileDriven != -1 ) {


             totalGallonsUsed += gallonsUsed;
              totalMilesDriven += mileDriven;

             milesPerGallon = mileDriven / gallonsUsed;
             totalMilesPerGallon = totalMilesDriven / totalGallonsUsed;

              System.out.printf("milesPerGallon %f%n", milesPerGallon);

             System.out.println("Enter miles driven or -1 to quit");
             mileDriven = chidi.nextInt();

             System.out.println("Enter gallons used or -1 to quit");
             gallonsUsed = chidi.nextInt();

         }
        System.out.printf("totalMilesPerGallon %.2f%n", totalMilesPerGallon);




    }

}

