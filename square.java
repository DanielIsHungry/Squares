import java.util.Scanner; // Import scanner module.
public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates scanner object.

        System.out.println("Enter number of rows: "); // Asks for 2 inputs, and assigns to variables "rows" and "columns".
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = scanner.nextInt();

        for (int y = 1; y <= columns; y++) {  // For every row
            for (int x = 1; x <= rows; x++) { // For every column
                System.out.print("*");        // Prints asterisk ("*").
            }
            System.out.println();             // Creates newline.
        }

        scanner.close(); // Closes scanner object to prevent recourse leakage.
    }
}
