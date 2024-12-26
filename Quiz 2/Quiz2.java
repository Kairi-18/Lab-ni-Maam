package Outputs;
/*
	 * Groups:
	 * 
	 * Kylie Magistrado
	 * Alexzon Cosca
	 * Justine Rick Rabino 
	 * Kheam Airah Requinala
	 * 
	 */

	import java.util.Scanner;

	public class Quiz{
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int [] powerLevel = new int[10];

	    // Input the numbers of creatures
	    System.out.println("Enter 10 power levels of creatures: ");
	    for(int i = 0; i < powerLevel.length; i++){
	      powerLevel[i] = input.nextInt();
	    }

	    // Bubble Sort (Ascending) Display
	    int[] BubbleSorted = bubbleSort(powerLevel.clone());
	    System.out.print("\nBubble Sort (Ascending): ");
	    displayArray(BubbleSorted);

	    // Selection Sort (Descending) Display
	    int[] SelectionSorted = SelectionSortDescending(powerLevel.clone());
	    System.out.print("\nSelection Sort (Descending): ");
	    displayArray(SelectionSorted);


	    // The Analysis
	    int SumEven = calculate(BubbleSorted, true);
	    int OddSUm = calculate(BubbleSorted, false);
	    int Min = BubbleSorted[0];
	    int Max = BubbleSorted[BubbleSorted.length - 1];

	    // Display of the Analysis
	    System.out.println("\nAnalysis: ");
	    System.out.println("Sum of Even Numbers: " + SumEven);
	    System.out.println("Sum of Odd Numbers: " + OddSUm);
	    System.out.println("Minimum Power Level: " + Min);
	    System.out.println("Maximum Power Level: " + Max);

	    // i close the data
	    input.close();
	  }

	  // Bubble sort Ascending
	  public static int[] bubbleSort(int[]arr){
	    int nume = arr.length;
	    for(int i = 0; i < nume - 1; i++){
	      for(int j = 0; j < nume - 1; j++){
	        if(arr[j] > arr[j + 1]){

	          // Swapping j to i
	          int temp = arr[j];
	          arr[j] = arr[j + 1];
	          arr[j + 1] = temp;
	        }
	      }
	    }
	    // babalik si arr
	    return arr;
	  }

	  // Selection sort Descending
	  public static int[] SelectionSortDescending(int[]arr){
	    int nume = arr.length;
	    for(int i = 0; i < nume - 1; i++){
	      int max = i;
	      for(int j = i + 1; j < nume; j++){
	        if(arr[j] > arr[max]){
	          max = j;
	        }
	      }
	      // Swapping i to max
	      int temp = arr[i];
	          arr[i] = arr[max];
	          arr[max] = temp;
	    }
	    // babalik din ako kay arr 
	    return arr;
	  }

	  // Analysis of even, odd, min and max
	  public static int calculate(int[] arr, boolean even){
	    int sum = 0;
	    for(int num : arr){
	      if(even && num % 2 == 0){
	        sum += num;
	      }else if (!even && num % 2 != 0) {
	        sum += num;
	      }
	    }
	    // binabalikan ko na pala si sum
	    return sum;
	  }

	  // Display all the collection of array both bubble sort and selection sort
	  public static void displayArray(int[] arr){
	    for(int num : arr){
	      System.out.print(num + " ");
	    }
	    // Para goods sana kita
	    System.out.println();
	  }
	}
