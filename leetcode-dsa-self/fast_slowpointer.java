// Problem Statement
// Given the head of a singly linked list, return the middle node.
// If there are two middle nodes, return the second one.
class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
class SingleLinkedList {
    Node head;

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete first node
    public void deleteAtBeginning() {
        if (head != null) {
            head = head.next;
        }
    }
    public void display() { 
        Node temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " -> "); 
            temp = temp.next; 
        } 
        System.out.println("null"); 
    }
    public int findmidnode(){
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
}

public class fast_slowpointer {
    public static void main(String[] args) {
        SingleLinkedList list1=new SingleLinkedList();
        list1.insertAtBeginning(10);
        list1.insertAtBeginning(20);
        list1.insertAtBeginning(30);
        list1.insertAtBeginning(40);
        list1.insertAtBeginning(50);
        list1.insertAtBeginning(60);
        System.out.println(list1.findmidnode());
    }    
}
