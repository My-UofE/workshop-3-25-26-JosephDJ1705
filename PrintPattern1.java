public class PrintPattern1 {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);

        System.out.println("Enter the size: " + size);

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println("");

        }




    }

}