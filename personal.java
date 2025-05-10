// Abstract class defining the blueprint
abstract class Sorter {
    // Abstract method: sorting logic to be implemented by subclasses
    abstract void sort(int[] array);

    // Concrete method: displays the array
    public void display(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// Concrete class implementing bubble sort
class BubbleSort extends Sorter {
    @Override
    void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

// Main class to execute the program
public class personal {
    public static void main(String[] args) {
        int[] data = {45, 12, 89, 33, 10};

        // Using abstraction: Sorter is the abstract reference
        Sorter sorter = new BubbleSort();

        System.out.println("Original Array:");
        sorter.display(data);

        // Sorting the array
        sorter.sort(data);

        System.out.println("Sorted Array:");
        sorter.display(data);
    }
}
