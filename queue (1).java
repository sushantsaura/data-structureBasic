import java.util.*;
import java.util.Scanner;
public class queue{
    public class node {
        int data;
        node head;
        node tail;
        node(){
            return;
        }
        node(int data){
            this.data=data;
        }
    }
    node head=null;
    node tail=null;
    node next;
    void insert(int val){
        node newnode = new node(val);
      
        tail.next=newnode;
        tail=newnode;
    }
    void delete(){
        if(head==null){
            tail=null;
        }
        head=head.next;
    }
    void diplay(){
        node temp=new node();
        while(temp!=null){
            System.out.println(temp.data+"<--");
        }
    }
    public void main(String[] args){
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
        }
    }
}
}