import java.util.*;
/**
 * Created by ryghi5 on 7/25/2016.
 */
public class CFProb4A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        if (w == 2 || w == 1 )
            System.out.println("NO");
        else if (w % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
