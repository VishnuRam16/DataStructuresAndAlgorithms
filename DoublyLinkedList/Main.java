package DoublyLinkedList;

public class Main 
{
  public static void main(String[] args)
  {
    StudentDetails vishnu = new StudentDetails("Vishnu", 21);
    StudentDetails obi = new StudentDetails("Obi-Wan Kenobi", 60);
    StudentDetails grogu = new StudentDetails("Grogu", 50);
    StudentDetails windu = new StudentDetails("Windu", 45);
    StudentDetails anakin = new StudentDetails("Anakin", 52);
    
    DoublyLinkedList list = new DoublyLinkedList();

    list.addToFront(vishnu);
    list.addToFront(obi);
    list.addToFront(grogu);
    list.addToFront(windu);
    list.addToFront(anakin);

    list.displayList();
    System.out.println(list.GetSize());

    StudentDetails hansolo = new StudentDetails("Hansolo", 61);

    list.addToEnd(hansolo);

    list.displayList();
    System.out.println(list.GetSize());

    list.DeleteNodeFromFront();
    list.displayList();
    System.out.println(list.GetSize());

    list.DeleteFromEnd();
    list.displayList();
    System.out.println(list.GetSize());


    
  }
}
