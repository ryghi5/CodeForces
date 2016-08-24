import java.util.*;
/**
 * Created by ryghi5 on 8/23/2016.
 */
public class CFProb282A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] op = new String[num];
        int count = 0;
        in.nextLine();
        for(int i = 0; i < num; i++) op[i] = in.nextLine();
        for(int i = 0; i < num; i++) {
            if(op[i].contains("++")){
                count++;
            }
            else if(op[i].contains("--")){
                count--;
            }
        }
        System.out.println(count);
    }
}
