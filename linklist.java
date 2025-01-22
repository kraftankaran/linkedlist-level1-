// import java.util.*;

// public class linklist {

//     public static class Node {

//         Integer data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next =null;
//         }
    
        
//     }

//     public  static class LinkList {

//         Node head;
//         Node tail;
//         int size;

//         public LinkList(){
//             this.head =null;
//             this.tail=null;
//             this.size=0;

//         }

//         public void addLast(int v){
//             Node temp = new Node(v);
//             temp.data= v;
//             temp.next= null;
//             if(size ==0){
                
//                 head =tail= temp;
//                 size ++;
                

//             }else{
           

//                 tail.next =temp; 
//                 size++;
//             }

//         }

//         public int size(){
//             return size;
//         }
//         public void display(Node head){
//             if(size==0){
//                 System.out.println("empty linklist");
                
//             }
//             Node temp = head;

//             while (temp!=null) {
//                 System.out.println(temp.data);
//                 temp= temp.next;



                
//             }
//             System.out.println();

//         }
//         public void removeFirst(){
//             if(size==0){
//                 System.out.println(
//                     "empty linklistt"
//                 );

//             }
//             else if(size==1){
//                 head= tail= null;
//                 size=0;
//             }
//             else{
//                 head = head.next;
//                 size--;
//             }
//         }

//         public int getFirst(){
//             if(size==0){
//                 System.out.println("empty");
//                 return -1;
//             }else{
//                 return head.data;
//             }
//         }
//         public int getLast()
        
//         {
//             if(size==0){
//                 System.out.println("empty linklis");
//                 return -1;
//             }
//             else
//             {
//                return tail.data;
                    
//             }
//         }
//         public int getAt(int idx){
//             if(idx<0 || idx>=size){
//                 System.out.println("not valid index"
//                 );
//                 return -1;
//             }
//             else if(size==0){
//                 System.out.println("list is empty");
//                 return -1;

//             }else
//             {
//                 Node temp = head;
//                 for(int i =0;i<idx;i++){
//                     temp = temp.next;

//                 }
//                 return temp.data;
//             }
          

//         }


//         public void addFirst(int val){
//             Node newnode = new Node(val);
//             newnode.next= head;
//             head= newnode;
//             if(size==0){
//                 tail = newnode;

                
//             }
//             size++;

//         }

//         public void addAt(int idx, int val){
//             Node newnNode = new Node(val);
//             if(idx<=0||idx >size){
//                 System.out.println("invalid arguments");

//             }else if(idx==0){
//                 addFirst(val);

//             }else if(idx == size){
//                 addLast(val);

//             }else
//             {
//                 Node temp = head;

//                 for(int i=0;i<idx-1;i++){
//                     temp =temp.next;

//                 }
//                 newnNode.next= temp.next;
//                 temp.next=newnNode;
//                 size++;
                


//             }

//         }

//         public void removeLast(){
//             if(size==0){
//                 System.out.println(
//                     "empty list"
//                 );

//             }else if(size==1){
//                 head = tail =null;
//                 size=0;
                


//             }else{
//                 // Node temp = head;
//                 // while (temp.next.next!=null) {
//                 //     temp= temp.next;
                    
//                 // }
//                 // temp=temp.next;
//                 // tail= temp;
//                 // temp.next =null;
                

//                 Node temp = head;
//                 for(int i=0;i<size-2;i++){
//                     temp = temp.next;
//                 }
//                 tail= temp;
//                 temp.next= null;
//                 size--;
//             }
//             size--;

//         }
        
        
    
        
//     }
//     public static void main(String[] args) {
//         LinkList list  = new LinkList();
//         list.addAt(0, 1);
//         System.out.println(list.getFirst());
//     }
    




    
// }


import java.util.*;

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
        int size;

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
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display(); // Output: 10 -> 20 -> 30 -> null

        list.addFirst(5);
        list.display(); // Output: 5 -> 10 -> 20 -> 30 -> null

        list.addAt(2, 15);
        list.display(); // Output: 5 -> 10 -> 15 -> 20 -> 30 -> null

        list.removeFirst();
        list.display(); // Output: 10 -> 15 -> 20 -> 30 -> null

        list.removeLast();
        list.display(); // Output: 10 -> 15 -> 20 -> null

        System.out.println("First element: " + list.getFirst()); // Output: 10
        System.out.println("Last element: " + list.getLast());   // Output: 20
        System.out.println("Element at index 1: " + list.getAt(1)); // Output: 15
    }
}

