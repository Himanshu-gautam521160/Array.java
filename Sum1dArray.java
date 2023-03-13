import java.util.ArrayList;

public class Sum1dArray {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int sum = 0;
        // for (int i = 0; i < a.length; i++) {
        // sum = sum + a[i];
        // System.out.print(sum + " ");
        // }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            list.add(sum);
        }
        System.out.print(list);
    }
}
