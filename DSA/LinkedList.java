import java.util.HashMap;

public class LinkedList {
  private Node head;
  private Node tail;

  private HashMap<Integer,Node> map;

  private class Node {
    public int val;
    public Node next;
  
      Node(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public LinkedList() {
    this.head = this.tail = null;
    this.map = new HashMap<>();
  }

  public void AddNode(int val) {
    if (!this.map.containsKey(val)) {
      Node n = new Node(val);
      if (this.map.size() == 0) {
        this.head = this.tail = n;
      } else {
        this.tail.next = n;
        this.tail = n;
      }

      this.map.put(val, n);
    }
  }

  public void AddList(int[] nums) {
    if (nums.length == 0) {
      return;
    }

    for (int num : nums) {
      if (!this.map.containsKey(num)) {
        Node n = new Node(num);
        this.map.put(num, n);
        if (this.head == null) {
          this.head = this.tail = n;
          continue;
        }

        this.tail.next = n;
        this.tail = n;
      }
    }
  }

  public void DeleteNode(int val) {
    if (!this.map.containsKey(val)) {
      return;
    }

    if (val == this.head.val) {
      Node temp = this.head;
      this.head = this.head.next;
      temp.next = null;
      this.map.remove(val);
      return;
    }

    Node prev = this.head;
    Node curr = this.head.next;

    while (curr != null) {
      if (curr.val == val) {
        tail = curr == tail ? prev : tail;
        prev.next = curr.next;
        curr.next = null;
        this.map.remove(val);
        return;
      }

      curr = curr.next;
      prev = prev.next;
    }
  }

  private boolean IsNode(int val) {
   return this.map.containsKey(val);
  }

  public int Head() {
    return this.head.val;
  }

  public int GetSize() {
    return this.map.size();
  }

  public void PrintList() {
    Node curr = this.head;
    String output = "";
    while (curr != null) {
      output += String.format("%d ", curr.val);
      curr = curr.next;
    }
    System.out.println(output);
  }

  public static void main(String[] args) {
    System.out.println("running LinkedList");
    LinkedList ll = new LinkedList();
    ll.PrintList();
    ll.AddNode(1);
    int[] nums = {2,3,4,5,6,7};
    ll.AddList(nums);
    ll.PrintList();
    ll.DeleteNode(1);
    ll.DeleteNode(2);
    ll.DeleteNode(5);
    ll.DeleteNode(7);
    System.out.println(String.format("size of list is %d", ll.GetSize()));
    ll.PrintList();
  }
}