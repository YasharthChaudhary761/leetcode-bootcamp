package day2;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int size=sc.nextInt();
        int arr[]=new  int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int ans[]=new int[size];
        int i=0;
        System.out.println("Given array : ");
        for(int l=0;l<size;l++)
        {
            System.out.print(" "+ arr[l]);
        }
        for(int j=arr.length-1;j>=0;j--)
        {
            ans[i++]=arr[j];
        }
        System.out.println();

        System.out.println("Reversed array : ");

        for(int k=0;k<ans.length;k++)
        {
            System.out.print(" "+ans[k]);
        }
        sc.close();
    }
}
