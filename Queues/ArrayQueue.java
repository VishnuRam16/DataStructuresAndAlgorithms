package Queues;

import java.util.NoSuchElementException;

public class ArrayQueue 
{
    private StudentDetails[] queue;
    private int back;
    private int front;

    public ArrayQueue(int size)
    {
      queue = new StudentDetails[size]; 
    }

    public void Enqueue(StudentDetails studentDetails)
    {
      if(back == queue.length)
      {
        StudentDetails[] newArray = new StudentDetails[2 * queue.length];
        System.arraycopy(queue, 0, newArray, 0, queue.length);
        queue = newArray;
      }

      queue[back] = studentDetails;
      back++;
    }

    public StudentDetails Dequeue()
    {
      if(Size() == 0)
      {
          throw new NoSuchElementException();
      }
      StudentDetails studentDetails = queue[front];
      queue[front] = null;
      front++;

      if(Size() == 0)
      {
        front = 0;
        back = 0;
      }

      return studentDetails;
    }

    public StudentDetails Peek()
    {
      if(Size() == 0)
      {
          throw new NoSuchElementException();
      }

      return queue[front];
    }

    public int Size()
    {
      return back - front;
    }

    public void DisplayQueue()
    {
        for(int i = front; i < back; i++)
        {
          System.out.println(queue[i]);
        }
    }

}
