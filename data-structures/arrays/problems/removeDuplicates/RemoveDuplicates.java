package removeDuplicates;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        int uniqueIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }

        for (int i = 0; i <= uniqueIndex; i++) {
            System.out.println(arr[i]);
        }
    }
}