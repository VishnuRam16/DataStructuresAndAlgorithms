package HashTables;

public class Hashtable 
{
  private StudentDetails[] hashtable;

  public Hashtable()
  {
    hashtable = new StudentDetails[8];
  }

  private int HashKey(String key)
  {
    return key.length() % hashtable.length;
  }

  public void Put(String key, StudentDetails studentDetails)
  {
    int hashedKey = HashKey(key); 
    if(hashtable[hashedKey] != null)
    {
      System.out.println("Position filled at: " +hashedKey);
    }
    else
    {
      hashtable[hashedKey] = studentDetails;
    }
  }

  public StudentDetails Retrieve(String key)
  {
    int hashedKey = HashKey(key); 
    return hashtable[hashedKey];
  }

  public void DisplayHashTable()
  {
    for(int i =0; i < hashtable.length; i++)
    {
      System.out.println(hashtable[i]);
    }
  }

  
}
