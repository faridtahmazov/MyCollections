package list;

public class MyLinkedList {

    public Node head;

    static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    public MyLinkedList add(MyLinkedList list, int data){
        Node newNode = new Node(data);

        if (list.head == null){
            list.head = newNode;
        }else {
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }

            last.next = newNode;
        }
        return list;
    }



    public void printLinkedList(MyLinkedList linkedList){
        String space;
        Node currNode = linkedList.head;

        System.out.print("[");
        while (currNode!=null){
            System.out.print(currNode.data);
            currNode = currNode.next;

            if (currNode==null){
                space="";
                break;
            }else {
                space = ", ";
            }
            System.out.print(space);
        }
        System.out.println("]");
    }
}
