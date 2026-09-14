public class ArrayInsertion {

    public static void main(String[] args) {
        int[] arr = new int[6];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int position = 2;
        int value = 25;

        for (int i = 4; i >= position; i--) {
            arr[i + 1] = arr[i];
        }

        arr[position] = value;

        for (int element : arr) {
            System.out.println(element);
        }
    }
}