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
        String strings[] = intToString(integers);

        System.out.println("The largest possible number is: " + makeNumber(strings));
    }

    private String[] intToString(Integer[] ints) {
        String strings[] = new String[ints.length];
        int count = 0;
        for(int i = ints.length - 1; i >= 0; i--) {
            strings[i] = ints[count].toString();
            count++;
        }
        return strings;
    }

    private String makeNumber(String[] nums) {
        String number = "";
        for(Integer i = 9; i > -1; i--) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[j].charAt(0) == i.toString().charAt(0))
                    number += nums[j];
            }
        }
        return number;
    }
}
