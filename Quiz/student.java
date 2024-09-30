import java.util.Scanner;

public class student{
  static Scanner input = new Scanner(System.in);

  private int units;
  private int totalUnits;

  public student(){
    this.units = 0;
    this.totalUnits = 0;
  }

  public student(int units){
    this.units = units;
    this.totalUnits = 0; 
  }

  public void AllInformation(){
    System.out.print("Enter student Name: ");
    String name = input.nextLine();

    System.out.print("Enter Course: ");
    String course = input.nextLine();


    
    for(int i = 1; i <=10; i++){
      System.out.print("Enter Course Code: ");
      String code = input.nextLine();

      System.out.println("Subject: " + code);

      if(i <= 10){
        System.out.print("Number of Units: ");
        units = input.nextInt();

          if (units >= 1 && units <= 5) {
            totalUnits += units;
            System.out.println("Number of Units from " + code + " of Subject no. " + i + " is " + units);
          }else{
            System.out.println("Error. Please Enter number of units between 1 and 5.");
            i--; //Repeat the same index for invalid input
          }
          input.nextLine();
      }else{
        System.out.println("Enter invalid");
      }
    }
    System.out.println("Student Name: " + name);
    System.out.println("Course: " + course);
    System.out.println("Total Units per Subjects: " + totalUnits);
    System.out.println("Total enrollment fee: " + NumberOfUnitsToCompute());
  }

  public double NumberOfUnitsToCompute(){
    return totalUnits * 1000;
  }

  public void Payment(){
    double totalAmount = NumberOfUnitsToCompute();
    System.out.println("Total enrollment fee: " + totalAmount);
    
    double payment = 0;
    double remainingBalance = totalAmount;

    while (true) {
      System.out.print("Please enter the amount to pay: " );
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
    student stu = new student();
    stu.AllInformation();
    stu.Payment();
  }
}
