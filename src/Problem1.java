import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {

    public void solution() {
        List<Double> list = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);
        System.out.println("## Sum of the numbers in given list ##");
        System.out.println("Enter numbers to list: (if you want to stop - write 0): ");
        double input = 0;
        do {
            try {
                input = Double.valueOf(userInput.nextLine());
                list.add(input);
            } catch (NumberFormatException nfe) {
                System.out.println("This is not a number!");
            }
        } while(input != 0);

        // Removing last, irrelevant number (0) from list
        list.remove(list.size()-1);
        System.out.println(list);

        // Result is rounded to two decimal places
        System.out.print("Sum from \"for\" loop: "); System.out.format("%.2f%n", problem1a(list));
        System.out.print("Sum from \"while\" loop: "); System.out.format("%.2f%n", problem1b(list));
        System.out.print("Sum from recursive function: "); System.out.format("%.2f%n", problem1c(list));
    }

    private double problem1a(List<Double> list) {
        double sum = 0;
        for(int i = 0; i < list.size(); i++)
            sum += list.get(i);
        return sum;
    }
    private double problem1b(List<Double> list) {
        double sum = 0;
        int count = 0;
        while(count < list.size()) {
            sum += list.get(count);
            count++;
        }
        return sum;
    }
    private double problem1c(List<Double> list) {
        if(list.size() == 0)
            return 0;
        else {
            double sum = 0;
            sum += list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return sum + problem1c(list);
        }
    }
}
