package DoublyLinkedList;

public class Node 
{
  private StudentDetails studentDetails;
  private Node next;
  private Node previous;

  public Node(StudentDetails studentDetails)
  {
    this.studentDetails = studentDetails;
  }

  public StudentDetails getStudentDetails()
  {
    return studentDetails;
  }

  public void setStudentDetails(StudentDetails studentDetails)
  {
    this.studentDetails = studentDetails;
  }

  public Node getNext()
  {
    return next;
  }

  public void setNext(Node next)
  {
    this.next = next;
  }

  public Node getPrevious()
  {
    return previous;
  }

  public void setPrevious(Node previous)
  {
    this.previous = previous;
  }

  public String toString()
  {
    return studentDetails.toString();
  }
  
}
