// This question was asked in Google and Flipkart

public class AllocateBooks {
    public static int findMin(int[] a) {
        int min = a[0];
        for (int i : a)
            if (i < min)
                min = i;
        return min;
    }

    public static int findMax(int[] a) {
        int sum = 0;
        for (int i : a)
            sum += i;
        return sum;
    }

    public static boolean isPossibleAns(int[] a, int mid, int b) {
        int student = 1;
        int studentPageCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > mid)
                return false;
            if (studentPageCount + a[i] <= mid)
                studentPageCount += a[i];
            else {
                student++;
                if (student > b)
                    return false;
                studentPageCount = a[i];
            }
        }
        return true;
    }

    public static int books(int[] a, int b) {
        int min = findMin(a);
        int max = findMax(a);
        int result = -1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (isPossibleAns(a, mid, b)) {
                result = mid;
                max = mid - 1;
            } else
                min = mid + 1;
        }
        return result;
    }
}