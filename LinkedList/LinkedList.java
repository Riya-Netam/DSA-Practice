public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){

        //step1---create new node
        Node newNode=new Node(data);
        size++;
        
        if(head==null){
            head=tail=newNode;
            return;
        }

        //step2---newNode next=head
        newNode.next=head; //link

        //step3---head=newNode
        head=newNode; 
    }

    public void addLast(int data){
        //step1---create newNode
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }

        //step2---tail.next==newNode
        tail.next=newNode;

        //step---3
        tail=newNode;
    }

    public void printLinkedList(){  //O(n)
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
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
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;

        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }

        int val=prev.next.data;   //tail.data
        prev.next=null;
        tail=prev;
        size--;

        return val;
    }

    public static int searchIterative(int key){
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }

        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }

        return idx+1;
    }

    public int searchRecursive(int key){
        return helper(head,key);
    }

    public void reverse(){ //O(n)
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void deleteNthFromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }

        //sz-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!= null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next;  //+2
        }

        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        //step1--->find mid
        Node miNode=findMid(head);

        //step2--->reverse 2nd half
        Node prev=null;
        Node curr=miNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;
        Node left=head;

        //step3--->check left half & right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }

        return true;
    }

    public static boolean isCycle(){//Floyd's CFA
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
            return true;
        }

        }
        return false;
    }

    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }

        if(cycle==false){
            return;
        }

        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        prev.next=null;
    }

    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!= null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;

        while(head1 != null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }

        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid=getMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);

        return merge(newLeft,newRight);
    }

    public void zigZag(){
        //find mid
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while(curr!=null) {
            next=curr.next;
            curr.next=prev;  //null
            prev=curr;
            curr=next;

        }

        Node left =head;
        Node right=prev;
        Node nextL, nextR;

        //alt merge
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }

    public static void main(String args []){
        LinkedList ll=new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printLinkedList();

        // ll.head=ll.mergeSort(ll.head);
        // ll.printLinkedList();

        ll.zigZag();
        ll.printLinkedList();
        
    }
}