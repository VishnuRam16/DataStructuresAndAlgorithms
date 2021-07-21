package BinarySearchTrees;

public class Main 
{
  public static void main(String[] args)
  {
    Tree tree = new Tree();

    tree.Insert(15);
    tree.Insert(5);
    tree.Insert(10);
    tree.Insert(18);
    tree.Insert(17);
    tree.Insert(1);
    tree.Insert(21);

    tree.InOrderTraversal();
    
    
  }
}
