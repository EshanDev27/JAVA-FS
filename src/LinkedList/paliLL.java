package LinkedList;

import java.util.ArrayList;
import java.util.Objects;

public class paliLL {
    private node head;
    private int size = 0;
    class node{
        int data;
         node next;

        node(int data){
            this.data = data;
        }
    }

    public void printll(node head) {
         node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addFirst(int data){
         node temp = new  node(data);
        if(head == null){
            head = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void addLast(int data){
         node temp = new  node(5);
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
         node newnode = new  node(data);
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

    public boolean isPalindrome(paliLL list){
        node temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp != null){
            arr.add(temp.data);
            temp = temp.next;
        }
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (!Objects.equals(arr.get(i), arr.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //Better Logic
    public boolean isPaliBetter(paliLL list)
    {
        if(list.head == null || list.head.next == null){
            return true;
        }
        node middle = FindMiddle(list);
        node secondlist = rev(middle);

        node FirstList = list.head;
        while(secondlist != null){
            if(secondlist.data != FirstList.data){
                return false;
            }
            secondlist = secondlist.next;
            FirstList = FirstList.next;
        }
        return true;
    }

    private node rev(node head) {
        node prev = head;
        node current = head.next;
        node next;
        while(current != null){
            next = current.next;
            current.next = prev;

            //Update
            prev = current;
            current = next;
        }

        head.next = null;
        head = prev;
        return head;
    }

    private node FindMiddle(paliLL list) {
        node temp = list.head;
//        System.out.println(size);
        int i = 0;
        while(i < size / 2){
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public static void main(String[] args) {
        paliLL list = new paliLL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printll(list.head);
        System.out.println();
//        System.out.println(list.isPalindrome(list));
//        list.head = list.rev(list.head);
//        node newnode = list.FindMiddle(list);
//        list.printll(newnode);
        System.out.println(list.isPaliBetter(list));
    }
}