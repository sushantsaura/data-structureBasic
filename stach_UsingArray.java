import java.util.*;
import java.util.Scanner;
public class stach_UsingArray{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int top=-1;
        int element=0;
        int ch,i,p=10;
        int arr[]=new int[20];
        while(p!=0){
            System.out.println("2.push element");
            System.out.println("3.pop element");
            System.out.println("4.display");
            System.out.println("5.exit");
            System.out.println("enter your choice");
            ch=sc.nextInt();
            switch(ch){
                case 2 :
                    System.out.println("enter the element to insert- ");
                    element=sc.nextInt();
                    top++;
                    arr[top]=element;
                    break;
                case 3 :
                    System.out.println("deleted element will be- "+arr[top]);
                    top--;
                    break;
                case 4 :
                    for(i=top ; i>=0 ; i--){
                       System.out.print(arr[i]+"->");
                    }
                    break;
                case 5 :
                    p=0;
                    break;
                default :
                      System.out.println("invalid input");
            }
            
        }
    }
}