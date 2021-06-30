package Stacks;

import java.util.EmptyStackException;

public class ArrayStack 
{
  private StudentDetails[] stack;
  private int top;


  public ArrayStack(int size)
  {
    stack = new StudentDetails[size]; 
  }

  public void Push(StudentDetails studentDetails)
  {
    if(top == stack.length)
    {
      StudentDetails[] newArr = new StudentDetails[2 * stack.length];
      System.arraycopy(stack, 0, newArr, 0, stack.length);
      stack = newArr;

    }

    stack[top++] = studentDetails;
  }

  public StudentDetails Pop()
  {
      if(isEmpty())
      {
        throw new EmptyStackException();
      }
      StudentDetails studentDetails = stack[--top];
      stack[top] = null;
      return studentDetails;
  }

  public StudentDetails Peek()
  {
    if(isEmpty())
    {
      throw new EmptyStackException();
    }

    return stack[top -  1];
  }

  public int Size()
  {
    return top;
  }

  public boolean isEmpty()
  {
    return top == 0;
  }

  public void DisplayStack()
  {
    for(int i = top - 1; i >= 0; i-- )
    {
      System.out.println(stack[i]);
    }
  }


}
