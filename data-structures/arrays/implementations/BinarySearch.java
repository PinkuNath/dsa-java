public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int target = 40;
        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(index);
    }
}