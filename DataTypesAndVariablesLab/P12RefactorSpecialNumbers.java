package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= number; i++) {
           int current = i;
           int sum = 0;
           boolean isSpecialNum = false;
            while (current > 0) {
                sum = sum + (current % 10);
                current = current / 10;

            }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);

            if (isSpecialNum){
                System.out.printf("%d -> True%n", i);
            }else {
                System.out.printf("%d -> False%n", i);
            }

        }
    }
}
