import java.util.*;
/**
 * Created by ryghi5 on 8/23/2016.
 */
public class CFProb158A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int round = 0;
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) scores[i] = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (scores[i] > 0 && scores[i] >= scores[k - 1]) {
                round++;
            }
        }
        System.out.println(round);
    }
}
