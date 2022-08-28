import java.util.*;
import java.util.Scanner;

public class stacklist{
    public class Node{
    int data ;
    Node head;
    Node next;
    Node(){
        return;
    }
    Node(int data){
        data=this.data;
    }
    int size=0;
    int p=10;
void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            return;
        }
        if(node==null){
            System.out.println("overflow");
            return;
        }
        node.next=head;
        head=node;
        size++;
    }
void pop(){
        if(head==null){
            System.out.println("stack empty");
            return;
        }
        System.out.println("poped element will be - "+head.data);
        head=head.next;
        size--;
    }
 void peek(){
        if(head==null){
            System.out.println("stack em=mpty");
            return;
        }
        System.out.println("element at the top of stack is : "+head.data);
        
        
    }
 void display(){
        Node temp=new Node();
        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
        }
    }
 void exit(){
        p=0;
    }
    public void main(String[] args){
           stacklist sk =new stacklist();
        Scanner sc=new Scanner(System.in);
     
        int ch=0;
        
        while(p!=0){
            System.out.println("2.insert");
             System.out.println("3.delete");
              System.out.println("4.peek");
               System.out.println("5.display");
                System.out.println("6.exit");
                ch=sc.nextInt();
                switch(ch){
                    case 2 :
                        int d=sc.nextInt();
                        sk.insert(d);
                        break;
                    case 3 :
                        sk.pop();
                        break;
                    case 4 :
                        sk.peek();
                        break;
                    case 5 :
                        sk.display();
                        break;
                    case 6 :
                        sk.exit();
                        break;
                    default :
                       System.out.println("invalid input");
                }
        }
    }
}
}