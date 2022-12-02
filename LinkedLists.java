public class LinkedLists{
    public static class Node{
        int data;
        Node next;
        public Node( int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!= null){
            System.out.print(temp.data +"->" );
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp= head;
        int i=0;
        while(i< idx-1){
            temp= temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val= head.data;
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
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
           prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp= head;
        int i=0;

        while (temp != null){
            if(temp.data==key){
                return i;
            }
            temp= temp.next;
            i++;
        }
        return -1;
    }
    
    public int helper(Node head, int key){
        if(head==null){
            return-1;
        }
        if(head.data==key){
            return 0;
        }
        int idx= helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr=tail=head;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev= curr;
            curr=next;
        }
        head=prev;
    }

    public void deletNthfromEnd(int n){
        int sz=0;
        Node temp=head;

        while(temp != null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int iToFind = sz-n;
        Node prev= head;
        
        while(i< iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head== null || head.next == null){
            return true;
        }

        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;

        while( curr != null){
            next= curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedLists ll= new LinkedLists();
    //     ll.print();
    //     //ll.head=new Node(1);
    //    // ll.head.next=new Node(2);
    //    ll.addFirst(2);
    //   // ll.print();
    //    ll.addFirst(1);
    //    //ll.print();
    //    ll.addLast(4);
    //    //ll.print();
    //    ll.addLast(5);
    //    ll.add(2, 3);
    //    ll.print();
    //    //System.out.println(ll.size);
    // //    ll.removeFirst();
    // //    ll.print();

    // //    ll.removeLast();
    // //    ll.print();
    // //    System.out.println(ll.size);
    //  //   System.out.println(ll.itrSearch(3));
    //    // System.out.println(ll.itrSearch(10));
    //   // System.out.println(ll.recSearch(3));
    //    //System.out.println(ll.recSearch(10));
    //    //ll.reverse();
    //    //ll.print();
    //    ll.deletNthfromEnd(3);
    //    ll.print();

         ll.addLast(1);
         ll.addLast(2);
         ll.addLast(2);
         ll.addLast(1);

         ll.print();

         System.out.println(ll.checkPalindrome());
    }

}