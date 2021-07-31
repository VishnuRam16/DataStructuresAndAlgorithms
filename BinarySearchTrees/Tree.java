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

  public void PreOrderTraversal()
  {
    if(root != null)
    {
      root.PreOrderTraversal();
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

  public void Delete(int value)
  {
    root = Delete(root, value);
  }

  private Nodes Delete(Nodes subTreeRoot, int value)
  {
      if(subTreeRoot == null)
      {
        return subTreeRoot;
      }

      if(value < subTreeRoot.GetData())
      {
        subTreeRoot.SetLeftChild(Delete(subTreeRoot.GetLeftChild(), value));
      }
     else if(value > subTreeRoot.GetData())
      {
        subTreeRoot.SetRightChild(Delete(subTreeRoot.GetRightChild(), value));
      }
      else
      {
        if(subTreeRoot.GetLeftChild() == null)
        {
          return subTreeRoot.GetRightChild();
        }
        else if(subTreeRoot.GetRightChild() == null)
        {
          return subTreeRoot.GetLeftChild();
        }

        //Implementation if subtree has two nodes:
        //We take the lowest value from the right subtree(highest from left subtree) and replace the root of the subtree. Then we delete the lowest value(highest from left subtree) from its original position. 
        subTreeRoot.SetData(subTreeRoot.GetRightChild().Min());
        subTreeRoot.SetRightChild(Delete(subTreeRoot.GetRightChild(), subTreeRoot.GetData()));
      }
      
      return subTreeRoot;
  }
}
