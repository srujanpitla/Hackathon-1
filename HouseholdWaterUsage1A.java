import java.util.Scanner;

public class HouseholdWaterUsage1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of family members");
        int familyMembers = sc.nextInt();

        System.out.println("Enter the amount of water used per person in liters");
        double waterUsedPerPerson = sc.nextDouble();

        System.out.println("Enter House Number (integer)");
        int houseNumber = sc.nextInt();

        System.out.print("Enter water usage status (character):(Y/N) ");
        char waterUsageStatus = sc.next().charAt(0);

        double waterConsumed = familyMembers * waterUsedPerPerson;

        System.out.println("Household Details");
        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed: " + waterConsumed + " litres");
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + waterUsageStatus);

        sc.close();
    }
}
