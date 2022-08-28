import java.util.*;
import java.util.Scanner;
public class Queue{
    static int queu[];
     static int size,frant,rear;
     Queue(){
         return;
     }
     
    Queue(int data){
        queu=new int[data];
     int frant=0,rear=0;
        size=data;
    }
    static void enqueue(int val){
       System.out.println("enter element to insert");
        queu[rear]=val;
        rear++;
        return;
    }
    static void dequeue(){
        if(rear<0){
           System.out.println("queue is empty");
           return;
        }
        else{
            for(int i=0 ; i<rear-1 ; i++){
                queu[i]=queu[i+1];
            }
            if(rear<size){
                queu[rear]=0;
            }
            rear--;
        }
    }
    static void display(){
        if(rear<0){
            System.out.println("queue is empty");
            return;
        }
        for(int i= frant ; i <rear ;i++){
            System.out.print(queu[i]+"<--");
        }
        System.out.println();
        return;
    }
    static void peek(){
            System.out.println("element at frant is : "+queu[frant]);
        return;
    }
    public static void main(String[] args){
        Queue q = new Queue();
        Scanner sc=new Scanner(System.in);
        int ch=0,p=10;
        while(p!=0){
            System.out.println("enter your choice");
            System.out.println("\n2.enquque \n 3.dequeue \n 4. display \n.5 peek \n 6.exit");
            ch=sc.nextInt();
            switch(ch){
                case 2 :
             int d=sc.nextInt();
                q.enqueue(d);
                break;
                case 3 :
                    q.dequeue();
                    break;
                case 4 :
                    q.display();
                    break;
                case 5 :
                    q.peek();
                    break;
                case 6 :
                    p=0;
                    break;
                default :
                 System.out.println("invalid input");
            }
            
    }
}
}