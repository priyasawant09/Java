/*
 * INSTRUCTION:
 *     This is a Java starting code for hw0_2.
 *     When you finish the development, download this file.
 *     Note that the current filename is "Main.java".
 *     But rename it to "Main_hw0_2.java".
 *     After that, upload the renamed file on Canvas.
 */

// Finish the head comment with Abstract, ID, Name, and Date.
/*
 * Title: Main_hw0_2.java
 * Abstract: This program reads five integer numbers from a user and displays the min, max, and median values on the screen.
 * ID: 2809
 * Name: Priyadarshini Sawant
 * Date: 01/26/2023
 */
 
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner myNumber = new Scanner(System.in);
   // System.out.print("Enter 5 numbers: " );
    int[] arr = new int[5];
    int min=Integer.MAX_VALUE;
    int max =Integer.MIN_VALUE;
    for(int i=0; i <5; i++){
      int num1 =myNumber.nextInt();
      if (num1<min){
        min=num1;
      }
      if(num1>max){
        max=num1;
      }
        arr[i] = num1;
    }
      Arrays.sort(arr);
    System.out.println("MIN:"+ min);
    System.out.println("MAX:"+ max);
    System.out.println("MEDIAN:"+ arr[2]);
    
  }
}
