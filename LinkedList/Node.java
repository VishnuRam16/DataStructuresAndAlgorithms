package LinkedList;

public class Node 
{
  private StudentDetails studentDetails;
  private Node next;

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

  public String toString()
  {
    return studentDetails.toString();
  }


}
