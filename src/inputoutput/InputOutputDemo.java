package inputoutput;

import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Input value: " +input);
        String inputString = sc.nextLine();
        System.out.println("Input String value:" +inputString);
    }

}
