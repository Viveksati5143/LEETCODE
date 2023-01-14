class Solution {
    public ListNode reverseList(ListNode head){
        return reverseListInt(head,null);
    }            
        private ListNode reverseListInt(ListNode head, ListNode newNode){
            if(head==null) return newNode;
            ListNode next = head.next;
            head.next = newNode;
            return reverseListInt(next, head);
    }
}