package StressTests;

import java.util.Scanner;

public class StressTest1 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        //calculateHigherNumber(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(calculateLowerNumber(number1,number2,number3));
        System.out.println(number1 + "" + number2 + "" + number3);
    }

    static int calculateLowerNumber(int number1, int number2, int number3){
        if (number2 < number1){
            number1 = number2;
        } else if (number3 < number1){
            number1 = number3;
        }
        return number1;
    }




}
