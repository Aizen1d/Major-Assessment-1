import java.util.Scanner;

public class BubbleSort {
    public void sort() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[6];
        String choice;

        System.out.println("What are the data you want to insert?");

        for (int i = 0; i < 6; i++) {
            System.out.print("Input " + (i + 1) + ": ");
            inputs[i] = scanner.nextLine();
        }

        System.out.print("\nSelect 'A' - Ascending, 'D' - Descending: ");
        choice = scanner.nextLine();

        // Sort
        for (int lastUnsortedIndex = inputs.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {

                if (choice.equalsIgnoreCase("A")) {
                    if (inputs[i].compareTo(inputs[i + 1]) > 0) {
                        swap(inputs, i, i + 1);
                    }
                }
                else if (choice.equalsIgnoreCase("D")) {
                    if (inputs[i].compareTo(inputs[i + 1]) < 0) {
                        swap(inputs, i, i + 1);
                    }
                }

            }
        }

        // Print the sorted list
        for (int i = 0; i < inputs.length; i++) {
            System.out.print(inputs[i] + ", ");
        }

        // Best and worst case:
        System.out.println("\n\nBest case: O(n)");
        System.out.println("Worst case: O(n^2)\n");

    }
    public static void swap(String[] array, int i, int j) {
        if (i == j) {
            return;
        }
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
