package linear.search.activity;

public class LinearSearchActivity {
    public static void main(String[] args) {
        int[] inventory = {10, 20, 30, 40, 50};
        int elementToInsert = 25;
        int insertIndex = 2;
        inventory = insertElement(inventory, elementToInsert, insertIndex);
        System.out.println("After insertion:");
        System.out.println("Array: " + java.util.Arrays.toString(inventory));

        int target = 30;
        int index = linearSearch(inventory, target);
        System.out.println("Linear Search Result:");
        System.out.println("Index of " + target + ": " + index);
    }   
    public static int[] insertElement(int[] array, int element, int index) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        int[] newArray = new int[array.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[i] = element;
            } else {
                newArray[i] = array[j++];
            }
        }
        return newArray;
    }
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
