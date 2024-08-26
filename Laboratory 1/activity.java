//My name is Kylie Magistrado and this is my code.

//I use package to my assigned folder of my code
package wew;

//used scanner to input the number of rows
import java.util.Scanner;

//start of the program
public class activity {

  //declare rows in private
  private int rows;

  //make it public the private
  public activity(int rows){
    this.rows = rows;
  }

  //this is the whole structure of the pattern that divided into 3
  public void structureOfPattern(){
    topPattern();
    middlePattern();
    bottomPattern();
  }

 //function on the top pattern
  private void topPattern(){
    System.out.println("*");
  }

 //function of the middle pattern
  private void middlePattern(){
    for (int i = 1; i <= rows; i++){
      System.out.print("*");
      
    }
  }

  //function to the bottom pattern
  private void bottomPattern(){
    for (int i = rows - 1; i >= 1; i--){
      System.out.print("*");
      for (int j = 1; j <= i; j++){
        System.out.print(j + " ");
      }
      for (int j = i -1; j >= 1; j--){
        System.out.print(j + " ");
      }
      System.out.print("*");
      System.out.println();
    }
    System.out.print("*");
  }

  //this would be the output of my object program
  public static void main(String[] args) {
   //using scanner to input the values
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int rows = input.nextInt();

    //to call out the the structureOfPattern that would output the program
    activity merged = new activity(rows);
    merged.structureOfPattern();
  }
}
