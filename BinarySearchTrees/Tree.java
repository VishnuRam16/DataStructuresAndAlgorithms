package BinarySearchTrees;

public class Tree 
{
  private Nodes root;

  public void Insert(int value)
  {
    if(root == null)
    {
      root = new Nodes(value);
    }
    else
    {
      root.Insert(value);
    }
  }

  public void InOrderTraversal()
  {
    if(root != null)
    {
      root.InOrderTraversal();
    }
  }

  public Nodes Get(int value)
  {
    if(root != null)
    {
      return root.Get(value);
    }
    return null;
  }

  public int Min()
  {
    if(root == null)
    {
      return Integer.MIN_VALUE;
    }
    else
    {
      return root.Min();
    }
  }

  public int Max()
  {
    if(root == null)
    {
      return Integer.MAX_VALUE;
    }
    else
    {
      return root.Max();
    }
  }
}
