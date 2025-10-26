// https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/remove-consecutive-duplicates-sorted-list/problem

public static SinglyLinkedListNode deleteDuplicates(SinglyLinkedListNode head) {
   if(head == null) return null;
   
   SinglyLinkedListNode curr = head;
   
   while(curr != null) {
       while(curr.next != null && curr.data == curr.next.data) {
           curr.next = curr.next.next;
       }
    
       curr = curr.next;
   }
   
   return head;
}
