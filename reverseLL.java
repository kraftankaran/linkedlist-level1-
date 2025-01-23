import java.util.*;


public class reverseLL {
    public class linklist {

        public static class Node {
            int data;
            Node next;
    
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        public static class LinkedList {
            Node head;
            Node tail;
             public int size=0;
    
            public LinkedList() {
                this.head = null;
                this.tail = null;
                this.size = 0;
            }
    
            public void addLast(int v) {
                Node temp = new Node(v);
                if (size == 0) {
                    head = tail = temp;
                } else {
                    tail.next = temp;
                    tail = temp;
                }
                size++;
            }
    
            public int size() {
                return size;
            }
    
            public void display() {
                if (size == 0) {
                    System.out.println("Empty linked list");
                    return;
                }
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " -> ");
                    temp = temp.next;
                }
                System.out.println("null");
            }
    
            public void removeFirst() {
                if (size == 0) {
                    System.out.println("Empty linked list");
                } else {
                    head = head.next;
                    size--;
                    if (size == 0) {
                        tail = null;
                    }
                }
            }
    
            public int getFirst() {
                if (size == 0) {
                    System.out.println("Empty linked list");
                    return -1;
                }
                return head.data;
            }
    
            public int getLast() {
                if (size == 0) {
                    System.out.println("Empty linked list");
                    return -1;
                }
                return tail.data;
            }
    
            public int getAt(int idx) {
                if (idx < 0 || idx >= size) {
                    System.out.println("Invalid index");
                    return -1;
                }
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
    
            public void addFirst(int val) {
                Node newNode = new Node(val);
                newNode.next = head;
                head = newNode;
                if (size == 0) {
                    tail = newNode;
                }
                size++;
            }
    
            public void addAt(int idx, int val) {
                if (idx < 0 || idx > size) {
                    System.out.println("Invalid index");
                } else if (idx == 0) {
                    addFirst(val);
                } else if (idx == size) {
                    addLast(val);
                } else {
                    Node temp = head;
                    for (int i = 0; i < idx - 1; i++) {
                        temp = temp.next;
                    }
                    Node newNode = new Node(val);
                    newNode.next = temp.next;
                    temp.next = newNode;
                    size++;
                }
            }
    
            public void removeLast() {
                if (size == 0) {
                    System.out.println("Empty linked list");
                } else if (size == 1) {
                    head = tail = null;
                    size = 0;
                } else {
                    Node temp = head;
                    for (int i = 0; i < size - 2; i++) {
                        temp = temp.next;
                    }
                    tail = temp;
                    tail.next = null;
                    size--;
                }
            }

            public Node mid(Node head){
                Node fast = head;
                Node slow = head.next;
                while (slow!=null) {
                    fast= fast.next;
                    slow=slow.next.next;
    
    
                    
                }
                return fast;
    
            }
    
            public Node getNodeAt(int idx, Node head){
                Node temp = head;
                for(int i=0;i<idx;i++){
                    temp= temp.next;
    
    
                }
                return temp;
            }
    
            public void IterativReverseLL(Node head){
                int l= 0;
                int r =size-1;
                
                while (l<=r) {
                    Node left = getNodeAt(l, head);
                
    
                Node right = getNodeAt(r, head);

                int temp = left.data;
                left.data= right.data;
                right.data= temp;
                l++;
                r--;

                    
                }

                
    
                
                
            }



            public Node reversePointer(Node head){
                Node curr=head;
                Node prev= null;
                Node next= null;
    
                while(curr !=null){
                    next=curr.next;
                    curr.next=prev;
                    prev =curr;
                    curr= next;
    
    
                }
                return prev;
    
            }
    
            public void removeAt(int idx){
                if(idx<0||idx>=size){
                    System.out.println("invalid argument");
    
    
                }
                else if(idx==0){
                    removeFirst();
                    
                }
                else if(idx==size-1){
                    removeLast();
                }
                else{
                    Node temp= head;
                    for(int i=0;i<idx-1;i++){
                        temp = temp.next;

                    }
                    temp.next =temp.next.next;
                    size--;
                }
            }
        
        }

       



       
    

    public static void main (String []args){


        
    }
    
}
}
