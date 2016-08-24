import java.util.*;
/**
 * Created by ryghi5 on 8/23/2016.
 */
public class CFProb118A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        in.close();
        String out = word.replaceAll("[AEIOUYaeiouy]", "");
        out = out.toLowerCase();
        out = out.replaceAll("", ".");
        out = out.substring(0, out.length() - 1);
        System.out.println(out);
    }
}
