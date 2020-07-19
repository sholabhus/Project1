import java.util.Scanner;

public class Message {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);//create a scanner object

        String Fname, Lname; //declare variables

        System.out.print("What is your Firstname? :"  );//Enter Firstname and press Enter
        Fname = sc.next(); //read user input for Firstname
        System.out.println(Fname);//output user

        System.out.print("What is your Lastname? :" );//Enter Lastname and press Enter
        Lname = sc.next();//read user input for Lastname
        System.out.println(Lname);//output user


        System.out.println("Hey" + " " + " " + Fname + " " + "" + Lname);// output Firstname and Lastname

        sc.close();//close scanner




    }
}
