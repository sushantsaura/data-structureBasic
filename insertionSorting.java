package com.company;
import java.util.Scanner;

public class insertionSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int array[]=new int[100];
        System.out.println("enter the number of element in array : ");
        int n = sc.nextInt();
        System.out.println("enter the elements of array : ");
        for(int i=0 ; i<n ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("array before sorting : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(array[i]+" ");
        }
        //insertion sort program
        for(int i=1 ; i<n ; i++){
            int key = array[i];
            int j=i-1;
            while((j>=0)&&(array[j]>key)){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
        System.out.println("array after sorting : ");
        for(int s=0 ; s<n ; s++){
            System.out.print(array[s]+" ");
        }
    }
}
