package LeetCode;

import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int d){val = d;}
    ListNode(int d, ListNode next){
        val = d;
        this.next = next;
    }

    int get(){ return val;}
    ListNode getNext(){
    if(next != null)
        {
            return next;
        }
    return null;
    }
}
public class MergingTwoSortedArrays {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(4);
        ListNode l1 = new ListNode(2, list1);
        ListNode l2 = new ListNode(1, l1);

        ListNode list2 = new ListNode(4);
        ListNode l3 = new ListNode(3, list2);
        ListNode l4 = new ListNode(1, l3);

//        System.out.println((l4.getNext()).val);
        ListNode ans = mergeTwoLists(l2, l4);
       print(ans);
    }

    static void print(ListNode list1){
        ListNode temp = list1;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }else if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        ListNode t1 = list1;
        ListNode t2 = list2;

        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                dummy.next = t1;
                t1 = t1.next;
            }else{
                dummy.next = t2;
                t2 = t2.next;
            }
            dummy = dummy.next;
        }

        if(t1 != null){
            while(t1 != null){
            dummy.next = t1;
            t1 = t1.next;
            dummy = dummy.next;
            }
        }

        if(t2 != null){
            while(t2 != null){
                dummy.next = t2;
                t2 = t2.next;
                dummy = dummy.next;
            }
        }

        return head.next;
    }
}