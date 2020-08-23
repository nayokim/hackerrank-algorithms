package CatAndMouse;

public class CatAndMouseI {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        //given two queries, if Cat A catchs = Cat A
        // Cat b = Cat B
        // same time, Mouse C
        if (Math.abs(z-x) > Math.abs(z-y) ){
            System.out.println("Cat B");
        } else if (Math.abs(x-z) == Math.abs(y-z)){
            System.out.println("Mouse C");
        } else{
            System.out.println("Cat A");
        }
    }
}
