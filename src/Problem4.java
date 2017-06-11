import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {

    public void solution() {
        Integer integers[] = new Integer[4];
        Scanner userInput = new Scanner(System.in);
        System.out.println("## Creating the largest possible number ##");
        System.out.println("Enter four integers to the list: ");

        for(int i = 0; i < integers.length; i++) {
            try {
                integers[i] = Integer.valueOf(userInput.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("This is not an integer!");
            }
        }
        System.out.println("Your numbers: " + Arrays.toString(integers) + "\n");
        Arrays.sort(integers);
        String result = "";
        String strings[] = new String[4];

        int count = 0;
        for(int i = strings.length - 1; i >= 0; i--) {
            strings[i] = integers[count].toString();
            count++;
        }

        for(Integer i = 9; i > -1; i--) {
            for(int j = 0; j < strings.length; j++) {
                if(strings[j].charAt(0) == i.toString().charAt(0))
                    result += strings[j];
            }
        }

        System.out.println("The largest possible number is: " + result);
    }
}
