public class Addition {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 6, 7, 8 };
        int result[] = new int[arr1.length > arr2.length ? arr1.length : arr2.length];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = result.length - 1;
        int carry = 0;
        int sum = 0;
        while (k >= 0) {
            if (i >= 0 && j >= 0) {
                sum = arr1[i] + arr2[j] + carry;
            } else if (i >= 0 && j < 0) {
                sum = arr1[i] + carry;
            } else if (i <= 0 && j >= 0) {
                sum = arr2[j] + carry;
            }
            carry = sum / 10;
            sum = sum % 10;
            result[k] = sum;
            i--;
            j--;
            k--;
        }
        if (carry != 0) {
            System.out.print(carry);
        }
        for (int e : result) {
            System.out.print(e);
        }
    }
}
