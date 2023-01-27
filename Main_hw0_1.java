/*
 * INSTRUCTION:
 *     This is a Java starting code for hw0_1.
 *     When you finish the development, download this file.
 *     Note that the current filename is "Main.java".
 *     But rename it to "Main_hw0_1.java".
 *     After that, upload the renamed file on Canvas.
 */

// Finish the head comment with Abstract, ID, Name, and Date.
/*
 * Title: Main_hw0_1.java
 * Abstract: This program reads two integer numbers from a user and displays the sum and difference of them.
 * ID: 2809
 * Name: Priyadarshini Sawant
 * Date: 01/26/2023
 */
 
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner myNumber = new Scanner(System.in);
    System.out.print("");

    int num1 = myNumber.nextInt();
    int num2 = myNumber.nextInt();

    int sum = num1 + num2;

    int diff = num1 - num2;
    if(diff<0){
      diff= num2-num1;
    }
    else{
      diff=num1-num2;
    }

    System.out.println("SUM:"+sum);
    System.out.println("DIFF:"+diff);
  }
}
