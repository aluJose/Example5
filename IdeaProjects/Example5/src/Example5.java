import java.util.Scanner;

public class Example5 {
    public static void main (String argv[]){
        //Declaring variables
        double r;
        final double PI = 3.14;
        double circleLength;
        double circleArea;

        //Enter the value
        System.out.println("Enter the radius of the circle: ");

        //Reading value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        r = inputValue.nextFloat();

        //Operations
        circleLength = 2 * PI* r;
        circleArea = PI * r * r;

        //Show the results on the screen
        System.out.println("The length of the circle is " + circleLength);
        System.out.println("The Area of the circle is " + circleArea);




    }
}
