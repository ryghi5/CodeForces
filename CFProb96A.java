import java.util.*;
/**
 * Created by ryghi5 on 8/23/2016.
 */
public class CFProb96A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String players = in.next();
        if(players.contains("0000000") || players.contains("1111111")){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
