import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {

    public void solution() {
        List<Integer> integers = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);
        System.out.println("## Creating the largest possible number ##");
        System.out.println("Enter four integers to the list: ");

        do {
            try {
                integers.add(Integer.valueOf(userInput.nextLine()));
            } catch (NumberFormatException nfe) {
                System.out.println("This is not an integer!");
            }
        } while(integers.size() < 4);

        System.out.println("Your list: " + integers + "\n");
        String result = "";

        List<String> intToString = new ArrayList<>();
        for(int i = 0; i < integers.size(); i++) {
            intToString.add(integers.get(i).toString());
        }

        for(Integer i = 9; i > -1; i--) {
            for(int j = 0; j < intToString.size(); j++) {
                if(intToString.get(j).equals(i.toString()))
                    result = result + intToString.get(j);
            }
        }

        System.out.println("The largest number: " + result);
    }
}
