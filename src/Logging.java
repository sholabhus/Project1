
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logging {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); //create scanner

        String username, password;  //declare variables

        System.out.print("Enter Username: ");
        username = input.nextLine(); //reader user input

        System.out.print("Enter Password:");
        password = input.nextLine();


        //Username validity
        int Uvalid = 0;
        //Password validity
        int Pvalid = 0;

        //Check if username is between 6 and 15 characters
        if (username.length() < 6 || username.length() > 15) {
            System.out.println("Username must be between 6 and 15 characters");
            Uvalid = Uvalid - 1;
        }

            // check if password is shorter than 8 characters but not exceed 256
            if (password.length() < 8) {
                System.out.println("password is too short");
                Pvalid = Pvalid - 1;
            } else if (password.length() > 256) {
                System.out.println("password must not exceed 256");
                Pvalid = Pvalid - 1;
            }

            //password cannot be the same as username
            if (password.equals(username)) {
                System.out.println("password can't be the same as username");
                Pvalid = Pvalid - 1;
            }

            //  No parentheses for password or username
            if (password.contains("{") || password.contains("}") || password.contains("[") || password.contains("]") || password.contains("(") || password.contains(")") || (username.contains("{") || username.contains("}") || username.contains("[") || username.contains("]") || username.contains("(") || username.contains(")"))) {
                System.out.print("password or username must not contain parenthesis");
                Pvalid = Pvalid - 1;
                Uvalid = Uvalid - 1;
            }

            //No whitespace for password or username
        if (password.contains(" ") || username.contains(" ")) {
            System.out.print("password or username must not contain whitespace");
            Pvalid = Pvalid - 1;
            Uvalid = Uvalid - 1;
        }

        String regex = "^[a-zA-Z]*$";
        boolean result = username.matches(regex);
        if(result) {

            System.out.print("is valid");
        }  else {
            System.out.print("is not valid");

    }



            //check if Uvalid is equal to 0
            //every time the username is invalid, "Uvalid" will decrement by 1
        //therefore if "Uvalid" has not been decremented, the it will = 0 and username is valid
            if (Uvalid == 0) {
                System.out.println("Username is Valid");
            }

        //check if Pvalid is equal to 0
        //every time the username is invalid, "Pvalid" will decrement by 1
        //therefore if "Pvalid" has not been decremented, the it will = 0 and username is valid
        if (Pvalid == 0) {
            System.out.println("Password is Valid");
        }

        }
    }



























