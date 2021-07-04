package Queues;

public class Main 
{
  public static void main(String[] args)
  {
    StudentDetails vishnu = new StudentDetails("Vishnu");
    StudentDetails obi = new StudentDetails("Obi-Wan Kenobi");
    StudentDetails grogu = new StudentDetails("Grogu");
    StudentDetails windu = new StudentDetails("Windu");
    StudentDetails anakin = new StudentDetails("Anakin");

    ArrayQueue queue = new ArrayQueue(8);

    queue.Enqueue(vishnu);
    queue.Enqueue(obi);
    queue.Enqueue(grogu);
    queue.Enqueue(windu);
    queue.Enqueue(anakin);

    queue.DisplayQueue();
    
    queue.Dequeue();
    queue.Dequeue();
    System.out.println("Queue after 2 dequeues: ");
    queue.DisplayQueue();

    System.out.println("Peek element is: ");
    System.out.println(queue.Peek());





  }
  
}
