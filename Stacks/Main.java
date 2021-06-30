package Stacks;

public class Main 
{
  public static void main(String[] args)
  {
    ArrayStack stack = new ArrayStack(8);

    stack.Push(new StudentDetails("Vishnu", 21));
    stack.Push(new StudentDetails("Grogu", 50));
    stack.Push(new StudentDetails("Windu", 45));
    stack.Push(new StudentDetails("Obi-Wan", 40));
    stack.Push(new StudentDetails("Anakin", 35));

    stack.DisplayStack();

    System.out.println("Let us perform a stack operation");
    System.out.println(stack.Pop());

    System.out.println("Let us see the top element");
    System.out.println(stack.Peek());

    System.out.println("Final Stack is: ");
    stack.DisplayStack();
    


  }
}
