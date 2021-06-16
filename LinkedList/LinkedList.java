package LinkedList;

public class LinkedList 
{
  private Node head;

  public void addToFront(StudentDetails studentDetails)
  {
    Node node = new Node(studentDetails);
    node.setNext(head);
    head = node;

  }
  
  public void displayList()
  {
    Node curr = head;
    System.out.print("Head --> ");
    while(curr!= null)
    {
      System.out.print(curr);
      System.out.print(" --> ");
      curr = curr.getNext();

    }
    System.out.println("null");
  }
}
