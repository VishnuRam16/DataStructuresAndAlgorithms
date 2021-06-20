package LinkedList;

public class LinkedList 
{
  private Node head;
  private int size;

  public void addToFront(StudentDetails studentDetails)
  {
    Node node = new Node(studentDetails);
    node.setNext(head);
    head = node;
    size++;

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

  public int GetSize()
  {
    return size;
  }

  public Boolean IsEmpty()
  {
    if(head == null)
    {
      return true;
    }
    else
    {
    return false;
    }
  }

  public Node DeleteNodeFromFront()
  {
    if(IsEmpty())
    {
      return null;
    }

    Node deletedNode = head;
    head = head.getNext();
    size--;
    return deletedNode;
  }

}
