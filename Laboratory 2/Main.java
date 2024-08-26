//My name is Kylie Magistrado and this is my code.
//Importing Scanner to input radius and height
import java.util.Scanner;
//Used OOP and Methods

//This is the Class
class Cylinder{

  //Used protected to use any of the subclass that declares
  protected int radius;
  protected int height;

  //Constructor of the Area of a Cylinder
  public Cylinder(int radius, int height){
    this.radius = radius;
    this.height = height;
  }
  //This is the function of the Area of the Cylinder
  public void allOfCyclinderArea(){
    double area = area();
    System.out.println("Area of the Cylinder is: " + area);
  }
  //Calculation of the Area
  private double area(){
    return 2 * Math.PI * radius * (radius + height);
  }

}
//A subclass of the Cyclinder which is the volume of the Cylinder
class CylinderVol extends Cylinder{

  //I use super to allow the subclass to have a refenerence of the Class(this is the flow of the protected of that i declared)
  public CylinderVol(int radius, int height){
    super(radius, height);
  }
  //This is the function of the Volume of the Cylinder
  public void allOfCyclinderVol(){
    double volume = volume();
    System.out.println("Volume of the Cylinder is: " + volume);
  }
  //Calculation of the Volume
  private double volume(){
    return Math.PI * radius * radius * height;
  }

}

public class Main{
    public static void main(String[] args) {
      //inputting the radius and height both of the Area and Volume of Cylinder
      Scanner input = new Scanner(System.in);
      //to input radius
      System.out.print("Enter radius: ");
      int radius = input.nextInt();
      //to input height
      System.out.print("Enter height: ");
      int height = input.nextInt();
      //to call out the function of the Area of the Cylinder
      Cylinder merged = new Cylinder(radius, height);
      merged.allOfCyclinderArea();
      //to call out the function of the Volume of the Cylinder
      CylinderVol megered = new CylinderVol(radius, height);
      megered.allOfCyclinderVol();
  }
}
