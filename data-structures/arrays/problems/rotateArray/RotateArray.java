package rotateArray;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int firstElement = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = firstElement;

        for (int element : arr) {
            System.out.println(element);
        }
    }
}