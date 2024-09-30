import java.util.Scanner;

public class student{
  static Scanner input = new Scanner(System.in);

  private int totalUnits;

  //To make it public
  public student(){
    this.totalUnits = 0;
  }

  public student(int units){
    this.totalUnits = 0; 
  }

  //All user input is based from this structured
  public void AllInformation(){
    System.out.print("Enter student Name: ");
    String name = input.nextLine();

    System.out.print("Enter Course: ");
    String course = input.nextLine();

    System.out.print("\nEnter number of Subjects (Max. 10): ");
        int subject = input.nextInt();

        // Validate the maximum number of subjects
        if (subject > 10) {
            System.out.println("Error. Maximum number of subjects is 10.");
            return; // Exit if invalid input
        }

        // Loop through each subject
        for (int i = 1; i <= subject; i++) {
            input.nextLine(); // Consume the newline character
            System.out.print("\nEnter Course Code for Subject " + i + ": ");
            String code = input.nextLine();

            System.out.print("Number of Units for " + code + ": ");
            int units = input.nextInt();

            // Validate the number of units
            if (units >= 1 && units <= 5) {
                totalUnits += units;
            } else {
                System.out.println("Error. Please enter number of units between 1 and 5.");
                i--; // Repeat the same index for invalid input
            }
        }

        System.out.println("\nStudent Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Total Units: " + totalUnits);
        System.out.println("Total enrollment fee: " + NumberOfUnitsToCompute());
    }

  //Calculation of fee per units
  public double NumberOfUnitsToCompute(){
    return totalUnits * 1000;
  }

  //Payment Method
  public void Payment(){
    double totalAmount = NumberOfUnitsToCompute();
    System.out.println("Total enrollment fee: " + totalAmount);
    
    double payment = 0;
    double remainingBalance = totalAmount;

    while (true) {
      System.out.print("\nPlease enter the amount to pay: " );
      payment = input.nextInt();

      if (payment <= 0) {
        System.out.println("Invalid Payment. Please enter a positive amount.");
      }else if (payment < remainingBalance){
        remainingBalance -= payment;
        System.out.println("Partial Payment made. Remaining balance " + remainingBalance);
        continue;
      }else if (payment == remainingBalance){
        System.out.println("Fully Paid. Sanaol Mayaman");
        remainingBalance = 0;
        break;
      }else{
        System.out.println("Over payment. This would be the change: " + (payment - remainingBalance));
        remainingBalance = 0;
        break;
      }
    } 
    System.out.println("Thank you! Enrollment complete");
  }

  public static void main(String[] args) {
    //To Call out the functions
    student stu = new student();
    stu.AllInformation();
    stu.Payment();
  }
}
