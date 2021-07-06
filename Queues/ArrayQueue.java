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
      if(Size() == queue.length)
      {
        int numItems = Size();

        StudentDetails[] newArray = new StudentDetails[2 * queue.length];
        System.arraycopy(queue, front, newArray, 0, queue.length - front);  //copies elements that are behind "front" in a circular queue to the new array
        System.arraycopy(queue, 0, newArray, queue.length - front, back);   //copies elements that are in front of "front" in a circular queue to the new array. 
        queue = newArray;

        front = 0;
        back = numItems;
      }

      queue[back] = studentDetails;
      if(back < queue.length - 1)
      {
      back++;

      }
      else
      {
        back = 0;
      }
      
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
      else if(front == queue.length)
      {
        front = 0;
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
      if(front <= back)
      {
        return back - front;
      }
      else
      {
        return back - front + queue.length;
      }
    }

    public void DisplayQueue()
    {
      if(front <= back)
      {
        for(int i = front; i < back; i++)
        {
          System.out.println(queue[i]);
        }
      } 
      else
      {
        for(int i = front; i < queue.length; i++)
        {
          System.out.println(queue[i]);
        }
        for(int i = 0; i < back; i++)
        {
          System.out.println(queue[i]);
        }
      }
    }

}
