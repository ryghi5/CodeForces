import java.util.*;
/**
 * Created by ryghi5 on 8/17/2016.
 */
public class CFProb71A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        String[] words = new String[s];
        for (int i = 0; i < s; i++) words[i] = in.next();
        for (int i = 0; i < s; i++) {
            String prefix = words[i].substring(0, 1);
            String suffix = words[i].substring(words[i].length() - 1);
            if (words[i].length() > 10)
                System.out.println(prefix + (words[i].length() - 2) + suffix);
            else System.out.println(words[i]);
        }
    }
}
