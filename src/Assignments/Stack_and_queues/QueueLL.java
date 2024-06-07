package Assignments.Stack_and_queues;
import java.util.Scanner;

public class QueueLL {
    public static Node insert (Node rear, Node front){
        Scanner sc = new Scanner(System.in);
        Node temp = new Node();
        temp.data = sc.nextInt();
        if(front==null) {
            rear = temp;
            front = temp;
            return front;
        }
        else{
            rear.next=temp;
            rear=temp;
        }
        return rear;
    }
    public static Node delete (Node rear, Node front){
        if(front==null){
            rear = null;
            System.out.println("Your list is empty");
            return front;
        }
        else {
            System.out.println("Removed: " + front.data);
            front = front.next;
            return front;
        }
    }
    public static void display(Node rear, Node front){
        while(front!=null){
            System.out.println(front.data);
            front = front.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     Node rear = null;
     Node front = null;
        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: insert");
            System.out.println("2: delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    if (front==null) {
                        front = insert(rear, front);
                        rear=front;
                    }
                    else {
                        rear=insert(rear,front);
                    }

                    break;
                case 2:
                    front=delete(rear,front);
                    break;
                case 3:
                    display(rear,front);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
