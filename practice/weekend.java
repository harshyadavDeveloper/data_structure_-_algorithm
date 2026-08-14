class Main {
    public static void main(String[] args) {
        bubbleSort();

    }

    // Task 1: Given {7, 2, 9, 4, 1, 8}, sort it using any one sort of your choice,
    // then binary search for 9 and
    // print its index.
    public static void bubbleSort() {
        int[] arr = { 7, 2, 9, 4, 1, 8 };
        int n = arr.length;

        for (int pass = 0; pass < n - 1; pass++) {
            for (int j = 0; j < n - 1 - pass; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");

        }
        int tarInd = myBinarySearch(arr, 9);
        System.out.print("Found At: " + tarInd);
    }

    public static int myBinarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int foundIndex = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.print("Found Index at: " + mid);
                foundIndex = mid;
                return foundIndex;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }

        }

        if (foundIndex == -1) {
            System.out.println("Index Not Present");
        }
        return foundIndex;
    }

    // Task: 2 Implement selection sort, but modify it to find the maximum each pass instead of the minimum, 
    // building the sorted array in descending order.

}
