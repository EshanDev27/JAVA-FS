package LinkedList;

public class sll {
    node head;
    static int size = 0;
    class node{
        int data;
        node next;

        node(int data){
            this.data = data;
        }
    }

    public void printll(sll list) {
        node temp = list.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public void addFirst(int data){
        node temp = new node(data);
        if(head == null){
            head = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void addLast(int data){
        node temp = new node(5);
        node traverse = head;
        if(head == null){
            head = temp;
            size++;
            return;
        }

        if(head.next == null){
            head.next = temp;
            temp.next = null;
            size++;
            return;
        }

        while(traverse.next != null){
            traverse = traverse.next;
        }
        traverse.next = temp;

        size++;
    }

    public void addBetween(int idx, int data){
        node temp = head;
        node newnode = new node(data);
        int i = 0;
        while(i <= idx - 1){
            temp = temp.next;
//            System.out.print(temp.data + " ");
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

        size++;
    }

    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public void deleteLast(){
        node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
            temp.next = null;
        size--;
    }

    public void deleteBetween(int idx){
        node temp = head;
        int i = 0;
        while (temp != null && i < idx - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }


    public static void main(String[] args) {
        sll list = new sll();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(5);
        list.addFirst(25);
        list.addFirst(35);
        list.addLast(5);
        list.addBetween(2, 15);
        list.printll(list);
        System.out.println("Size of LinkedList is : " + size);
        System.out.println("-------------------");
        list.deleteBetween(2);
        list.printll(list);
        System.out.println("Size of LinkedList is : " + size);
    }
}