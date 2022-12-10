import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice;

            System.out.print("SORTING ALGORITHMS:\n1-Bubble Sort\n2-Selection Sort\n3-Insertion Sort" +
                    "\n4-Shell Sort\n5-Merge Sort\n0-Exit\nChoose [1-5]: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BubbleSort bubbleSort = new BubbleSort();
                    bubbleSort.sort();
                    break;
                case 2:
                    SelectionSort selectionSort = new SelectionSort();
                    selectionSort.sort();
                    break;
                case 3:
                    InsertionSort insertionSort = new InsertionSort();
                    insertionSort.sort();
                    break;
                case 4:
                    ShellSort shellSort = new ShellSort();
                    shellSort.sort();
                    break;
                case 5:
                    MergeSort mergeSort = new MergeSort();
                    mergeSort.sort();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choose from the selection");
                    break;

            }
        }
    }
}