import java.util.Scanner;

public class Assignment

{

public static void main(String[]args)
        {
            Scanner s =new Scanner(System.in);//create a scanner
            String Fname, Streetaddress,email; // declaring variables
            int Houseno;// declaring variables



           System.out.print("Please Enter your Name:");
           Fname = s.next(); //get what the user types
           System.out.println("Hey " + Fname);//output user input

            System.out.print(" Please enter your House number:");
            Houseno = s.nextInt();// get what the user types
            System.out.println("My House Number is :" + Houseno);


            System.out.print(" Please enter your First line of Address:");
            Streetaddress = s.next();// get what the user types
            System.out.println("My Address is :"   +   Houseno    + " "  +  Streetaddress);

            System.out.print(" Please enter your email address?");
            email = s.next();//get user input
            System.out.println("My email address is :" + email);




        }

        }