package LinkedList;

public class Main
{
  public static void main(String[] args)
  {
    StudentDetails vishnu = new StudentDetails("Vishnu", 21);
    StudentDetails obi = new StudentDetails("Obi-Wan Kenobi", 60);
    StudentDetails grogu = new StudentDetails("Grogu", 50);
    StudentDetails windu = new StudentDetails("Windu", 45);
    StudentDetails anakin = new StudentDetails("Anakin", 52);

    LinkedList list = new LinkedList();
    list.addToFront(vishnu);
    list.addToFront(obi);
    list.addToFront(grogu);
    list.addToFront(windu);
    list.addToFront(anakin);

    System.out.println(list.GetSize());

    System.out.println(list.IsEmpty());

    list.displayList();

    list.DeleteNodeFromFront();
    System.out.println(list.GetSize());
    list.displayList();



  }
  
}
