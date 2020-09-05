
import java.util.Scanner;

public class calculate {

    public static void main (String[]args) {


        Scanner scan = new Scanner(System.in);  //create scanner object to get user input
        System.out.print("Enter width of the windows in meters :");// Output user input
        double width = scan.nextDouble(); // reads a double value from the user


        System.out.print("Enter height of the windows in meters:"); //output user input
        double height = scan.nextDouble();//reads a double value from the user

        double area = width * height;// To find area
        double perimeter = width + width + height + height;// find perimeter

        if (width < 0.5 || width > 3.5) {     // width less than or greater than width
            System.out.println("Window width must be between 0.5 and 3.5"); // print output
        }

        if (height < 0.5 || height > 2.0) {  // height less than  or greater than height
            System.out.println("Window height must be between 0.5 and 2.0");  //print output
        }

        double feet = perimeter * 3.25; // converting to feet
        int first = (int) feet; // converting to int

        double decimal = feet - first;//finds the number after decimal point

        int inches = (int) (12 * decimal);// convert the number after decimal point to inches

        // System.out.print(first + " feet " + inches + " inches");


        if (inches < 1) {  // inches less than 1
            System.out.print("You will need " + area + " meters squared of glass and " + first + " feet of wood. "); //print output

        } else {

            System.out.print("You will need " + area + " meters squared of glass and " + first + " feet " + inches + " inches of wood. ");//print output

        }
    }
    }









