import java.util.*;

public class ArrayProblems {
    public static void main(String[] args) {

        // Easy Level ----------------------------
        int[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println("1. Sum of all elements: " + sumArray(arr1));// 15

        int[] arr2 = { 10, 20, 30, 5, 15 };
        System.out.println("2. Largest element: " + findMax(arr2));

        int[] arr3 = { 8, 6, 2, 9, 3 };
        System.out.println("3. Smallest element: " + findMin(arr3));

        int[] arr4 = { 1, 2, 3, 4, 5, 6 };
        countEvenOdd(arr4);

        int[] arr5 = { 1, 2, 3, 4, 5 };
        System.out.println("5. Reverse array: " + Arrays.toString(reverseArray(arr5)));

        // Medium Level ----------------------------
        int[] arr6 = { 12, 35, 1, 10, 34, 1 };
        System.out.println("6. Second largest element: " + secondLargest(arr6));

        int[] arr7 = { 1, 2, 3, 4, 5 };
        int[] arr8 = { 5, 3, 2 };
        System.out.println("7. Is sorted? arr7=" + isSorted(arr7) + ", arr8=" + isSorted(arr8));

        int[] arr9 = { 1, 2, 3, 4, 5 };
        System.out.println("8. Rotate by 2: " + Arrays.toString(rotateArray(arr9, 2)));

        int[] arr10 = { 1, 1, 2, 2, 3, 4, 4 };
        System.out.println("9. Remove duplicates: " + Arrays.toString(removeDuplicates(arr10)));

        int[] arr11 = { 1, 2, 4, 5 };
        System.out.println("10. Missing number (1..5): " + findMissing(arr11, 5));

        // Advanced Level ----------------------------
        int[] arr12 = { 2, 7, 11, 15 };
        System.out.println("11. Pair with sum=9: " + Arrays.toString(findPairWithSum(arr12, 9)));

        int[] arr13 = { 3, 3, 4, 2, 3, 3, 5 };
        System.out.println("12. Majority element: " + majorityElement(arr13));

        int[] arr14 = { 1, 2, 3, 2, 4, 1 };
        System.out.println("13. Duplicates: " + findDuplicates(arr14));

        int[] arr15 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("14. Max Subarray Sum: " + maxSubArray(arr15));

        int[] arr16 = { 0, -1, 2, -3, 1 };
        System.out.println("15. Triplets with zero sum: " + findTriplets(arr16));
    }

    // Easy Level Methods ----------------------------

    static int sumArray(int[] arr) {
        int sum = 0;
        for (int val : arr)
            sum += val;
        return sum;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int val : arr)
            if (val > max)
                max = val;
        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int val : arr)
            if (val < min)
                min = val;
        return min;
    }

    static void countEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int val : arr) {
            if (val % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("4. Even=" + even + ", Odd=" + odd);
    }

    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++)
            rev[i] = arr[n - 1 - i];
        return rev;
    }

    // Medium Level Methods ----------------------------

    static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }

    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }
        return rotated;
    }

    static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    static int findMissing(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();
        return expectedSum - actualSum;
    }

    // Advanced Level Methods ----------------------------

    static int[] findPairWithSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                return new int[] { target - num, num };
            }
            set.add(num);
        }
        return new int[] { -1, -1 };
    }

    static int majorityElement(int[] arr) {
        int count = 0, candidate = 0;
        for (int num : arr) {
            if (count == 0)
                candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dup = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num))
                dup.add(num);
        }
        return new ArrayList<>(dup);
    }

    static int maxSubArray(int[] arr) {
        int maxSoFar = arr[0], currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }

    static List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    l++;
                    r--;
                } else if (sum < 0)
                    l++;
                else
                    r--;
            }
        }
        return result;
    }
}
