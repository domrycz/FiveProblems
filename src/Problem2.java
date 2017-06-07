import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {

    public void solution() {
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        System.out.println("## Combining two lists (string & integer) by alternatingly taking elements ##");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter four \"strings\": ");

        for(int i = 0; i < 4; i++) {
            strings.add(userInput.nextLine());
        }

        System.out.println("Enter four integers: ");

        do {
            try {
                integers.add(Integer.valueOf(userInput.nextLine()));
            } catch (NumberFormatException nfe) {
                System.out.println("This is not an integer!");
            }
        } while (integers.size() < 4);

        System.out.println("There is a combined list: ");
        System.out.println(combine(integers, strings));
    }
    private List<String> combine(List<Integer> integers, List<String> strings) {
        List<String> combined = new ArrayList<>();

        for(int i = 0; i < strings.size(); i++) {
            combined.add(strings.get(i));
            combined.add(integers.get(i).toString());
        }

        return combined;
    }
}
