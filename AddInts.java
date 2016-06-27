import java.util.Scanner;

/**
 * Created by lytte on 6/27/2016.
 *
 * Usage, uses division and remainder functions in order to achieve the addition of all digits in a number
 * Alternate build, this could also be accomplished using a .toCharArray() command, and adding them together.
 */
public class AddInts {

    private static Scanner keyboard= new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please input a number between 1000 and 0");
        int inputNum = keyboard.nextInt();

        if(inputNum >1000 || inputNum <0) {
            System.out.println("Failure! larger then 1000, or less then 0");
            //The above could be an Exception object, would have greater re-usability
            System.exit(0);
        }

        int respond = numResponse(inputNum);
        //takes in the value of inputNum, and sends it out below
        System.out.println("The digit's addition is " + respond);
        keyboard.close();
    }
    private static int numResponse(int inputNum) {
    int divided, remainder, remainderAddition;
        remainderAddition =0;
        while(inputNum >10) {//change the while loop?
            divided = inputNum/10;
            remainder = inputNum%10;
            remainderAddition+=remainder;
            inputNum=divided;

    }
        return remainderAddition +inputNum;

    }


}
