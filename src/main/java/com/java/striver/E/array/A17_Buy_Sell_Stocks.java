package com.java.striver.E.array;

public class A17_Buy_Sell_Stocks {

    public static void main(String[] args)
    {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] arr)
    {
        int profit = 0;
        int mini = arr[0];  //7
        for (int i=1; i<arr.length;i++)// 7,1,5,3,6,4
        {
            int cost = arr[i]-mini; //-6 4

            if(cost >profit)
            {
                profit=cost; //4
            }
            if(arr[i]<mini)
            {
                mini=arr[i];  //1
            }
        }
        return profit;
    }
}
