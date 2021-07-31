package BinarySearchTrees;

public class Nodes 
{
  private int data;
  private Nodes leftChild;
  private Nodes rightChild;

  public Nodes(int data)
  {
    this.data = data;
  }

  public int GetData() {
    return this.data;
  }

  public void SetData(int data) {
    this.data = data;
  }

  public Nodes GetLeftChild() {
    return leftChild;
  }

  public void SetLeftChild(Nodes leftChild) {
    this.leftChild = leftChild;
  }

  public Nodes GetRightChild() {
    return rightChild;
  }

  public void SetRightChild(Nodes rightChild) {
    this.rightChild = rightChild;
  }

  public void Insert(int value)
  {
      if(value == data) //Does not accept duplicate values
      {
        return;
      }

      if(value < data)
      {
        if(leftChild == null)
        {
          leftChild = new Nodes(value);
        }
        else
        {
          leftChild.Insert(value);
        }
      }
      else
      {
        if(rightChild == null)
        {
          rightChild = new Nodes(value);
        }
        else
        {
          rightChild.Insert(value);
        }
      }
  }

  public void InOrderTraversal()
  {
    if(leftChild != null)
    {
      leftChild.InOrderTraversal();
    }
    System.out.print(data+ ",");
    if(rightChild != null)
    {
      rightChild.InOrderTraversal();
    }

  }

  public Nodes Get(int value)
  {
    if(value == data)
    {
      return this;
    }

    if(value < data)
    {
      if(leftChild != null)
      {
        return leftChild.Get(value);
      }    
    }
    else
    {
      if(rightChild != null)
      {
        return rightChild.Get(value);
      }
    }
    return null;
  }

  public int Min()
  {
    if(leftChild == null)
    {
      return data;
    }
    else
    {
      return leftChild.Min();
    }
  }

  public int Max()
  {
    if(rightChild == null)
    {
      return data;
    }
    else
    {
      return rightChild.Max();
    }
  }


  public String toString() {
    return "Data = " + data;
}

}
