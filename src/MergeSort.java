import java.util.Scanner;

public class MergeSort {
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
        String[] tempArray = new String[inputs.length];
        mergeSort(inputs, tempArray, 0, inputs.length - 1, choice);

        // Print the sorted list
        for (int i = 0; i < inputs.length; i++) {
            System.out.print(inputs[i] + ", ");
        }

        // Best and worst case:
        System.out.println("\n\nBest case: O(n log n)");
        System.out.println("Worst case: O(n log n)\n");

    }
    public static void mergeSort(String[] array, String[] tempArray, int lowerIndex, int upperIndex, String choice) {
        if (lowerIndex >= upperIndex) {
            return;
        }
        int middle = (lowerIndex + upperIndex) / 2;
        mergeSort(array, tempArray, lowerIndex, middle, choice);
        mergeSort(array, tempArray, middle + 1, upperIndex, choice);
        merge(array, tempArray, lowerIndex, middle, upperIndex, choice);
    }
    public static void merge(String[] array, String[] tempArray, int lowerIndex, int middle, int upperIndex, String choice) {
        for (int i = lowerIndex; i <= upperIndex; i++) {
            tempArray[i] = array[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= upperIndex) {
            if (choice.equalsIgnoreCase("A")) {
                if (tempArray[i].compareTo(tempArray[j]) <= 0) {
                    array[k] = tempArray[i];
                    i++;
                }
                else {
                    array[k] = tempArray[j];
                    j++;
                }
            }
            else if (choice.equalsIgnoreCase("D")) {
                if (tempArray[i].compareTo(tempArray[j]) >= 0) {
                    array[k] = tempArray[i];
                    i++;
                }
                else {
                    array[k] = tempArray[j];
                    j++;
                }
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
}
