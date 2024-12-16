import java.util.Scanner;
import java.util.Stack;

//Declaring the names and score(powerlevel) of the creatures
class Creature{
  String name;
  int score;

  //The Constructor
  public Creature(String name, int score){
    this.name = name;
    this.score = score;
  }

  @Override
        public String toString() {
            return name + " - " + score;
        }
}

public class FinalExam_MagistradoK {

      //Bubble Sort in Descending Order
      public static void BubbleSortDescending(Creature[] name) {
        int n = name.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (name[j].score < name[j + 1].score) {
                    // Swap
                    Creature temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                  }
              }
          }
      }


        // Selection Sort in ascending order
        public static void selectionSortAscending(Creature[] name) {
          int n = name.length;
          for (int i = 0; i < n - 1; i++) {
              int minIndex = i;
              for (int j = i + 1; j < n; j++) {
                  if (name[j].score < name[minIndex].score) {
                      minIndex = j;
                  }
              }
              // Swap
              Creature temp = name[minIndex];
              name[minIndex] = name[i];
              name[i] = temp;
          }
      }

  public static void displayStack(Creature[] name){
    Stack<Creature> stack = new Stack<>();

    //Push all creatures onto the stack
    for (Creature creature : name){
      stack.push(creature);
    }

    //Pop and display each creature
    System.out.println("\n*** Stack Implementation: Popping Creatures ***");
    while (!stack.isEmpty()){
      System.out.println("Popped: " + stack.pop());
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Input the number of creatures
    System.out.print("Enter number of Creatures: ");
    int numCreatures = input.nextInt();
    input.nextLine();

    Creature [] creaturer = new Creature[numCreatures];

    //Input the name's and score's of the creatures
    for(int i = 0; i < numCreatures; i++){
      System.out.print("\nEnter name of the creatures " + (i + 1) + ": ");
      String name = input.nextLine();
      
      System.out.print("Enter score of the creatures " + (i + 1) + ": ");
      int score = input.nextInt();
      input.nextLine();
      //Put both of them in an array
      creaturer[i] = new Creature(name, score);
    }

    //Display the input original data
    System.out.println("\n*** Original Input ***");
    for (Creature creature : creaturer){
      System.out.println(creature);
    }

    //Bubble Sort for Descending Order
    Creature[] BubbleSorted = creaturer.clone();
    BubbleSortDescending(BubbleSorted);
    System.out.println("\n*** Bubble Sort: Descending Order by the Power Level ***");
    for (Creature creature : BubbleSorted){
      System.out.println(creature);
    }

    //Selection Sort for Ascending Order
    Creature[] SelectionSorted = creaturer.clone();
    selectionSortAscending(SelectionSorted);
    System.out.println("\n*** Selection Sort: Ascending Order by Power Level ***");
    for (Creature creature : SelectionSorted){
      System.out.println(creature);
    }

    // Display the input data
    displayStack(SelectionSorted);

    input.close();
  }
}
