package com.company;
import java.util.Scanner;
public class datastructue_practice_array {

    public static void main(String[] args){

         int i=0;
         int[] ar={5,7,3,2,9};
         int n=5;
         /*        ------> reversing an array <---------
         int j=n;
         int[] temp=new int[5];
         for(int k=0 ; k<n; k++){
             temp[j-1]=ar[k];
             j--;
         }

        for(int m=0 ; m<n ; m++){
            System.out.println(temp[m]);
        }


 */
      /*  ------->maximum and minimum index in array <---------

        int min=ar[i];
        for(i=0 ; i<n ; i++){
          if(ar[i]<min){
              min=ar[i];
          }
        }
        System.out.println(min);

        int max=ar[0];
        for(int j=0 ; j<ar.length ; j++){
            if(ar[j]>max){
                max=ar[j];
            }
        }
        System.out.println(max);

       */
/*    --------->kth min and max position<----------
        for(i=0 ; i<n; i++){
            for(int j=i+1 ; j<n ; j++){
                if(ar[i]>ar[j]){
                        int temp=ar[i];
                        ar[i]=ar[j];
                        ar[j]=temp;
                }
            }
        }
        int k=4;
        System.out.println("enter the kth element in "+ar[k-1]);

 */

    }
}
