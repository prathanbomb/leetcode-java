public class MergeNodesInBetweenZeros {
    public static ListNode mergeNodes(ListNode head) {
        ListNode temp = new ListNode();
        ListNode ans = temp;
        head = head.next;
        while (head != null) {
            if (head.val != 0) {
                temp.val += head.val;
            } else {
                if (head.next != null) {
                    temp.next = new ListNode();
                    temp = temp.next;
                }
            }
            head = head.next;
        }
        return ans;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println();
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
