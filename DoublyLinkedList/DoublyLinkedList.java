package DoublyLinkedList;

public class DoublyLinkedList {
  private Node head;
  private Node tail;
  private int size;

  public void addToFront(StudentDetails studentDetails)
  {
    Node node = new Node(studentDetails);
    node.setNext(head);

    if(head == null)
    {
      tail = node;
    }
    else
    {
      head.setPrevious(node);
    }

    head = node;
    size++;

  }

  public void addToEnd(StudentDetails studentDetails)
  {
    Node node = new Node(studentDetails);

    if(tail == null)
    {
      head = node;
    }
    else
    {
      tail.setNext(node);
      node.setPrevious(tail);
    }

    tail = node;
    size++;
  }

  
  public void displayList()
  {
    Node curr = head;
    System.out.print("Head --> ");
    while(curr!= null)
    {
      System.out.print(curr);
      System.out.print(" <--> ");
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

    if(head.getNext() == null)
    {
      tail = null;
    }
    else
    {
      head.getNext().setPrevious(null);
    }

    Node deletedNode = head;
    head = head.getNext();
    size--;
    return deletedNode;
  }

  public Node DeleteFromEnd()
  {
    if(IsEmpty())
    {
      return null;
    }

    Node deletedNode = tail;

    if(tail.getPrevious() == null)
    {
      head = null;
    }
    else
    {
      tail.getPrevious().setNext(null);
    }

    tail = tail.getPrevious();
    size--;
    deletedNode.setPrevious(null);
    return deletedNode;
  }
}

