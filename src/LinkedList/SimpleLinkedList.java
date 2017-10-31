package LinkedList;

public class SimpleLinkedList {

    SimpleNode head;

    static class SimpleNode{

        int data;
        SimpleNode next;

        SimpleNode(int x){
            data = x;
            next = null;
        }
    }

    public static void main(String[] args){


        SimpleLinkedList linkedList = new SimpleLinkedList();

        linkedList.head = new SimpleNode(10);
        SimpleNode second = new SimpleNode(20);
        SimpleNode third = new SimpleNode(30);

        linkedList.head.next = second;
        second.next = third;

        linkedList.printList();

    }

    private void printList() {
        SimpleNode node = head;

        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

}
