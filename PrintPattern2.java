import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //creates a scanner object
        int size = 0;

        while (true) { //runs until user enters valid input
            System.out.print("Enter a size between 1 and 5: ");
            size = in.nextInt(); //user input is taken as an integer
            if (size >= 1 && size <= 5) { //ensures input is between range. If it is loop breaks and goes to next step
                break;
            } else {
                System.out.println((size < 1)? "Too small!" : "Too big!");
            }
        }
        // Aided during this section
        int OverallRows = 2 * size; //this is for the number of rows. each integer between 1 and 5 outputs 2 * integer rows
        for (int row = 1; row <= OverallRows; row++) { 
            int start = Math.min(row, OverallRows - row + 1); //ensures total number of rows are printed symmetrically
        //for the code above, approaching towards the centre the value decreases
            for (int col = start; col < start + size; col++) {
            System.out.print(col); //prints columns between start and start + size
            }
            for (int col = start + size - 1; col >= start; col--) { //decreasing sequence for each row. Starts from the middle last number and goes towards start
            System.out.print(col);
            }
        System.out.println();//simply ensures rows are printed separately

        }
    }
}