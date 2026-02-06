import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter your name: ");

        // Read in line from standard input
        String name = in.nextLine();

        System.out.println("Hi " + name + "!");


        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input

        in.nextLine(); //Added line. This clears any leftovers from the startNum input
        
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("You entered: " + startNum + " and " + endNum);
        
        System.out.println("Sum of squares from " + startNum + " and " + endNum + ":");

        int sum = 0;
        int i = startNum;
        int count = 0;

        while (i <= endNum) {
            sum += i * i;
            count++;
            i++;
        }
        double average = (double) sum / count;
        System.out.println(average);
    }
}