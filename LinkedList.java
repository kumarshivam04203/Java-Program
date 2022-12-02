import java.util.*;
public class LinkedList{
    ////create first node
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //inisilige head and tail
    public static Node head;
    public static Node tail;
    public static int size;
////add 1st node 
    public void addFirst(int data){
        // step 1 -create a new node
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2- link
        newNode.next=head;
        //step 3- 
        head=newNode;
    }
    ////add last me node;
    public void addLast(int data){
        Node newNode= new Node (data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    //print the linkedlist
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    // perticular index par value ko add karna
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp= head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        // i= idx=1; temp->prev;
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
       
         if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
         }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

         }
         int val=head.data;
         head=head.next;
         size--;
         return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val =prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.add(2, 3);
        ll.print();
       // System.out.println(ll.size);
        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}