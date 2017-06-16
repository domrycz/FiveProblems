import java.util.Scanner;

public class Interface {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("This is my solution for five programming problems from shiftedup.com :)");
        System.out.println("(Check the link in README.MD)");

        String userChoice;
        do {
            System.out.println("\nChoose the problem:");
            System.out.println("(1) Sum of the numbers in given list");
            System.out.println("(2) Combining two lists (string & integer)");
            System.out.println("(3) 100 Fibonacci numbers");
            System.out.println("(4) The largest number");
            System.out.println("(5) \"Result is always 100\"");
            System.out.println("(x) Exit");

            System.out.print("Your choice: ");
            userChoice = userInput.nextLine();

            switch (userChoice) {
                case "1":
                    Problem1 problem1 = new Problem1();
                    problem1.solution();
                    break;
                case "2":
                    Problem2 problem2 = new Problem2();
                    problem2.solution();
                    break;
                case "3":
                    Problem3 problem3 = new Problem3();
                    problem3.solution();
                    break;
                case "4":
                    Problem4 problem4 = new Problem4();
                    problem4.solution();
                    break;
                case "5":
                    System.out.println("I'm sorry but I'm still not able to solve this problem :(");
                    break;
                case "x":
                    break;
                default:
                    System.out.println("Check available options one more time :)");
            }

        } while(!userChoice.equals("x"));
    }

}
