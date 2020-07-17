import java.util.Scanner;

    public class Detail

    {

        public static void main(String[]args)
        {
            Scanner s =new Scanner(System.in);//create a scanner object
            String Fname, Streetaddress,email; // declaring variables
            int Houseno;// declaring variable


            System.out.print("Please Enter your Name:");// Enter name and press Enter
            Fname = s.next(); //read user input
            System.out.println("Hey " + Fname);//output user

            System.out.print( "\n" );// leave a blank line

            System.out.print("Please enter your House number:");// Enter house number and press Enter
            Houseno = s.nextInt();// read user input
            System.out.println("My House Number is :" + Houseno);// output user input


            System.out.print("Please enter your First line of Address:"); // Enter first line of Address press Enter
            Streetaddress = s.next();// read user input
            System.out.println("My Address is :"   +   Houseno    + " "  +  Streetaddress);// output user input

            System.out.print( "\n" ); // leave a blank line

            System.out.print("Please enter your email address?");// Enter email address and press Enter
            email = s.next();//read user input
            System.out.println("My email address is :" + email); //output user input

            System.out.print("Thank you");





        }

    }

