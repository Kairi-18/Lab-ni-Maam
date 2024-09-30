import java.util.Scanner;
public class clock {
    
    // Method to convert Seconds to Minutes
    public double SecondstoMinutes(double seconds) {
      return seconds / 60;
  }   
      
    // Method to convert Seconds to Hours
    public double SecondstoHours(double seconds) {
      return seconds / 3600;
  }  
      
    // Method to convert Minutes to Seconds
    public double MinutestoSeconds(double minutes) {
      return minutes * 60;
  }

    // Method to convert Minutes to Hours
    public double MinutestoHours(double minutes) {
      return minutes / 60.0;
  }

    // Method to convert Hours to Seconds
    public double HourstoSeconds(double hours) {
      return hours * 3600;
  }

    // Method to convert Hours to Minutes
    public double HourstoMinutes(double hours) {
    return hours * 60;
  }
  
    // Main function
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    clock clock = new clock();
    boolean continueConversion = true;
      
    // While loop (to choose the method to be used)
    while (continueConversion) {
      //OnlyRead Output for the user to pick a time to convert
        System.out.println("[1] Seconds to Minutes");
        System.out.println("[2] Seconds to Hours");
        System.out.println("[3] Minutes to Seconds");
        System.out.println("[4] Minutes to Hours");
        System.out.println("[5] Hours to Seconds");
        System.out.println("[6] Hours to Minutes");
        //To pick a number to convert
        System.out.print("Choose Conversion: ");
        int choice = scanner.nextInt();

        // Initializing variables
        System.out.print("Enter the value: ");
        int value = scanner.nextInt();
        double result = 0;

      // Output by using switch (based on option chosen)
      switch (choice) {
        case 1:
            result = clock.SecondstoMinutes(value);
            System.out.println("Seconds to minutes: " + result);
            break;
        case 2:
            result = clock.SecondstoHours(value);
            System.out.println("Seconds to hours: " + result);
            break;  
        case 3:
            result = clock.MinutestoSeconds(value);
            System.out.println("Minutes to seconds: " + result);
            break;
        case 4:
            result = clock.MinutestoHours(value);
            System.out.println("Minutes to hours: " + result);
            break;
        case 5:
            result = clock.HourstoSeconds(value);
            System.out.println("Hours to seconds: " + result);
            break;
        case 6:
            result = clock.HourstoMinutes(value);
            System.out.println("Hours to minutes: " + result);
            break;
        default:
            System.out.println("Invalid choice.");

      }
      
      // Continue converting from/to Seconds,Minutes and/or Hours
      System.out.print("Do you want to convert time? (Y/N): ");
      char continueChoice = scanner.next().charAt(0);
      continueConversion = (continueChoice == 'Y' || continueChoice == 'y');
    }

    scanner.close();
  }
}
