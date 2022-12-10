import java.util.Scanner;

public class ShellSort {
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
        int increment = inputs.length / 2;
        while (increment >= 1) {
            for (int start = 0; start < increment; start++) {
                gapInsertionSort(inputs, start, increment, choice);
            }
            increment = increment / 2;
        }

        // Print the sorted list
        for (int i = 0; i < inputs.length; i++) {
            System.out.print(inputs[i] + ", ");
        }

        // Best and worst case:
        System.out.println("\n\nBest case: O(n log n)");
        System.out.println("Worst case: O(n^2)\n");

    }
    public static void gapInsertionSort(String[] array, int start, int gap, String choice) {
        for (int i = start + gap; i < array.length; i += gap) {
            String newElement = array[i];

            int j = 0;
            if (choice.equalsIgnoreCase("A")) {
                for (j = i; j >= gap && array[j - gap].compareTo(newElement) > 0; j -= gap) {
                    array[j] = array[j - gap];
                }
            }
            else if (choice.equalsIgnoreCase("D")) {
                for (j = i; j >= gap && array[j - gap].compareTo(newElement) < 0; j -= gap) {
                    array[j] = array[j - gap];
                }
            }

            array[j] = newElement;
        }
    }
}
