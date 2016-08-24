import java.util.*;
/**
 * Created by ryghi5 on 8/23/2016.
 */
public class CFProb112A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String first = in.next();
        String second = in.next();
        int result = first.compareToIgnoreCase(second);
        if(result > 0){
            result = 1;
        }
        else if(result < 0){
            result = -1;
        }
        else result = 0;
        System.out.println(result);
    }
}
