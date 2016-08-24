
import java.util.*;
/**
 * Created by ryghi5 on 8/23/2016.
 */
public class CFProb231A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int problems = in.nextInt();
        int num = 0;
        for(int i = 0; i < problems; i++){
            int p = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            if(p+y+z > 1){
                num++;
            }
        }
        System.out.println(num);
    }

}
