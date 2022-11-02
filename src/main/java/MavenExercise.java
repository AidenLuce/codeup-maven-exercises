


import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String input = scanner.nextLine();
        boolean check = StringUtils.isNumeric(input);
        if (!check){
            System.out.printf("\"%s\" is not a number\n",input);
            System.out.printf("Flipped case: %s\n",StringUtils.swapCase(input));
            System.out.printf("Reversed: %s\n", StringUtils.reverse(input));
        }
    }
}
