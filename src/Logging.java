import java.util.Scanner;

public class Logging {

    public  static void main(String[]args) {


        Scanner input = new Scanner(System.in); //create scanner

        String username, password;  //declare variables

        System.out.print("Enter Username: ");
        username = input.nextLine(); //reader user input

        System.out.print("Enter Password:");
        password = input.nextLine();



        //Check if username is between 6 and 15 characters
        if(username.length() < 6 ||username.length()> 15)
          System.out.println("Username must be between 6 and 15 characters");



}


    }

