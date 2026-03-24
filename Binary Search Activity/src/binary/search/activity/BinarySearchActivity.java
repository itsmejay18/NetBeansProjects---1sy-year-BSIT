package binary.search.activity;

public class BinarySearchActivity {
    public static void main(String[] args) {
        int[] employeeIds = {1, 3, 5, 7, 7, 9, 10};
        int idToDelete = 7;

        employeeIds = deleteElement(employeeIds, idToDelete);
        System.out.println("Final Elements after Deletion:");
        System.out.println("Array: " + java.util.Arrays.toString(employeeIds));
    }

    public static int[] deleteElement(int[] array, int target) {
        int index = binarySearch(array, target);
        if (index == -1) {
            return array;
        }
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
