package BonAppetit;

public class BonAppetitI {
    public static void main(String[] args) {
        int k = 1;
        int n = 4;
        int b = 12;
        int [] bill = {3,10,2,9};



        /*
        anna declines to eat k= bill[2] which cots $6
        total = $24
        evenly : 12
        ----
        Anna : 7
        Brian : 17
         */
        int total = 0;
        for (int i =0; i < bill.length; i++){
            total += bill[i];
        }
        int splitEvenly = total/2;
        int annaResponsible = (total - bill[k])/2;
        if (annaResponsible == b) {
            System.out.println("Bon Appetit");
        } else {
            int refund = b - annaResponsible;
            System.out.println(refund);
        }
        //
    }
}
