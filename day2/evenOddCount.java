package day2;

import java.util.*;
public class evenOddCount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=n;i++)
        {
            System.out.println("Enter number :");
            arr[i]=sc.nextInt();
        }

        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0) continue;
            if(arr[i]%2==0) evenCount++;
            else oddCount++;
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}