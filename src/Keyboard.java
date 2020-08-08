import java.util.Scanner;

public class Keyboard {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double avg;
        System.out.println("Enter any number");
        int num = scan.nextInt();//methods reads the number provided using keyboard


        for (int i = 0; i < 999; i++) {
            avg = (double) num / i;


        }
    }
}