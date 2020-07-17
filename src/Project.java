import java.util.Scanner;

public class Project {
    public static void main(String[] args) {

        int x , i; // declare variables
        Scanner sca = new Scanner(System.in);// create scanner object to get user input
        System.out.print("Please Enter a Number:");// Enter a number
        x = sca.nextInt();  //read user input

        for (i = 1; i <= x; i++) ; //iteration
        {
            if (i % 2 == 0) ;
            {
                System.out.println(i);// print output
            }

        }
    }
}










