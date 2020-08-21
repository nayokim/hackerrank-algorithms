package ElectronicsShop;

public class ElectronicShopIII {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxMoneySpent=-1;
        for(int i=0;i<keyboards.length;i++)
        {
            for(int j=0;j<drives.length;j++)
            {
                int temp=keyboards[i]+drives[j];
                if(temp>maxMoneySpent&&temp<=b)
                    maxMoneySpent=temp;
            }
        }
        return maxMoneySpent;
    }

    public static void main(String[] args) {

    }
}
