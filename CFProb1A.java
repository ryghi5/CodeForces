import java.util.*;
/**
 * Created by ryghi5 on 7/24/2016.
 */
public class CFProb1A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n, m, a;
        n = s.nextInt();
        m = s.nextInt();
        a = s.nextInt();

        long tiles1 = n / a;
        long tiles2 = m / a;

        if (n % a != 0) tiles1++;
        if (m % a != 0) tiles2++;

        long result = tiles1 * tiles2;
        System.out.println(result);
    }
}
