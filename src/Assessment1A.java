import java.util.Scanner;

public class Assessment1A  {

    static BMICalculator bmi = new BMICalculator();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int numUser,numNomal = 0, numLow = 0,numHigh = 0;
        double height, weight;
        double minBMI = 0, maxBMI = 0, totalBMI = 0;

        System.out.println("Your welcome message goes here …");
        System.out.print("\nHow many BMI calculations do you wish to perform? ");
        numUser = scanner.nextInt();

        for (int i = 1; i < numUser+1; i++) {
            System.out.print("\nHeight for person " + i + " (m): ");
            height = scanner.nextDouble();
            System.out.print("Weight for person " + i + " (kgs): ");
            weight = scanner.nextDouble();

            double value = bmi.value(weight,height);
            String status = bmi.classification8(value);
            String status2 = bmi.classification3(value);
            System.out.println("BMI for person " + i +": "+( (double) Math.round(value * 10) / 10) + " which is " + status);

            totalBMI += value;

            if(minBMI == 0){
                minBMI = value;
            }
            if(minBMI > value){
                minBMI = value;
            }
            if(maxBMI < value){
                maxBMI = value;
            }

            if(status2.equals("low")){
                numLow ++;
            }
            if(status2.equals("normal")){
                numNomal ++;
            }
            if(status2.equals("high")){
                numHigh ++;
            }
        }

        System.out.println("\nSummary\n*******\n");
        System.out.println("Lowest BMI: " + ( (double) Math.round(minBMI * 10) / 10));
        System.out.println("Highest BMI: " +( (double) Math.round(maxBMI * 10) / 10));
        System.out.println("Average BMI: "+ ( (double) Math.round((totalBMI/numUser) * 10) / 10));
        System.out.println("Number with low BMI:" + numLow);
        System.out.println("Number with normal BMI:" + numNomal);
        System.out.println("Number with high BMI:" + numHigh);
        System.out.println("\nYour exit message goes here …");

    }
}
