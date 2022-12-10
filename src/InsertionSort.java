import java.util.Scanner;

public class InsertionSort {
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
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < inputs.length;
             firstUnsortedIndex++) {
            String newElement = inputs[firstUnsortedIndex];

            int i = 0;
            if (choice.equalsIgnoreCase("A")) {
                for (i = firstUnsortedIndex; i > 0 && inputs[i - 1].compareTo(newElement) > 0; i--) {
                    inputs[i] = inputs[i - 1];
                }
            }
            else if (choice.equalsIgnoreCase("D")) {
                for (i = firstUnsortedIndex; i > 0 && inputs[i - 1].compareTo(newElement) < 0; i--) {
                    inputs[i] = inputs[i - 1];
                }
            }

            inputs[i] = newElement;
        }

        // Print the sorted list
        for (int i = 0; i < inputs.length; i++) {
            System.out.print(inputs[i] + ", ");
        }

        // Best and worst case:
        System.out.println("\n\nBest case: O(n)");
        System.out.println("Worst case: O(n^2)\n");

    }
}
