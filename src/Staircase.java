import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        // #
        // ##
        // ###
        // ####
        // #####
        // ######
//            String hash=" ";
//            for (int i = 1 ; i <=4; i++){
//                hash = hash +  "#";
//                System.out.println(hash);
//            }
//     #
//    ##
//   ###
//  ####
// #####
//######
        int n = 4;
        String hash2="#";
        for (int i = 0 ; i <n; i++){
            System.out.printf("%"+ n + "s \n", hash2);
//            System.out.printf("%" + (n) + "s \n", hash2);
            hash2 += "#";
        }







    }
}
